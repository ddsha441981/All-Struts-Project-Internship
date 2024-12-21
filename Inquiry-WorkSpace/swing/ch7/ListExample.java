//  ListExample.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListExample extends JPanel implements ActionListener {

    private String titles[] = { "Designing With JavaScript",
                                "Exploring Java, 2nd Edition",
                                "Developing Java Beans",
                                "Database Programming with JDBC and Java",
                                "Java in a Nutshell, Deluxe Edition",
                                "Java Fundamental Classes Reference",
                                "Java Language Reference, 2nd Edition",
                                "Java Networking",
                                "Java Virtual Machine",
                                "Java AWT Reference",
                                "Java Examples in a Nutshell",
                                "Java Threads",
                                "Java in a Nutshell, 2nd Edition" };
    private ImageIcon bookImage[] = new ImageIcon[13];
    private JList booklist;

    public ListExample() {
        super(true);
        bookImage[0] = new ImageIcon("designjs.s.gif"); 
        bookImage[1] = new ImageIcon("expjava2.s.gif"); 
        bookImage[2] = new ImageIcon("javabeans.s.gif"); 
        bookImage[3] = new ImageIcon("javadata.s.gif"); 
        bookImage[4] = new ImageIcon("javadeluxe.s.gif"); 
        bookImage[5] = new ImageIcon("javafund.s.gif"); 
        bookImage[6] = new ImageIcon("javalang2.s.gif"); 
        bookImage[7] = new ImageIcon("javanetwk.s.gif"); 
        bookImage[8] = new ImageIcon("javavm.s.gif"); 
        bookImage[9] = new ImageIcon("javawt.s.gif"); 
        bookImage[10] = new ImageIcon("jenut.s.gif"); 
        bookImage[11] = new ImageIcon("jthreads.s.gif"); 
        bookImage[12] = new ImageIcon("javanut2.s.gif"); 
 
        this.setLayout(new BorderLayout());
        JButton button = new JButton("Print");
        button.addActionListener(this);

        booklist = new JList(titles);
        booklist.setCellRenderer(new BookCellRenderer());
        booklist.setVisibleRowCount(4);
        JScrollPane pane = new JScrollPane(booklist);

        add(pane, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("List Example");
         frame.addWindowListener(new BasicWindowMonitor());
         frame.setContentPane(new ListExample());
         frame.pack();
         frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int selected[] = booklist.getSelectedIndices();
        System.out.println("Selected Elements:  ");

        for (int i=0; i < selected.length; i++) {
            String element = (String)booklist.getModel().
                                          getElementAt(selected[i]);
            System.out.println("  " + element);
        }
    }

    //  Inner class BookCellRenderer
    class BookCellRenderer extends JLabel implements ListCellRenderer
    {
        Color highlightColor = new Color(0, 0, 128);
    
        BookCellRenderer() {
            setOpaque(true);
        }
        public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus)
        {
            //  If this is the selection value request from a combo box
            //  then find out the current selected index from the list.
            if (index == -1) {
                int selected = list.getSelectedIndex();
                if (selected == -1)
                    return this;
                else
                    index = selected;
            }
            setText(" " + titles[index]);
            setIcon(bookImage[index]);
            if(isSelected) {
                setBackground(highlightColor);
                setForeground(Color.white);
            } else {
                setBackground(Color.white);
                setForeground(Color.black);
            }
            return this;
        }
    }
}
