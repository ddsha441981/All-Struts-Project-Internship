// FixedLengthTFMain.java
//
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class FixedLengthTFMain {

  public static void main(String[] args) {

    // create the field and make it just the right size using the little hack
    // from the previous chapter
    FixedLengthTextField tf = new FixedLengthTextField(10);
    tf.setColumns(0);
    tf.setText("1234567890");
    tf.setFont(new Font("Monospaced", Font.PLAIN, 12));
    tf.setPreferredSize(tf.getPreferredSize());
    tf.setText("");

    // show the field
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    Container c = f.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(tf);
    f.pack();
    f.setVisible(true);
  }
}
