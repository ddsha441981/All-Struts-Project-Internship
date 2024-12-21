// SimpleFileChooser.java
// Just a simple file chooser example to see what it takes to make one
// of these work.
//
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class SimpleFileChooser extends JFrame {
  JFrame parent;
  public SimpleFileChooser() {
    super("Table Test Frame");
    setSize(350, 200);
    addWindowListener(new BasicWindowMonitor());
    parent = this;

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    JButton openButton = new JButton("Open");
    JButton saveButton = new JButton("Save");
    JButton dirButton = new JButton("Pick Dir");
    final JLabel statusbar = 
                 new JLabel("Output of your selection will go here");

    // Create a file chooser that opens up as an "Open" dialog
    openButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showOpenDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
          statusbar.setText("You chose " + 
                            ((chooser.getSelectedFile()!=null)?
                              chooser.getSelectedFile().getName():
                              "nothing"));
        }
        else {
          statusbar.setText("You canceled.");
        }
      }
    });

    // Create a file chooser that opens up as a "Save" dialog
    saveButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showSaveDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
          statusbar.setText("You saved " + 
                            ((chooser.getSelectedFile()!=null)?
                              chooser.getSelectedFile().getName():
                              "nothing"));
        }
        else {
          statusbar.setText("You canceled.");
        }
      }
    });

    // Create a file chooser that allows you to pick a directory
    // rather than a file
    dirButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = chooser.showOpenDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
          statusbar.setText("You opened " + 
                            ((chooser.getSelectedFile()!=null)?
                              chooser.getSelectedFile().getName():
                              "nothing"));
        }
        else {
          statusbar.setText("You canceled.");
        }
      }
    });

    c.add(openButton);
    c.add(saveButton);
    c.add(dirButton);
    c.add(statusbar);
  }

  public static void main(String args[]) {
    SimpleFileChooser sfc = new SimpleFileChooser();
    sfc.setVisible(true);
  }
}
