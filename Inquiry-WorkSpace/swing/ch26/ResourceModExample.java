// ResourceModExample.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ResourceModExample {
  public static void main(String[] args) {

    // A custom border for all buttons
    Border border = BorderFactory.createRaisedBevelBorder();
    Border tripleBorder = new CompoundBorder(new CompoundBorder(
      border, border), border);

    UIManager.put("Button.border", tripleBorder);

    // Custom icons for internal frames
    UIManager.put("InternalFrameTitlePane.closeIcon",
      new ImageIcon("close.gif"));
    UIManager.put("InternalFrameTitlePane.iconizeIcon",
      new ImageIcon("iconify.gif"));
    UIManager.put("InternalFrameTitlePane.maximizeIcon",
      new ImageIcon("maximize.gif"));
    UIManager.put("InternalFrameTitlePane.altMaximizeIcon",
      new ImageIcon("altMax.gif"));

    // A custom internal frame title font
    UIManager.put("InternalFrameTitlePane.font",
      new Font("Serif", Font.ITALIC, 12));

    // Make scrollbars really wide

    UIManager.put("ScrollBar.width", new Integer(30));

    // Throw together some components to show what we've done.
    // Nothing below here is L&F-specific.
    // ***********************************
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    Container c = f.getContentPane();

    JDesktopPane desk = new JDesktopPane();
    c.add(desk, BorderLayout.CENTER);

    JButton cut = new JButton("Cut");
    JButton copy = new JButton("Copy");
    JButton paste = new JButton("Paste");

    JPanel p = new JPanel(new FlowLayout());
    p.add(cut);
    p.add(copy);
    p.add(paste);
    c.add(p, BorderLayout.SOUTH);

    JInternalFrame inf = new JInternalFrame("MyFrame",true, true, true, true);
    JLabel l = new JLabel(new ImageIcon("toast.jpg"));
    JScrollPane scroll = new JScrollPane(l);
    inf.setContentPane(scroll);
    inf.setBounds(10, 10, 200, 200);
    desk.add(inf);

    f.setSize(250, 350);
    f.setVisible(true);
  }
}
