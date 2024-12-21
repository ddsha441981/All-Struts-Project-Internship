// VolumeRenderer.java
// A slider renderer for volume values in a table.
//
import java.awt.Component;
import javax.swing.*;
import javax.swing.table.*;

public class VolumeRenderer extends JScrollBar implements TableCellRenderer {

  public VolumeRenderer() {
    super(JScrollBar.HORIZONTAL);
  }

  public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected,
                                                 boolean hasFocus,
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
    return this;
  }
}
