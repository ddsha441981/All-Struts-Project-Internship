// RevalidateExample.java
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RevalidateExample {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());

    // Create a single button
    Font font = new Font("Dialog", Font.PLAIN, 10);
    final JButton b = new JButton("Add");
    b.setFont(font);

    Container c = f.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(b);

    // Increase the size of the button's font each time it's clicked
    b.addActionListener(new ActionListener() {
      int size = 10;

      public void actionPerformed(ActionEvent ev) {
        b.setFont(new Font("Dialog", Font.PLAIN, ++size));
        b.revalidate();   // invalidates the button & validates its root pane
      }
    });
    f.setSize(150, 120);
    f.setVisible(true);
  }
}
