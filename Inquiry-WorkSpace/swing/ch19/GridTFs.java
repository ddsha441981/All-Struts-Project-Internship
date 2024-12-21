// GridTFs.java
//
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class GridTFs {
  public static void main(String[] args) {
    JLabel l1 = new JLabel("Last Name");
    JLabel l2 = new JLabel("Middle Name");
    JLabel l3 = new JLabel("First Name");
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();

    JPanel p = new JPanel();
    p.setLayout(new GridLayout(3, 2, 2, 2)); // ignores preferred size

    p.add(l1);
    p.add(tf1);
    p.add(l2);
    p.add(tf2);
    p.add(l3);
    p.add(tf3);

    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.setContentPane(p);
    f.pack();
    f.setVisible(true);
  }
}
