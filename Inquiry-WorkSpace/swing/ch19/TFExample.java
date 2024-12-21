// TFExample.java
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TFExample {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());

    // Create several fields using different constructors
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField(11);
    JTextField t3 = new JTextField("mmmmmmmmmmm");
    JTextField t4 = new JTextField("Hello World");
    JTextField t5 = new JTextField("Hello World", 11);
    JTextField t6 = new JTextField("Hello World");
    JTextField t7 = new JTextField(2);
    JTextField t8 = new JTextField();

    // Validate the container when we hit 'enter' in t4.
    final JTextField ref = t4;
    ref.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ref.getParent().validate();
        ref.setScrollOffset(0);
      }
    });

    // Make sure t6 won't grow on us (like t4 will)
    t6.setPreferredSize(t6.getPreferredSize());

    // Use a fixed-width font on t7-2 characters wide . . . not!
    t7.setFont(new Font("Monospaced", Font.PLAIN, 12));

    // A little trick to make t8 _really_ 2 characters wide
    t8.setText("  "); // 2 characters . . .
    t8.setFont(new Font("Monospaced", Font.PLAIN, 12));
    t8.setPreferredSize(t8.getPreferredSize());
    t8.setText(""); // empty the field

    // Shift all the fields with content back to the left
    t3.setScrollOffset(0);
    t4.setScrollOffset(0);
    t5.setScrollOffset(0);
    t6.setScrollOffset(0);

    // Display all the fields . . .
    Container content = f.getContentPane();
    content.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridy = 0;
    content.add(t1, gbc); gbc.gridy++;
    content.add(t2, gbc); gbc.gridy++;
    content.add(t3, gbc); gbc.gridy++;
    content.add(t4, gbc); gbc.gridy++;
    content.add(t5, gbc); gbc.gridy++;
    content.add(t6, gbc); gbc.gridy++;
    content.add(t7, gbc); gbc.gridy++;
    content.add(t8, gbc);

    f.setSize(150, 200);
    f.setVisible(true);
  }
}
