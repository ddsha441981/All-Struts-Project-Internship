//  IntroExample.java
//
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class IntroExample extends JMenuBar implements ActionListener {

    String[] fileItems = new String[] { "New", "Open", "Save", "Exit" };
    String[] editItems = new String[] { "Undo", "Cut", "Copy", "Paste" };
    char[] fileShortcuts = { 'N','O','S','X' };
    char[] editShortcuts = { 'Z','X','C','V' };

    public IntroExample() {

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu otherMenu = new JMenu("Other");
        JMenu subMenu = new JMenu("SubMenu");
        JMenu subMenu2 = new JMenu("SubMenu2");

        //  Assemble the File menus with mnemonics
        for (int i=0; i < fileItems.length; i++) {
            JMenuItem item = new JMenuItem(fileItems[i], fileShortcuts[i]);
            item.addActionListener(this);
            fileMenu.add(item);
        }

        //  Assemble the File menus with keyboard accelerators
        for (int i=0; i < editItems.length; i++) {
            JMenuItem item = new JMenuItem(editItems[i]);
            item.setAccelerator(KeyStroke.getKeyStroke(editShortcuts[i],
                                 java.awt.Event.CTRL_MASK, false));
            item.addActionListener(this);
            editMenu.add(item);
        }

        //  Insert a separator in the Edit Menu in Position 1 after "Undo"
        editMenu.insertSeparator(1);

        //  Assemble the submenus of the Other Menu
        JMenuItem item;
        subMenu2.add(item = new JMenuItem("Extra 2"));
        item.addActionListener(this);
        subMenu.add(item = new JMenuItem("Extra 1"));
        item.addActionListener(this);
        subMenu.add(subMenu2);

        //  Assemble the Other Menu itself
        otherMenu.add(subMenu);
        otherMenu.add(item = new JCheckBoxMenuItem("Check Me"));
        item.addActionListener(this);
        otherMenu.addSeparator();
        ButtonGroup buttonGroup = new ButtonGroup();
        otherMenu.add(item = new JRadioButtonMenuItem("Radio 1"));
        item.addActionListener(this);
        buttonGroup.add(item);
        otherMenu.add(item = new JRadioButtonMenuItem("Radio 2"));
        item.addActionListener(this);
        buttonGroup.add(item);
        otherMenu.addSeparator();
        otherMenu.add(item = new JMenuItem("Potted Plant",
                                    new ImageIcon("image.gif")));
        item.addActionListener(this);

        //  Finally, add all the menus to the menubar
        add(fileMenu);
        add(editMenu);
        add(otherMenu);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("Menu item [" + event.getActionCommand() +
                           "] was pressed.");
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("Simple Menu Example");
        frame.addWindowListener(new BasicWindowMonitor());
        frame.setJMenuBar(new IntroExample());
        frame.pack();
        frame.setVisible(true);
    }
}
