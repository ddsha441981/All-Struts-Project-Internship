// PieChartPainter.java
// A pie chart implementation of the ChartPainter class.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;

public class PieChartPainter extends ChartPainter {

  protected static PieChartPainter chartUI = new PieChartPainter();
  protected int originX, originY;
  protected int radius;

  private static double piby2 = Math.PI / 2.0;
  private static double twopi = Math.PI * 2.0;
  private static double d2r   = Math.PI / 180.0; // degrees to radians.

  public int indexOfEntryAt(MouseEvent me) {
    int x = me.getX() - originX;
    int y = originY - me.getY();  // upside down coordinate system.
    
    // is (x,y) in the circle?
    if (Math.sqrt(x*x + y*y) > radius) { return -1; }

    double percent = Math.atan2(Math.abs(y), Math.abs(x));
    if (x >= 0) {
      if (y <= 0) { // (IV)
        percent = (piby2 - percent) + 3 * piby2; // (IV)
      }
    }
    else {
      if (y >= 0) { // (II)
        percent = Math.PI - percent;
      }
      else { // (III)
        percent = Math.PI + percent;
      }
    }
    percent /= twopi;
    double t = 0.0;
    if (values != null) {
      for (int i = 0; i < values.length; i++) {
        if (t + values[i] > percent) {
          return i;
        }
        t += values[i];
      }
    }
    return -1;
  }

  public void paint(Graphics g, JComponent c) {
    Dimension size = c.getSize();
    originX = size.width / 2;
    originY = size.height / 2;
    int diameter = (originX < originY ? size.width - 40 
                                      : size.height - 40);
    radius = (diameter / 2) + 1;
    int cornerX = (originX - (diameter / 2));
    int cornerY = (originY - (diameter / 2));
    
    int startAngle = 0;
    int arcAngle = 0;
    for (int i = 0; i < values.length; i++) {
      arcAngle = (int)(i < values.length - 1 ?
                       Math.round(values[i] * 360) :
                       360 - startAngle);
      g.setColor(colors[i % colors.length]);
      g.fillArc(cornerX, cornerY, diameter, diameter, 
                startAngle, arcAngle);
      drawLabel(g, labels[i], startAngle + (arcAngle / 2));
      startAngle += arcAngle;
    }
    g.setColor(Color.black);
    g.drawOval(cornerX, cornerY, diameter, diameter);  // cap the circle
  }

  public void drawLabel(Graphics g, String text, double angle) {
    g.setFont(textFont);
    g.setColor(textColor);
    double radians = angle * d2r;
    int x = (int) ((radius + 5) * Math.cos(radians));
    int y = (int) ((radius + 5) * Math.sin(radians));
    if (x < 0) { 
      x -= SwingUtilities.computeStringWidth(g.getFontMetrics(), text);
    }
    if (y < 0) {
      y -= g.getFontMetrics().getHeight();
    }
    g.drawString(text, x + originX, originY - y);
  }

  public static ComponentUI createUI(JComponent c) {
    return chartUI;
  }
}
