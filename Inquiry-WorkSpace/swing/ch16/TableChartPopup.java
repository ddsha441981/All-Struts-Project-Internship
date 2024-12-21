// TableChartPopup.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class TableChartPopup extends JFrame {

  public TableChartPopup(TableModel tm) {
    super("Table Chart");
    setSize(300,200);
    TableChart tc = new TableChart(tm);
    getContentPane().add(tc, BorderLayout.CENTER);

    // Turn on the tooltips, we can use any string to get going.
    tc.setToolTipText("Demo Chart");
  }
}
