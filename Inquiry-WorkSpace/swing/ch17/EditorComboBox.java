// EditorComboBox.java
// A CellEditor JComboBox subclass for use with Trees (and possibly tables). This
// particular editor also checks to verify that the value entered is an integer.
//
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class EditorComboBox extends JComboBox implements CellEditor {

  String value;
  Vector listeners = new Vector();
  private static final int minWidth = 36;

  // mimic all of the constructors people expect with ComboBoxes
  public EditorComboBox(Object[] list) { 
    super(list); 
    setEditable(false);
    value = list[0].toString();

    // listen to our own action events, so we know when to stop editing
    addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        if (stopCellEditing()) {
          fireEditingStopped();
        }
      }
    });
  }

  // Implement the CellEditor methods
  public void cancelCellEditing() { }

  // only stop editing if the user entered a valid value
  public boolean stopCellEditing() {
    try {
      value = (String)getSelectedItem();
      if (value == null) { value = (String)getItemAt(0); }
      return true;
    }
    catch (Exception e) {
      // something went wrong
      return false;
    }
  }

  public Object getCellEditorValue() {
    return value; 
  }

  // start editing when the right mouse button is clicked
  public boolean isCellEditable(EventObject eo) {
    if ((eo == null) || 
        ((eo instanceof MouseEvent) && (((MouseEvent)eo).isMetaDown()))) {
      return true;
    }
    return false;
  }

  public boolean shouldSelectCell(EventObject eo) { return true; }

  // Add in support for listeners
  public void addCellEditorListener(CellEditorListener cel) {
    listeners.addElement(cel);
  }

  public void removeCellEditorListener(CellEditorListener cel) {
    listeners.removeElement(cel);
  }

  protected void fireEditingStopped() {
    if (listeners.size() > 0) {
      ChangeEvent ce = new ChangeEvent(this);
      for (int i = listeners.size() - 1; i >= 0; i--) {
        ((CellEditorListener)listeners.elementAt(i)).editingStopped(ce);
      }
    }
  }

  // override setBounds() to make sure that JTree gives our editor enough space
  public void setBounds(Rectangle r) {
    r.width = Math.max(minWidth, r.width);
    super.setBounds(r);
  }

  public void setBounds(int x, int y, int w, int h) {
    w = Math.max(minWidth, w);
    super.setBounds(x, y, w, h);
  }
}
