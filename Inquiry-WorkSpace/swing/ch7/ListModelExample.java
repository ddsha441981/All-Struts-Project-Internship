//  ListModelExample.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListModelExample extends JPanel implements ActionListener {

    JList list;
    DefaultListModel model;
    int counter = 15;

    public ListModelExample() {
        super(true);
        setLayout(new BorderLayout());
        model = new DefaultListModel();
        list = new JList(model);
        JScrollPane pane = new JScrollPane(list);
        JButton addButton = new JButton("Add Element");
        JButton removeButton = new JButton("Remove Element");
        for (int i = 0; i < 15; i++)
            model.addElement("Element " + i);

        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        add(pane, BorderLayout.NORTH);
        add(addButton, BorderLayout.WEST);
        add(removeButton, BorderLayout.EAST);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("List Model Example");
         frame.addWindowListener(new BasicWindowMonitor());
         frame.setContentPane(new ListModelExample());
         frame.setSize(300, 180);
         frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Add Element") {
            model.addElement("Element " + counter);
            counter++;
        } else {
            if (model.getSize() > 0)
                model.removeElementAt(0);
        }
    }
}

//  In the text on p. 170, we mention that the selections do not decrement 
//  with the removal of list items. Alas, this is no longer the case! The
//  selections will follow the items they have been assigned to, even
//  if that item disappears from the list.
//
//  A correction to the text will appear in the next printing of "Java
//  Swing."
