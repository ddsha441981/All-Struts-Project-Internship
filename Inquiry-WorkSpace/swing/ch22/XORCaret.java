// XORCaret.java
//
import javax.swing.text.*;
import javax.swing.plaf.*;
import javax.swing.*;
import java.awt.*;

// An implementation of Caret that renders a variable-width XOR cursor.
public class XORCaret extends DefaultCaret {
  // Create the cursor and make it blink
  public XORCaret() {
    setBlinkRate(500); // blinking cursor
  }

  // Render the cursor
  public void paint(Graphics g) {
    if (isVisible()) {
      // Determine where to draw the cursor
      JTextComponent c = getComponent();
      TextUI ui = c.getUI();
      Rectangle r = null;
      int dot = getDot();
      try {
        r = ui.modelToView(c, dot);
      }
      catch (BadLocationException ex) { return; }

      g.setColor(c.getCaretColor());

      // Draw the rectangle, using the currentWidth() method for the width
      lastPaintedWidth = currentWidth();
      g.fillRect(r.x, r.y, lastPaintedWidth, r.height);

      // Draw the character with the background color so it shows up!
      g.setColor(c.getBackground());
      try {
        if (dot < c.getDocument().getLength()) {
          String s = getComponent().getText(dot, 1);

          // Keep \t and \n from looking funny. . .
          if (Character.isISOControl(s.charAt(0)) == false)
            g.drawString(s, r.x, r.y+currentAscent);
          }
        }
        catch (BadLocationException ex) { }
    }
  }

  // This method should match the area painted by paint()
  public void damage(Rectangle r) {
    if (r != null) {
      // Repaint the area where the cursor was. We don't use the current
      // width here, instead we use the width of the last caret we painted.
      getComponent().repaint(r.x, r.y, lastPaintedWidth, r.height);
    }
  }

  // This method determines the width of the current character based on the
  // component's Font. Note that this only works porperly with single-font
  // components.
  protected int currentWidth() {

    Font f = getComponent().getFont();

    if (f != currentFont) {
      currentFontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(f);
      currentAscent = currentFontMetrics.getAscent();
    }

    // Determine the character at the current caret position
    String current = null;
    try {
      current = getComponent().getText(getDot(), 1);
    } catch (BadLocationException ex) { /* ignore */ }

    char currentChar;
    if (current != null && current.length() > 0)
      currentChar = current.charAt(0);
    else
      currentChar = ' ';

    // Return the character's size, or the size of a space when we're adding
    // new text
    if (Character.isWhitespace(currentChar))
      return currentFontMetrics.charWidth(' ');
    else
      return currentFontMetrics.charWidth(current.charAt(0));
  }

  protected int lastPaintedWidth = 8;
  protected Font currentFont = null;
  protected int currentAscent = 0;
  protected FontMetrics currentFontMetrics = null;
}
