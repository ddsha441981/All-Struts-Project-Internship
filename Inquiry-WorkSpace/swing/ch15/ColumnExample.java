// ColumnExample.java
// A test of the JTable class using default table models and a convenience
// constructor.

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class ColumnExample extends JFrame {

  public ColumnExample() {
    super("Abstract Model JTable Test");
    setSize(300, 200);
    addWindowListener(new BasicWindowMonitor());

    DefaultTableModel dtm = new DefaultTableModel(
                              new String[][] { 
                                {"1", "2", "3"}, 
                                {"4", "5", "6"} },
                              new String[] {"Names", "In", "Order"});
    SortingColumnModel scm = new SortingColumnModel();
    JTable jt = new JTable(dtm, scm);
    jt.createDefaultColumnsFromModel();

    JScrollPane jsp = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    ColumnExample ce = new ColumnExample();
    ce.setVisible(true);
  }
}
