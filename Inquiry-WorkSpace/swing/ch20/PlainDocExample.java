// PlainDocExample.java
//
import javax.swing.text.*;

public class PlainDocExample {
  public static void main(String[] args) {
    try {

      // Dump an empty document
      PlainDocument doc = new PlainDocument();
      doc.dump(System.out);
      System.out.println("==========");

      // Add 3 lines of text, dump again
      doc.insertString(0, "Line One\n", null);
      doc.insertString(doc.getLength(), "Line Two\n", null);
      doc.insertString(doc.getLength(), "Line Three", null);
      doc.dump(System.out);
      System.out.println("==========");

      // Remove "One/Line Two/Line ", dump again
      doc.remove(5, 18);
      doc.dump(System.out);
    } catch (BadLocationException ex) {}
  }
}
