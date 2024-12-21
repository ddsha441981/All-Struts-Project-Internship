// CtrlIFocusManager.java
//
import javax.swing.DefaultFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Component;

// A FocusManager that doesn't treat CTRL-I like a TAB.
public class CtrlIFocusManager extends DefaultFocusManager {
  public void processKeyEvent(Component focusedComp, KeyEvent evt) {

    // If it's an "I" . . .
    if (evt.getKeyCode() == KeyEvent.VK_I) {

      // . . . and CTRL is pressed . . .
      if ((evt.getModifiers() & ActionEvent.CTRL_MASK)==ActionEvent.CTRL_MASK) {

        // . . . let it through by doing nothing . . .
        return;
      }
    }

    // Otherwise, let superclass do its thing . . .
    super.processKeyEvent(focusedComp, evt);
  }
}
