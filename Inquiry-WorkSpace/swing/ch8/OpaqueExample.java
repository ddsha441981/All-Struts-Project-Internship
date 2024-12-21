// OpaqueExample.java
//
import javax.swing.*;
import java.awt.*;

public class OpaqueExample {
  public static void main(String[] args) {

    // Create 2 JPanels (opaque), one containing another opaque JPanel, and
    // the other containing a nonopaque JPanel
    JPanel opaque = createNested(true);
    JPanel notOpaque = createNested(false);

    // Throw it all together in a JFrame
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.getContentPane().setLayout(new FlowLayout());
    f.getContentPane().add(opaque);
    f.getContentPane().add(notOpaque);
    f.pack();
    f.setVisible(true);
  }

  // Create a JPanel containing another JPanel. The inner JPanel's opacity
  // is set according to the parameter. A JButton is placed inside the inner
  // JPanel to give it some content.
  public static JPanel createNested(boolean opaque) {
    JPanel outer = new JPanel(new FlowLayout());
    JPanel inner = new JPanel(new FlowLayout());
    outer.setBackground(Color.white);
    inner.setBackground(Color.black);

    inner.setOpaque(opaque);
    inner.setBorder(BorderFactory.createLineBorder(Color.gray));

    inner.add(new JButton("Button"));
    outer.add(inner);

    return outer;
  }
}
