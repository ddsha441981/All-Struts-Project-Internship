// PositionExample.java
//
import javax.swing.text.*;

public class PositionExample {
  public static void main(String[] args) {
    try {

      // Create a document with some initial text
      PlainDocument doc = new PlainDocument();
      doc.insertString(0, "One Three Four", null);

      // Create a Position starting at "Three"
      Position pos = doc.createPosition(4);
      int offset = pos.getOffset();
      System.out.println("Offset Before: " + offset);
      System.out.println(doc.getText(0, doc.getLength()));
      for (int i=0;i<offset;i++)
        System.out.print(" ");
      System.out.println("* <- Position before\n");

      // Add some text before the Position
      doc.insertString(4, "Two ", null);

      // Offset has shifted due to the insertion
      offset = pos.getOffset();
      System.out.println("Offset After: " + offset);
      System.out.println(doc.getText(0, doc.getLength()));
      for (int i=0;i<offset;i++)
        System.out.print(" ");
      System.out.println("* <- Position after");
    } catch (BadLocationException ex) {}
  }
}
