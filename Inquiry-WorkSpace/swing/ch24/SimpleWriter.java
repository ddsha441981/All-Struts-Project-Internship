// SimpleWriter.java
//

import javax.swing.text.*;
import java.io.*;
import java.awt.*;

public class SimpleWriter extends AbstractWriter {
  public SimpleWriter(Writer w, Document d) {
    super(w, d);
    setLineLength(80);
    setIndentSpace(4);
  }

  // Write the document by iterating over the elements and printing the
  // element name & attributes.  If the element is a leaf, we also print
  // its text.
  protected void write() throws IOException, BadLocationException {
    ElementIterator it = getElementIterator();

    Element e = it.first();
    while (e != null) {
      write("<" + e.getName());
      writeAttributes(e.getAttributes());
      write(">");

      if (e.isLeaf()) {
        text(e);
      }
      write(NEWLINE);
      e = it.next();
    }
  }

  // A simple test program
  public static void main(String[] args) {
    DefaultStyledDocument doc = new DefaultStyledDocument();

    try {
      // Create some simple attributed text
      SimpleAttributeSet attrs1 = new SimpleAttributeSet();
      StyleConstants.setBold(attrs1, true);
      StyleConstants.setItalic(attrs1, true);
      doc.insertString(0, "Line 2\n", attrs1);

      SimpleAttributeSet attrs2 = new SimpleAttributeSet();
      StyleConstants.setForeground(attrs2, Color.black);
      StyleConstants.setBackground(attrs2, Color.gray);
      doc.insertString(0, "Line 1\n", attrs2);

      // Write out the document
      FileWriter out = new FileWriter("test.txt");
      SimpleWriter sw = new SimpleWriter(out, doc);
      sw.write();
      out.close();
    }
    catch (BadLocationException ex) {ex.printStackTrace();}
    catch (IOException ex) {ex.printStackTrace();}
  }
}
