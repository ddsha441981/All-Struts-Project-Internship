// AnimationApplet.java
//
import javax.swing.*;

// A simple animation applet
public class AnimationApplet extends JApplet {
  public void init() {
    ImageIcon icon = new ImageIcon("images/rolling.gif"); // animated gif
    getContentPane().add(new JLabel(icon));
  }
}
