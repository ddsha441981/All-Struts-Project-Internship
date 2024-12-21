// AccessExample.java
//
import javax.swing.*;
import java.awt.*;

public class AccessExample {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());

    // Just create a few accessiblity friendly buttons . . .
    JButton b1 = new JButton("Start");
    JButton b2 = new JButton("Stop");
    JButton b3 = new JButton("Cancel");

    b1.getAccessibleContext().setAccessibleDescription("Start the job");
    b2.getAccessibleContext().setAccessibleDescription("Stop the job");
    b3.getAccessibleContext().setAccessibleDescription("Cancel the job");

    Container c = f.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(b1);
    c.add(b2);
    c.add(b3);

    f.setSize(150, 150);
    f.setVisible(true);
  }
}
