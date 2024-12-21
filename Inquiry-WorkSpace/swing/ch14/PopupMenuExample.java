//  PopupMenuExample.java
//
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class PopupMenuExample extends JPanel implements ActionListener,
    PopupMenuListener, MouseListener {

    public JPopupMenu popup;

    public PopupMenuExample() {

        popup = new JPopupMenu(); 

        JMenuItem item;
        popup.add(item = new JMenuItem("Left", new ImageIcon("left.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Center",
                                             new ImageIcon("center.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Right", new
                                                  ImageIcon("right.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(this);
        popup.add(item = new JMenuItem("Full", new ImageIcon("full.gif")));
        item.setHorizontalTextPosition(JMenuItem.RIGHT);
        item.addActionListener(this);
        popup.addSeparator();
        popup.add(item = new JMenuItem("Settings . . ."));
        item.addActionListener(this);

        popup.setLabel("Justification");
        popup.setBorder(new BevelBorder(BevelBorder.RAISED));
        popup.addPopupMenuListener(this);

        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) { checkPopup(e); }
    public void mouseClicked(MouseEvent e) { checkPopup(e); }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) { checkPopup(e); }

    private void checkPopup(MouseEvent e) {
        if (e.isPopupTrigger()) {
            popup.show(this, e.getX(), e.getY());
        } 
    }

    public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        System.out.println("Popup menu will be visible!");
    }
    public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        System.out.println("Popup menu will be invisible!");
    }
    public void popupMenuCanceled(PopupMenuEvent e) {
        System.out.println("Popup menu is hidden!");
    }
  
    public void actionPerformed(ActionEvent event) {
        System.out.println("Popup menu item [" + event.getActionCommand() +
                           "] was pressed.");
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("Popup Menu Example");
        frame.addWindowListener(new BasicWindowMonitor());
        frame.setContentPane(new PopupMenuExample());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
