// FixedLengthTextField.java
//
import javax.swing.*;

// A fixed-length JTextField
public class FixedLengthTextField extends JTextField {

  public FixedLengthTextField(int length) {
    this(null, length);
  }

  public FixedLengthTextField(String text, int length) {
    super(new FixedLengthPlainDocument(length), text, length);
  }
}
