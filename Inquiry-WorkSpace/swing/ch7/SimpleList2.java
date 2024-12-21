// SimpleList2.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SimpleList2 extends JPanel implements ListSelectionListener,
             ActionListener {

    String label[] = { "Zero","One","Two","Three","Four","Five","Six",
                       "Seven","Eight","Nine","Ten","Eleven" };
    JList list;

    public SimpleList2() {
        setLayout(new BorderLayout());

        list = new JList(label);
        JButton button = new JButton("Print");
        JScrollPane pane = new JScrollPane(list);

        DefaultListSelectionModel m = new DefaultListSelectionModel();
        m.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        m.setLeadAnchorNotificationEnabled(false);
        list.setSelectionModel(m);

        list.addListSelectionListener(this);
        button.addActionListener(this);

        add(pane, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("List Example");
         frame.addWindowListener(new BasicWindowMonitor());
         frame.setContentPane(new SimpleList2());
         frame.pack();
         frame.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e)
    {
         System.out.println(e.toString());
    }

    public void actionPerformed(ActionEvent e) {

        int selected[] = list.getSelectedIndices();
        System.out.println("Selected Elements:  ");

        for (int i=0; i < selected.length; i++) {
            String element = (String)list.getModel().
                                         getElementAt(selected[i]);
            System.out.println("  " + element);
        }
    }
}
