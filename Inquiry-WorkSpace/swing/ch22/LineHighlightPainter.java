// LineHighlightPainter.java
//
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.plaf.TextUI;

// A sample HighlightPainter implementation that underlines highlighted text with
// a thick line.
public class LineHighlightPainter implements Highlighter.HighlightPainter {

  // Create a new painter using the given color
  public LineHighlightPainter(Color c) { color = c; }

  public Color getColor() { return color; }

  // Paint a bunch of little rectangles
  public void paint(Graphics g, int p0, int p1,
    Shape bounds, JTextComponent c) {
    try {
      // Convert positions to pixel coordinates
      TextUI ui = c.getUI();

      Rectangle r1 = ui.modelToView(c, p0);
      Rectangle r2 = ui.modelToView(c, p1);
      Rectangle b = bounds.getBounds();

      int x1 = r1.x;
      int x2 = r2.x;
      int y1 = r1.y;
      int y2 = r2.y;
      int y1base = y1+r1.height-4; // start underline here
      int y2base = y2+r2.height-4; // start underline here

      // Start painting
      g.setColor(getColor());

      // Special case if points are on the same line
      if (y1 == y2) {
        g.fillRect(x1, y1base, x2 - x1, 3);
      }
      else {
        // Fill from point 1 to the end of the line
        g.fillRect(x1, y1base, b.x+b.width-x1, 3);

        // Fill all the full lines in between (assumes that
        // all lines are the same height . . . not a good assumption
        // if using a JEditorPane/JTextPane)
        int line = y1base + 1 + r1.height;
        while (line < y2) {
          g.fillRect(b.x, line-1, b.width, 3);
          line += r1.height;
        }

        // Last line . . . from the beginning to point 2
        g.fillRect(b.x, y2base, x2 - b.x, 3);
      }
    }
    catch (BadLocationException ex) {} // Can't paint
  }

  private Color color;

  // A Caret that uses LineHighlightPainter
  public static class LHCaret extends DefaultCaret {
    protected Highlighter.HighlightPainter getSelectionPainter() {
      return new LineHighlightPainter(getComponent().getSelectionColor());
    }
  }
}
