// SimpleButtonGroupExample.java
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// A ButtonGroup voting booth.
public class SimpleButtonGroupExample {
  public static void main(String[] args) {
    // Some choices
    JRadioButton dem = new JRadioButton("B. Clinton", false);
    dem.setActionCommand("Bill");
    JRadioButton rep = new JRadioButton("R. Dole", false);
    rep.setActionCommand("Bob");
    JRadioButton ind = new JRadioButton("R. Perot", false);
    ind.setActionCommand("Ross");

    // A group, to ensure that we only vote for one.
    final ButtonGroup group = new ButtonGroup();
    group.add(dem);
    group.add(rep);
    group.add(ind);

    // A simple ActionListener, showing each selection using the ButtonModel.
    class VoteActionListener implements ActionListener {
      public void actionPerformed(ActionEvent ex) {
        String choice = group.getSelection().getActionCommand();
        System.out.println("ACTION Candidate Selected: " + choice);
      }
    }

    // A simple ItemListener, showing each selection and deselection.
    class VoteItemListener implements ItemListener {
      public void itemStateChanged(ItemEvent ex) {
        String item =
          ((AbstractButton)ex.getItemSelectable()).getActionCommand();
        boolean selected = (ex.getStateChange() == ItemEvent.SELECTED);
        System.out.println("ITEM Candidate Selected: " + selected +
          " Selection: " + item);
      }
    }

    // Add listeners to each button.
    ActionListener al = new VoteActionListener();
    dem.addActionListener(al);
    rep.addActionListener(al);
    ind.addActionListener(al);

    ItemListener il = new VoteItemListener();
    dem.addItemListener(il);
    rep.addItemListener(il);
    ind.addItemListener(il);

    // Throw everything together.
    JFrame frame = new JFrame();
    frame.addWindowListener(new BasicWindowMonitor());
    Container c = frame.getContentPane();
    c.setLayout(new GridLayout(4,1));
    c.add(new JLabel("Please Cast Your Vote"));
    c.add(dem);
    c.add(rep);
    c.add(ind);
    frame.pack();
    frame.setVisible(true);
  }
}
