import java.awt.*;
import java.awt.event.*;
import javax.swing.FocusManager;
import javax.swing.*;
import javax.swing.border.*;

public class FocusManagerExample extends JPanel {

    static MyFrame frame;

    public FocusManagerExample() {

        super();

        frame = new MyFrame("Alphabetized Button Focus Manager");

        setLayout(new GridLayout(6,1));

        JButton button1 = new JButton("Texas");
        JButton button2 = new JButton("Vermont");
        JButton button3 = new JButton("Florida");
        JButton button4 = new JButton("Alabama");
        JButton button5 = new JButton("Minnesota");
        JButton button6 = new JButton("California");

        FocusManager.setCurrentManager(new AlphaButtonFocusManager());

        button1.requestFocus();
        setBackground(Color.lightGray);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

    }

    public static void main(String[] args)
    {
        FocusManagerExample it = new FocusManagerExample();
        frame.addWindowListener(new BasicWindowMonitor());
        frame.setContentPane(it);
        frame.setSize(200,300);
        frame.setVisible(true);
    }

    class MyFrame extends JFrame {
        public MyFrame(String s) {
            super(s);
        }
        public boolean isFocusCycleRoot() { return true; }
        public boolean isManagingFocus() { return true; }
    }

}
