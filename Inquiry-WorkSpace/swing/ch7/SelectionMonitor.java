//  SelectionMonitor.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SelectionMonitor extends JPanel implements
    ListSelectionListener {

    String label[] = { "Zero","One","Two","Three","Four","Five","Six",
                       "Seven","Eight","Nine","Ten","Eleven","Twelve" };
    JRadioButton buttons[];
    JList list;

    public SelectionMonitor() {
        setLayout(new BorderLayout());

        list = new JList(label);
        JScrollPane pane = new JScrollPane(list);
        buttons = new JRadioButton[label.length];

        //  Format the list and the buttons in a vertical box
        Box rightBox = new Box(BoxLayout.Y_AXIS);
        Box leftBox = new Box(BoxLayout.Y_AXIS);

        //  Monitor all list selections
        list.addListSelectionListener(this);

        for(int i=0; i < label.length; i++) {
            buttons[i] = new JRadioButton("Selection " + i);
            rightBox.add(buttons[i]);
        }
        leftBox.add(pane);
        add(rightBox, BorderLayout.EAST);
        add(leftBox, BorderLayout.WEST);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("Selection Monitor");
         frame.addWindowListener(new BasicWindowMonitor());
         frame.setContentPane(new SelectionMonitor());
         frame.pack();
         frame.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e) {
   
      //  If either of these are true, the event can be ignored.
      if ((e.getValueIsAdjusting() == false) || (e.getFirstIndex() == -1))
          return;
  
      //  Change the radio button to match the current selection state
      //  for each list item that reported a change.
      for (int i = e.getFirstIndex(); i <= e.getLastIndex(); i++) {
        buttons[i].setSelected(((JList)e.getSource()).isSelectedIndex(i));
      }
    }
}
