// TabStopExample.java
//
import javax.swing.text.*;
import javax.swing.*;

// Show how the different TabStop alignment values work.
public class TabStopExample {
  public static void main(String[] args) {
    // Create TabStops with the different alignments

    TabStop bar = new TabStop(100, TabStop.ALIGN_BAR, TabStop.LEAD_NONE);
    TabStop center = new TabStop(100, TabStop.ALIGN_CENTER, TabStop.LEAD_NONE);
    TabStop decimal= new TabStop(100, TabStop.ALIGN_DECIMAL, TabStop.LEAD_NONE);
    TabStop left = new TabStop(100, TabStop.ALIGN_LEFT, TabStop.LEAD_NONE);
    TabStop right = new TabStop(100, TabStop.ALIGN_RIGHT, TabStop.LEAD_NONE);

    // Create a JTextPane to show tabs in
    JTextPane tp = new JTextPane();
    StyledDocument doc = tp.getStyledDocument();
    SimpleAttributeSet a = new SimpleAttributeSet();

    TabSet tabs;
    int offset;

    // Insert text with each TabStop value
    try {
      offset = doc.getLength();
      doc.insertString(doc.getLength(), "\tBar\n", null);
      tabs = new TabSet(new TabStop[] {bar});
      StyleConstants.setTabSet(a, tabs);
      doc.setParagraphAttributes(offset, 1, a, false);

      offset = doc.getLength();
      doc.insertString(offset, "\tCentered\n", null);
      tabs = new TabSet(new TabStop[] {center});
      StyleConstants.setTabSet(a, tabs);
      doc.setParagraphAttributes(offset, 1, a, false);

      offset = doc.getLength();
      doc.insertString(doc.getLength(), "\t1234.99\n", null);
      tabs = new TabSet(new TabStop[] {decimal});
      StyleConstants.setTabSet(a, tabs);
      doc.setParagraphAttributes(offset, 1, a, false);

      offset = doc.getLength();
      doc.insertString(doc.getLength(), "\tLeft\n", null);
      tabs = new TabSet(new TabStop[] {left});
      StyleConstants.setTabSet(a, tabs);
      doc.setParagraphAttributes(offset, 1, a, false);

      offset = doc.getLength();
      doc.insertString(doc.getLength(), "\tRight\n", null);
      tabs = new TabSet(new TabStop[] {right});
      StyleConstants.setTabSet(a, tabs);
      doc.setParagraphAttributes(offset, 1, a, false);
    }
    catch (BadLocationException ex) {}

    // Display it
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.setSize(200, 110);
    f.setContentPane(tp);
    f.setVisible(true);
  }
}
