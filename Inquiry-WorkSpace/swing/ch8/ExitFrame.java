// ExitFrame.java
//
import javax.swing.JFrame;
import java.awt.event.WindowEvent;

// A very simple extension of JFrame that adds another option for the
// defaultCloseOperation called EXIT_ON_CLOSE.  This is the default
// for this class, but it can be changed just as it is changed with JFrame.
public class ExitFrame extends JFrame {

  // Exit the VM when the frame is closed
  public static final int EXIT_ON_CLOSE = 100;

  protected int closeOp;

  public ExitFrame() {
    super();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public ExitFrame(String title) {
    super(title);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  // Overrides JFrame implementation to store the operation locally
  public void setDefaultCloseOperation(int operation) {
    super.setDefaultCloseOperation(operation);
    closeOp = operation;
  }

  // Override JFrame implementation to exit if the close operation is set
  // to EXIT_ON_CLOSE
  protected void processWindowEvent(WindowEvent e) {
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      if (closeOp == EXIT_ON_CLOSE)
        System.exit(0);
    }
    super.processWindowEvent(e);
  }
}
