//  FocusExample.java
//
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.FocusManager;
import javax.swing.border.*;

public class FocusExample extends JFrame {

    public FocusExample() {

        super("Focus Example");
        addWindowListener(new BasicWindowMonitor());
        MyPanel mypanel = new MyPanel();

        JButton  button1 = new JButton("One");
        JButton  button2 = new JButton("Two");
        JButton  button3 = new JButton("Three");
        MyButton button4 = new MyButton("Four");
        MyButton button5 = new MyButton("Five");
        JButton  button6 = new JButton("Six");
        JButton  button7 = new JButton("Seven");

        mypanel.add(button1);
        mypanel.add(button2);

        button4.setRequestFocusEnabled(false);
        button6.setNextFocusableComponent(button3);

        JInternalFrame frame1 = new JInternalFrame("Internal Frame 1",
                                                 true, true, true, true);
 
        frame1.setBackground(Color.lightGray);
        frame1.getContentPane().setLayout(new GridLayout(2, 3));
        frame1.setSize(200, 200);

        frame1.getContentPane().add(button3);
        frame1.getContentPane().add(mypanel);
        frame1.getContentPane().add(button4);
        frame1.getContentPane().add(button5);
        frame1.getContentPane().add(button6);
        frame1.getContentPane().add(button7);

        JDesktopPane desktop = new JDesktopPane();
        desktop.add(frame1, new Integer(1));
        desktop.setOpaque(true);

        //  Now set up the user interface window.
        Container contentPane = getContentPane();
        contentPane.add(desktop, BorderLayout.CENTER);
        setSize(new Dimension(600, 400));
        setVisible(true);
    }

    public static void main(String[] args) {
        new FocusExample();
    }

    class MyButton extends JButton {
        public MyButton(String s) { super(s); }
        public boolean isFocusTraversable() { return false; }
        public boolean isManagingFocus() { return true; }
        public void processComponentKeyEvent(KeyEvent e) {
            System.out.println("Key event is " + e);
            e.consume();
        }
    }

    class MyPanel extends JPanel {
        public MyPanel() { super(true); }
        public boolean isFocusCycleRoot() { return true; }
    }
}
