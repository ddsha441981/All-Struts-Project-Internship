// OffsetTest.java
//
import javax.swing.*;
import javax.swing.text.*;

public class OffsetTest {
  public static void main(String[] args) {
 
    // Create a JTextField with three lines of text
    JTextArea ta = new JTextArea();
    ta.setLineWrap(true);
    ta.append("The first line.\n");
    ta.append("Line Two!\n");
    ta.append("This is the 3rd line of the document.");

    // Print some results . . .
    try {
      System.out.println(ta.getLineEndOffset(0) + " (end of line 0)");
      System.out.println(ta.getLineStartOffset(1) + " (start of line 1)");
      System.out.println(ta.getLineOfOffset(20) +
                         " (line containing position 20)");

      int theEnd = ta.getLineEndOffset(2);
      System.out.println(theEnd + " (end of last line)");
      System.out.println(ta.getText(ta.getLineEndOffset(2), 2));
    }
    catch (BadLocationException ex) { System.out.println("BAD!"); }

    // Layout . . .
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.setContentPane(ta);
    f.setSize(150, 150);
    f.setVisible(true);
  }
}
