// SimpleLayers.java
//
import javax.swing.*;
import java.awt.Color;

public class SimpleLayers {
  public static void main(String[] args) {

    // Create a frame & gets its layered pane
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    JLayeredPane lp = f.getLayeredPane();

    // Create 3 buttons
    JButton top = new JButton();
    top.setBackground(Color.white);
    top.setBounds(20, 20, 50, 50);
    JButton middle = new JButton();
    middle.setBackground(Color.gray);
    middle.setBounds(40, 40, 50, 50);
    JButton bottom = new JButton();
    bottom.setBackground(Color.black);
    bottom.setBounds(60, 60, 50, 50);

    // Place the buttons in different layers
    lp.add(middle, new Integer(2));
    lp.add(top, new Integer(3));
    lp.add(bottom, new Integer(1));

    // Show the frame
    f.setSize(150, 150);
    f.setVisible(true);
  }
}
