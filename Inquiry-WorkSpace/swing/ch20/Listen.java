// Listen.java
//
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.undo.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

// Example showing Undo & Document Events from Document
public class Listen extends JFrame
 implements DocumentListener, UndoableEditListener {

  // Set up a little GUI
  public Listen() {

    // TextArea for entering text & generating events
    editor = new JTextArea();
    editor.getDocument().addDocumentListener(this);
    editor.getDocument().addUndoableEditListener(this);

    // TextArea for showing each event as it is fired
    log = new JTextArea();
    log.setEditable(false);

    // Lay out the frame
    JScrollPane scroll1 = new JScrollPane(editor);
    JScrollPane scroll2 = new JScrollPane(log);
    getContentPane().setLayout(new GridLayout(2,1));
    getContentPane().add(scroll1);
    getContentPane().add(scroll2);

    // Add a menu with undo/redo options (just for the most recent edit to keep
    // things simple)
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Edit");
    undoItem = new JMenuItem("Undo");
    redoItem = new JMenuItem("Redo");
    bar.add(menu);
    menu.add(undoItem);
    menu.add(redoItem);
    updateMenu();

    // Call edit.undo() and update menu when undo is selected
    undoItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        edit.undo();
        updateMenu();
      }
    });

    // Call edit.redo() and update menu when redo is selected
    redoItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        edit.redo();
        updateMenu();
      }
    });
    setJMenuBar(bar);
    setSize(410, 400);
  }

  // Dump a DocumentEvent to the logging text area
  protected void showDocEvent(DocumentEvent ev) {
    StringBuffer buf = new StringBuffer(100);
    buf.append(ev.getType());
    buf.append(" offset:");
    buf.append(ev.getOffset());
    buf.append(" length:");
    buf.append(ev.getLength());

    // Show any ElementChanges that were provided
    Element root = editor.getDocument().getDefaultRootElement();
    DocumentEvent.ElementChange chg = ev.getChange(root);
    if (chg == null) {
      buf.append(" <NO ELEMENT CHANGES>");
    }
    else {
      buf.append(" Changes (Index/Add/Rem):");
      buf.append(chg.getIndex());
      buf.append("/");
      buf.append(chg.getChildrenAdded().length);
      buf.append("/");
      buf.append(chg.getChildrenRemoved().length);
    }
    buf.append("\n");
    log.append(buf.toString());
  }

  // Implement the DocumentListener interface using our showDocEvent() method
  public void changedUpdate(DocumentEvent ev) {
    showDocEvent(ev);
  }

  public void insertUpdate(DocumentEvent ev) {
    showDocEvent(ev);
  }

  public void removeUpdate(DocumentEvent ev) {
    showDocEvent(ev);
  }

  // Show the UndoableEdits as they are fired. Also, update the menu.
  public void undoableEditHappened(UndoableEditEvent ev) {
    StringBuffer buf = new StringBuffer(100);
    edit = ev.getEdit();
    buf.append("UndoableEdit:");
    buf.append(edit.getPresentationName());
    buf.append("\n");
    log.append(buf.toString());
    updateMenu();
  }

  // Set menu choices based on state of the current edit.
  protected void updateMenu() {
    if (edit != null) {
      undoItem.setEnabled(edit.canUndo());
      redoItem.setEnabled(edit.canRedo());
      undoItem.setText(edit.getUndoPresentationName());
      redoItem.setText(edit.getRedoPresentationName());
    }
    else {
      undoItem.setEnabled(false);
      redoItem.setEnabled(false);
      undoItem.setText("Undo");
      redoItem.setText("Redo");
    }
  }

  private UndoableEdit edit;
  private JTextArea editor;
  private JTextArea log;
  private JMenuItem undoItem;
  private JMenuItem redoItem;

  // Test this class
  public static void main(String[] args) {
    JFrame f = new Listen();
    f.addWindowListener(new BasicWindowMonitor());
    f.setVisible(true);
  }
}
