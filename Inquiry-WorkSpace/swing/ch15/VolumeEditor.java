// VolumeEditor.java
// A slider Editor for volume values in a table.
//
import java.awt.Component;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;

public class VolumeEditor extends JScrollBar implements TableCellEditor {

  protected transient Vector listeners;
  protected transient int originalValue;

  public VolumeEditor() {
    super(JScrollBar.HORIZONTAL);
    listeners = new Vector();
  }

  public Component getTableCellEditorComponent(JTable table,Object value,
                                               boolean isSelected,
                                               int row,int column) {
    if (value == null) {
      return this;
    }
    if (value instanceof Volume) {
      setValue(((Volume)value).getVolume());
    }
    else {
      setValue(0);
    }
    table.setRowSelectionInterval(row, row);
    table.setColumnSelectionInterval(column, column);
    originalValue = getValue();
    return this;
  }

  // CellEditor methods
  public void cancelCellEditing() {fireEditingCanceled();}

  public Object getCellEditorValue() {return new Integer(getValue());}

  public boolean isCellEditable(EventObject eo) {return true;}
  
  public boolean shouldSelectCell(EventObject eo) {
    return true;
  }

  public boolean stopCellEditing() {
    fireEditingStopped();
    return true;
  }

  public void addCellEditorListener(CellEditorListener cel) {
    listeners.addElement(cel);
  }
  
  public void removeCellEditorListener(CellEditorListener cel) {
    listeners.removeElement(cel);
  }

  protected void fireEditingCanceled() {
    setValue(originalValue);
    ChangeEvent ce = new ChangeEvent(this);
    for (int i = listeners.size(); i >= 0; i--) {
      ((CellEditorListener)listeners.elementAt(i)).editingCanceled(ce);
    }
  }

  protected void fireEditingStopped() {
    ChangeEvent ce = new ChangeEvent(this);
    for (int i = listeners.size() - 1; i >= 0; i--) {
      ((CellEditorListener)listeners.elementAt(i)).editingStopped(ce);
    }
  }
}
