// IOStyledEditor.java
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.io.*;

// An extension of StyledEditor that adds document serialization
public class IOStyledEditor extends StyledEditor {

  public static void main(String[] args) {
    IOStyledEditor te = new IOStyledEditor();
    te.setVisible(true);
  }

  // Provide a new open action
  protected Action getOpenAction() {
    if (inAction == null)
      inAction = new InAction();
    return inAction;
  }

  // Provide a new save action
  protected Action getSaveAction() {
    if (outAction == null)
      outAction = new OutAction();
    return outAction;
  }

  private Action inAction;
  private Action outAction;

  // An action that saves the document as a serialized object
  class OutAction extends AbstractAction {
    public OutAction() {
      super("Serialize Out", new ImageIcon("icons/save.gif"));
    }

    public void actionPerformed(ActionEvent ev) {
      String filename = JOptionPane.showInputDialog(
        IOStyledEditor.this, "Enter Filename");
      if (filename == null)
        return;

      FileOutputStream writer = null;
      try {
        Document doc = getTextComponent().getDocument();
        writer = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(writer);
        oos.writeObject(doc); // write out the Document
      }
      catch (IOException ex) {
        JOptionPane.showMessageDialog(SimpleEditor.this,
        "File Not Saved", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
      finally {
        if (writer != null) {
          try {
            writer.close();
          } catch (IOException x) {}
        }
      }
    }
  }

  // An action that reads the document as a serialized object
  class InAction extends AbstractAction {
    public InAction() {
      super("Serialize In", new ImageIcon("icons/open.gif"));
    }
    public void actionPerformed(ActionEvent ev) {
      String filename = JOptionPane.showInputDialog(
        IOStyledEditor.this, "Enter Filename");
      if (filename == null)
        return;
      FileInputStream reader = null;
      try {
        reader = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(reader);
        Object o = ois.readObject(); // read the document
        getTextComponent().setDocument((Document)o);
      }
      catch (IOException ex) {
        JOptionPane.showMessageDialog(SimpleEditor.this,
        "File Input Error", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
      catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(SimpleEditor.this,
        "Class Not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
      finally {
        if (reader != null) {
          try {
            reader.close();
          } catch (IOException x) {}
        }
      }
    }
  }
}
