//  CheckBoxMenuItemExample.java
//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CheckBoxMenuItemExample extends JPanel implements
    ActionListener {

    public JTextPane pane;
    public JMenuBar menuBar;
    public JToolBar toolBar;

    public CheckBoxMenuItemExample() {
        super(true);

        menuBar = new JMenuBar();

        JMenu justifyMenu = new JMenu("Justify");
        justifyMenu.setMnemonic('J');

        JCheckBoxMenuItem leftJustify = new
               JCheckBoxMenuItem("Left", new ImageIcon("left.gif"));
        leftJustify.setHorizontalTextPosition(JMenuItem.RIGHT);
        leftJustify.setMnemonic('L'); 
        leftJustify.addActionListener(this);
        JCheckBoxMenuItem rightJustify = new
               JCheckBoxMenuItem("Right", new ImageIcon("right.gif"));
        rightJustify.setHorizontalTextPosition(JMenuItem.RIGHT);
        rightJustify.setMnemonic('R');
        rightJustify.addActionListener(this);
        JCheckBoxMenuItem centerJustify = new
               JCheckBoxMenuItem("Center", new ImageIcon("center.gif"));
        centerJustify.setHorizontalTextPosition(JMenuItem.RIGHT);
        centerJustify.setMnemonic('C');
        centerJustify.addActionListener(this);
        JCheckBoxMenuItem fullJustify = new
               JCheckBoxMenuItem("Full", new ImageIcon("full.gif"));
        fullJustify.setHorizontalTextPosition(JMenuItem.RIGHT);
        fullJustify.setMnemonic('F');
        fullJustify.addActionListener(this);

        justifyMenu.add(leftJustify);
        justifyMenu.add(rightJustify);
        justifyMenu.add(centerJustify);
        justifyMenu.add(fullJustify);

        menuBar.add(justifyMenu);
        menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));

    }

    public void actionPerformed(ActionEvent e) {
        try { pane.getStyledDocument().insertString(0 ,
              "Action ["+e.getActionCommand()+"] performed!\n", null);
        } catch (Exception ex) {;} 
    }

    public static void main(String s[]) {
        CheckBoxMenuItemExample example = new CheckBoxMenuItemExample();
        example.pane = new JTextPane();
        example.pane.setPreferredSize(new Dimension(250, 250));
        example.pane.setBorder(new BevelBorder(BevelBorder.LOWERED));

        JFrame frame = new JFrame("Menu Example");
        frame.addWindowListener(new BasicWindowMonitor());
        frame.getContentPane().add(example.menuBar, BorderLayout.NORTH);
        frame.getContentPane().add(example.pane, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
