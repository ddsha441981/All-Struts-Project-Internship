// SecretLabel.java
// An extension of the JLabel class that listens to mouse clicks and converts
// them to ActionEvents, in turn are reported via an EventListenersList object.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SecretLabel extends JLabel implements MouseListener {

  public SecretLabel(String msg) {
    super(msg);
    addMouseListener(this);
  }

  public void addActionListener(ActionListener l) {
    // We'll just use the listenerList we inherit from JComponent
    listenerList.add(ActionListener.class, l);
  }

  public void removeActionListener(ActionListener l) {
    listenerList.remove(ActionListener.class, l);
  }

  public void mouseClicked(MouseEvent me) {
    fireActionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, 
                                        "SecretMessage"));
  }

  public void mousePressed(MouseEvent me) {}
  public void mouseReleased(MouseEvent me) {}
  public void mouseEntered(MouseEvent me) {}
  public void mouseExited(MouseEvent me) {}
  
  protected void fireActionPerformed(ActionEvent ae) {
    Object[] listeners = listenerList.getListenerList();
    for (int i = listeners.length - 2; i >= 0; i--) {
      if (listeners[i] == ActionListener.class) {
        ((ActionListener)listeners[i+1]).actionPerformed(ae);
      }
    }
  }
}
