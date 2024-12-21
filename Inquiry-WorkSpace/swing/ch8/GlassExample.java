// GlassExample.java
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Show how a glass pane can be used to block mouse events
public class GlassExample {
  public static void main(String[] args) {

    // Create a frame and its content pane's contents
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    final JPanel p1 = new JPanel();
    p1.add(new JLabel("Foo, Bar & Baz", JLabel.CENTER));
    p1.add(new JButton("Foo"));
    p1.add(new JButton("Bar"));
    f.getContentPane().add(p1);

    // Place a button in the center of the glass pane and make it visible
    final JPanel glass = (JPanel)f.getGlassPane();

    glass.setVisible(true);
    glass.setLayout(new GridBagLayout());
    JButton glassButton = new JButton("Start");
    glass.add(glassButton);

    // Register for all the mouse events in the glass pane (and do nothing). 
    // This registration keeps the components in the content pane from being
    // clickable. We could have created our own panel that called
    // enableEvents(AWTEvent.MOUSE_EVENT_MASK |
    // AWTEvent.MOUSE_MOTION_EVENT_MASK) to get the same effect.
    glass.addMouseListener(new MouseAdapter() {});
    glass.addMouseMotionListener(new MouseMotionAdapter() {});

    // Add a listener to the glass pane's button that will make the glass
    // pane invisible when the button is clicked.
    glassButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        glass.setVisible(false);
        p1.repaint();
      }
    });

    // Display the example . . .
    f.setSize(150, 80);
    f.setVisible(true);
  }
}
