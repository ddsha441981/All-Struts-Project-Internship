//  SimpleList.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleList extends JPanel implements ActionListener {

    String label[] = { "Zero","One","Two","Three","Four","Five","Six",
                       "Seven","Eight","Nine","Ten","Eleven" };
    JList list;

    public SimpleList() {
        this.setLayout(new BorderLayout());
        list = new JList(label);
        JScrollPane pane = new JScrollPane(list);
        JButton button = new JButton("Print");
        button.addActionListener(this);

        add(pane, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("Simple List Example");
         frame.addWindowListener(new BasicWindowMonitor());
         frame.setContentPane(new SimpleList());
         frame.setSize(250, 180);
         frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int selected[] = list.getSelectedIndices();
        System.out.println("Selected Elements:  ");

        for (int i=0; i < selected.length; i++) {
            String element =
                  (String)list.getModel().getElementAt(selected[i]);
            System.out.println("  " + element);
        }
    }
}
