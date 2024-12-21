// Diagnostic.java
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class Diagnostic {
  // Create new new Diagnostic display using a black JTextPane
  public Diagnostic() {
    pane = new JTextPane();
    pane.setBackground(Color.black);
    pane.setEditable(false);
  }

  // Show an informational message (green, plain text)
  public void showInfo(String msg) {
    SimpleAttributeSet attrs = new SimpleAttributeSet();
    StyleConstants.setForeground(attrs, Color.green);
    showMsg(msg, attrs);
  }

  // Show a warning message (yellow, italic text)
  public void showWarning(String msg) {
    SimpleAttributeSet attrs = new SimpleAttributeSet();
    StyleConstants.setForeground(attrs, Color.yellow);
    StyleConstants.setItalic(attrs, true);
    showMsg(msg, attrs);
  }

  // Show an error message (red, bold/italic text)
  public void showError(String msg) {
    SimpleAttributeSet attrs = new SimpleAttributeSet();
    StyleConstants.setForeground(attrs, Color.red);
    StyleConstants.setItalic(attrs, true);
    StyleConstants.setBold(attrs, true);
    showMsg(msg, attrs);
  }

  // Return the visual component to be displayed
  public Component getComponent() { return pane; }

  // Show a text message using the specified AttributeSet
  protected void showMsg(String msg, AttributeSet attrs) {
    Document doc = pane.getDocument();
    msg += "\n";
    try {
      doc.insertString(doc.getLength(), msg, attrs);
    } catch (BadLocationException ex) { ex.printStackTrace(); }
  }

  private JTextPane pane;

  // A sample test program
  public static void main(String[] args) {
    Diagnostic diag = new Diagnostic();
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.getContentPane().add(diag.getComponent());
    f.setSize(300,200);
    f.setVisible(true);

    // Display a few messages...
    diag.showInfo("System normal");
    diag.showWarning("Disk space low");
    diag.showError("Out of memory");
    diag.showError("Program performed an illegal operation");
    diag.showInfo("System normal");
  }
}
