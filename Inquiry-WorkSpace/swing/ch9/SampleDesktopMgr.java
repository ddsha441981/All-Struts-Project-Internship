// SampleDesktopMgr.java
//
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.beans.*;

// A DesktopManager that keeps its frames inside the desktop.
public class SampleDesktopMgr extends DefaultDesktopManager {

  // We'll tag internal frames that are being resized using a client
  // property with the name RESIZING.  Used in setBoundsForFrame().
  protected static final String RESIZING = "RESIZING";

  public void beginResizingFrame(JComponent f, int dir) {
    f.putClientProperty(RESIZING, Boolean.TRUE);
  }

  public void endResizingFrame(JComponent f) {
    f.putClientProperty(RESIZING, Boolean.FALSE);
  }

  // This is called any time a frame is moved or resized.  This 
  // implementation keeps the frame from leaving the desktop.
  public void setBoundsForFrame(JComponent f, int x, int y, int w, int h) {
    if (f instanceof JInternalFrame == false) {
      super.setBoundsForFrame(f, x, y, w, h); // only deal w/internal frames
    }
    else {
      JInternalFrame frame = (JInternalFrame)f;

      // Figure out if we are being resized (otherwise it's just a move)
      boolean resizing = false;
      Object r = frame.getClientProperty(RESIZING);
      if (r != null && r instanceof Boolean) {
        resizing = ((Boolean)r).booleanValue();
      }

      JDesktopPane desk = frame.getDesktopPane();
      Dimension d = desk.getSize();

      // Nothing all that fancy below, just figuring out how to adjust
      // to keep the frame on the desktop.
      if (x < 0) {              // too far left?
        if (resizing)
          w += x;               // don't get wider!
        x=0;                    // flush against the left side
      }
      else {
        if (x+w>d.width) {      // too far right?
         if (resizing)
           w = d.width-x;       // don't get wider!
         else
           x = d.width-w;       // flush against the right side
        }
      }
      if (y < 0) {              // too high?
        if (resizing)
          h += y;               // don't get taller!
        y=0;                    // flush against the top
      }
      else {
        if (y+h > d.height) {   // too low?
          if (resizing)
            h = d.height - y;   // don't get taller!
          else
            y = d.height-h;     // flush against the bottom
        }
      }

      // Set 'em the way we like 'em
      super.setBoundsForFrame(f, x, y, w, h);
    }
  }
}
