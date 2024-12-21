// PagingTester.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class PagingTester extends JFrame {

  public PagingTester() {
    super("Paged JTable Test");
    setSize(300, 200);
    addWindowListener(new BasicWindowMonitor());
    
    PagingModel pm = new PagingModel();
    JTable jt = new JTable(pm);

    // Use our own custom scrollpane.
    JScrollPane jsp = PagingModel.createPagingScrollPaneForTable(jt);
    getContentPane().add(jsp, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    PagingTester pt = new PagingTester();
    pt.setVisible(true);
  }
}
