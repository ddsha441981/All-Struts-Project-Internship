// AlignmentExample.java
//
import javax.swing.*;
import java.awt.*;

public class AlignmentExample {
  public static void main(String[] args) {
    // Create the labels and set alignment
    JLabel label1 = new JLabel("BottomRight", SwingConstants.RIGHT);
    JLabel label2 = new JLabel("CenterLeft", SwingConstants.LEFT);
    JLabel label3 = new JLabel("TopCenter", SwingConstants.CENTER);
    label1.setVerticalAlignment(SwingConstants.BOTTOM);
    label2.setVerticalAlignment(SwingConstants.CENTER);
    label3.setVerticalAlignment(SwingConstants.TOP);

    // Add borders to the labels . . . more on Borders later in the book!
    label1.setBorder(BorderFactory.createLineBorder(Color.black));
    label2.setBorder(BorderFactory.createLineBorder(Color.black));
    label3.setBorder(BorderFactory.createLineBorder(Color.black));

    // Put it all together . . .
    JFrame frame = new JFrame();
    frame.addWindowListener(new BasicWindowMonitor());
    Container c = frame.getContentPane();
    c.setLayout(new GridLayout(3,1));
    c.add(label1);
    c.add(label2);
    c.add(label3);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}
