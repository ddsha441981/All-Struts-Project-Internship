// SimpleApplet.java
//
import javax.swing.*;
import java.awt.*;

public class SimpleApplet extends JApplet {
  public SimpleApplet() {

    // supress warning message
    getRootPane().putClientProperty("defeatSystemEventQueueCheck",
    Boolean.TRUE);
  }

  public void start() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() { // run in the event thread . . .
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2, 2, 2));
        p.add(new JLabel("Username"));
        p.add(new JTextField());
        p.add(new JLabel("Password"));
        p.add(new JPasswordField());
        Container content = getContentPane();
        content.setLayout(new GridBagLayout()); // used to center the panel
        content.add(p);
        validate();
      }
    });
  }
}
