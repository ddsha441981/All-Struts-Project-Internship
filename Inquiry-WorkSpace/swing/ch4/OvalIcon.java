// OvalIcon.java
//
import javax.swing.*;
import java.awt.*;

// A simple Icon implementation that draws ovals
public class OvalIcon implements Icon {
  public OvalIcon(int w, int h) {
    width = w;
    height = h;
  }

  public void paintIcon(Component c, Graphics g, int x, int y) {
    g.drawOval(x, y, width-1, height-1);
  }

  public int getIconWidth() { return width; }
  public int getIconHeight() { return height; }

  private int width, height;
}
