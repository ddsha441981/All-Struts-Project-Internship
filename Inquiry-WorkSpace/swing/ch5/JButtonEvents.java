// JButtonEvents
//
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonEvents {
  public static void main(String[] args) {
    JButton jb = new JButton("Press Me");

    jb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        System.out.println("ActionEvent!");
      }
    });

    jb.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent ev) {
        System.out.println("ItemEvent!");
      }
    });

    jb.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent ev) {
        System.out.println("ChangeEvent!");
      }
    });

    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.getContentPane().add(jb);
    f.pack();
    f.setVisible(true);
  }
}
