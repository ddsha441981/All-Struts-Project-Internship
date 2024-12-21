// FixedLengthPlainDocument.java
//
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.text.*;

// An extension of PlainDocument that restricts the length of the content it
// contains.
public class FixedLengthPlainDocument extends PlainDocument {

  // Create a new document with the given max length
  public FixedLengthPlainDocument(int maxLength) {
    this.maxLength = maxLength;
  }

  // If this insertion would exceed the maximum document length, we "beep" and do
  // nothing else. Otherwise, super.insertString() is called.
  public void insertString(int offset, String str, AttributeSet a)
  throws BadLocationException {
    if (getLength() + str.length() > maxLength) {
      Toolkit.getDefaultToolkit().beep();
    }
    else {
      super.insertString(offset, str, a);
    }
  }

  private int maxLength;
}
