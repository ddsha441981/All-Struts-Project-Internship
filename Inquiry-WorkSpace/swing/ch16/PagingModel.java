// PagingModel.java
// A larger table model that performs "paging" of its data.  This model
// reports a small number of rows (like 100 or so) as a "page" of data.  You
// can switch pages to view all of the rows as needed using the pageDown()
// and pageUp() methods.  Presumably, access to the other pages of data is
// dictated by other GUI elements such as up/down buttons, or maybe a text
// field that allows you to enter the page number you want to display.
//
import javax.swing.table.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PagingModel extends AbstractTableModel {

  protected int pageSize;
  protected int pageOffset;
  protected Record[] data;

  public PagingModel() {
    this(10000, 100);
  }

  public PagingModel(int numRows, int size) {
    data = new Record[numRows];
    pageSize = size;
    
    // fill our table with random data (from the Record() constructor)
    for (int i=0; i < data.length; i++) {
      data[i] = new Record();
    }
  }

  // Return values appropriate for the visible table part
  public int getRowCount() { return pageSize; }
  public int getColumnCount() { return Record.getColumnCount(); }

  // Only works on the visible part of the table
  public Object getValueAt(int row, int col) {
    int realRow = row + (pageOffset * pageSize);
    return data[realRow].getValueAt(col);
  }

  public String getColumnName(int col) {
    return Record.getColumnName(col);
  }

  // use this method to figure out which page you are on
  public int getPageOffset() { return pageOffset; }

  public int getPageCount() { 
    return (int)Math.ceil((double)data.length / pageSize);
  }

  // use this method if you want to know how big the real table is . . . we
  // could also write "getRealValueAt()" if we needed.
  public int getRealRowCount() {
    return data.length;
  }

  public int getPageSize() { return pageSize; }
  public void setPageSize(int s) { 
    if (s == pageSize) { return; }
    int oldPageSize = pageSize;
    pageSize = s;
    if (pageSize < oldPageSize) {
      fireTableRowsDeleted(pageSize, oldPageSize - 1);
    }
    else {
      fireTableRowsInserted(oldPageSize, pageSize - 1);
    }
  }

  // update the page offset and fire a data changed (all rows)
  public void pageDown() {
    if (pageOffset < getPageCount() - 1) {
      pageOffset++;
      fireTableDataChanged();
    }
  }

  // update the page offset and fire a data changed (all rows)
  public void pageUp() {
    if (pageOffset > 0) {
      pageOffset--;
      fireTableDataChanged();
    }
  }

  // we'll provide our own version of a scroll pane that includes
  // the page up and page down buttons by default.
  public static JScrollPane createPagingScrollPaneForTable(JTable jt) {
    JScrollPane jsp = new JScrollPane(jt);

    // Don't choke if this is called on a regular table . . .
    if (! (jt.getModel() instanceof PagingModel)) {
      return jsp;
    }

    // Okay, go ahead and build the real scroll pane
    final PagingModel model = (PagingModel)jt.getModel();
    final JButton upButton = new JButton(new ArrowIcon(ArrowIcon.UP));
    upButton.setEnabled(false);  // starts off at 0, so can't go up
    final JButton downButton = new JButton(new ArrowIcon(ArrowIcon.DOWN));

    upButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        model.pageUp();

        // If we hit the top of the data, disable the up button
        if (model.getPageOffset() == 0) {
          upButton.setEnabled(false);
        }
        downButton.setEnabled(true);
      }
    } );

    downButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        model.pageDown();

        // If we hit the bottom of the data, disable the down button
        if (model.getPageOffset() == (model.getPageCount() - 1)) {
          downButton.setEnabled(false);
        }
        upButton.setEnabled(true);
      }
    } );

    // Turn on the scrollbars; otherwise we won't get our corners
    jsp.setVerticalScrollBarPolicy
        (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    jsp.setHorizontalScrollBarPolicy
        (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

    // add in the corners (page up/down)
    jsp.setCorner(ScrollPaneConstants.UPPER_RIGHT_CORNER, upButton);
    jsp.setCorner(ScrollPaneConstants.LOWER_RIGHT_CORNER, downButton);

    return jsp;
  }
}
