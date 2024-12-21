// AbstractExample.java
// A test of the JTable class using default table models and a convenience
// constructor.
//
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class AbstractExample extends JFrame {

  public AbstractExample() {
    super("Abstract Model JTable Test");
    setSize(300, 200);
    addWindowListener(new BasicWindowMonitor());

    TableModel tm = new AbstractTableModel() {
      String[][] data = { {"This", "is"}, {"a", "Test"} };
      String[] headers = {"Column", "Header"};

      public int getRowCount() { return data.length; }
      public int getColumnCount() { return headers.length; }
      public Object getValueAt(int r, int c) { return data[r][c]; }
      public String getColumnName(int c) { return headers[c]; }
    };

    JTable jt = new JTable(tm);
                         
    JScrollPane jsp = new JScrollPane(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    AbstractExample ae = new AbstractExample();
    ae.setVisible(true);
  }
}
