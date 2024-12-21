//  ToolBarExample.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class ToolBarExample extends JPanel implements ActionListener {

    public JTextPane pane;
    public JMenuBar menuBar;
    public JToolBar toolBar;
    String fonts[] =
                {"Serif","SansSerif","Monospaced","Dialog","DialogInput"};

    public ToolBarExample() {
        super(true);

        menuBar = new JMenuBar();

        JMenu formatMenu = new JMenu("Justify");
        formatMenu.setMnemonic('J');

        MenuAction leftJustifyAction = new MenuAction("Left",
                                           new ImageIcon("left.gif"));
        MenuAction rightJustifyAction = new MenuAction("Right",
                                           new ImageIcon("right.gif"));
        MenuAction centerJustifyAction = new MenuAction("Center",
                                           new ImageIcon("center.gif"));
        MenuAction fullJustifyAction = new MenuAction("Full",
                                           new ImageIcon("full.gif"));

       JMenuItem item;
       item = formatMenu.add(leftJustifyAction);
       item.setIcon((Icon)leftJustifyAction.getValue(Action.SMALL_ICON));
       item.setHorizontalTextPosition(JMenuItem.RIGHT);
       item.setMnemonic('L');
       item = formatMenu.add(rightJustifyAction);
       item.setIcon((Icon)rightJustifyAction.getValue(Action.SMALL_ICON));
       item.setHorizontalTextPosition(JMenuItem.RIGHT);
       item.setMnemonic('R');
       item = formatMenu.add(centerJustifyAction);
       item.setIcon((Icon)centerJustifyAction.getValue(Action.SMALL_ICON));
       item.setHorizontalTextPosition(JMenuItem.RIGHT);
       item.setMnemonic('C');
       item = formatMenu.add(fullJustifyAction);
       item.setIcon((Icon)fullJustifyAction.getValue(Action.SMALL_ICON));
       item.setHorizontalTextPosition(JMenuItem.RIGHT);
       item.setMnemonic('F');

       menuBar.add(formatMenu);
       menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));

       toolBar = new JToolBar();

       JButton button;
       button = toolBar.add(leftJustifyAction);
       button.setActionCommand((String)leftJustifyAction.getValue(Action.NAME));
       button.setToolTipText((String)leftJustifyAction.getValue(Action.NAME));
       button = toolBar.add(rightJustifyAction);
       button.setActionCommand((String)rightJustifyAction.getValue(Action.NAME));
       button.setToolTipText((String)rightJustifyAction.getValue(Action.NAME));
       button = toolBar.add(centerJustifyAction);
       	button.setActionCommand((String)centerJustifyAction.getValue(Action.NAME));
       button.setToolTipText((String)centerJustifyAction.getValue(Action.NAME));
       button = toolBar.add(fullJustifyAction);
       button.setActionCommand((String)fullJustifyAction.getValue(Action.NAME));
       button.setToolTipText((String)fullJustifyAction.getValue(Action.NAME));

       toolBar.addSeparator();
       JLabel label = new JLabel("Font");
       toolBar.add(label);

       toolBar.addSeparator();
       JComboBox combo = new JComboBox(fonts);
       combo.addActionListener(this);
       toolBar.add(combo);
 
       //  Disable one of the Actions
       fullJustifyAction.setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        try { pane.getStyledDocument().insertString(0,
              "Font ["+((JComboBox)e.getSource()).getSelectedItem()+
                     "] chosen!\n", null);
        } catch (Exception ex) {;} 
    }

    public static void main(String s[]) {

        ToolBarExample example = new ToolBarExample();
        example.pane = new JTextPane();
        example.pane.setPreferredSize(new Dimension(250, 250));
        example.pane.setBorder(new BevelBorder(BevelBorder.LOWERED));
        example.toolBar.setMaximumSize(example.toolBar.getSize());

        JFrame frame = new JFrame("Menu Example");
        frame.addWindowListener(new BasicWindowMonitor());
        frame.setJMenuBar(example.menuBar);
        frame.getContentPane().add(example.toolBar, BorderLayout.NORTH);
        frame.getContentPane().add(example.pane, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    class MenuAction extends AbstractAction {
   
        public MenuAction(String text, Icon icon) {
            super(text, icon);
        }

        public void actionPerformed(ActionEvent e) {
            try { pane.getStyledDocument().insertString(0,
                  "Action ["+e.getActionCommand()+"] performed!\n", null);
            } catch (Exception ex) {;} 
        }
    }

}
