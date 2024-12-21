// AccessoryFileChooser.java, just a simple file chooser example 
// to see what it takes to make one of these work.
//
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class AccessoryFileChooser extends JFrame {
  JFrame parent;
  public AccessoryFileChooser() {
    super("Accessory Test Frame");
    setSize(350, 200);
    addWindowListener(new BasicWindowMonitor());
    parent = this;
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    JButton accButton = new JButton("Accessory");
    final JLabel statusbar = 
                 new JLabel("Output of your selection will go here");

    accButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        JFileChooser chooser = new JFileChooser();
        AudioAccessory aa = new AudioAccessory();
        chooser.setAccessory(aa);
        chooser.addPropertyChangeListener(aa);
        int option = chooser.showOpenDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
          statusbar.setText("You chose " + 
           ((chooser.getSelectedFile()!=null)?
            chooser.getSelectedFile().getName():"nothing"));
        }
        else {
          statusbar.setText("You canceled.");
        }
      }
    });
    c.add(accButton);
    c.add(statusbar);
  }

  public static void main(String args[]) {
    AccessoryFileChooser afc = new AccessoryFileChooser();
    afc.setVisible(true);
  }
}
