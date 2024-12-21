// MyViewChooser.java
// A simple example to see what it takes to make one of these FileViews work.
//
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MyViewChooser extends JFrame {
  JFrame parent;
  public MyViewChooser() {
    super("File View Test Frame");
    setSize(350, 200);
    addWindowListener(new BasicWindowMonitor());
    parent = this;

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    JButton openButton = new JButton("Open");
    final JLabel statusbar = 
                 new JLabel("Output of your selection will go here");

    openButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        JFileChooser chooser = new JFileChooser();

        // ok, set up our own file view for the chooser
        chooser.setFileView(new ThumbNailFileView(MyViewChooser.this));

        int option = chooser.showOpenDialog(parent);
        if (option == JFileChooser.APPROVE_OPTION) {
          statusbar.setText("You chose " + 
                            chooser.getSelectedFile().getName());
        }
        else {
          statusbar.setText("You cancelled.");
        }
      }
    });

    c.add(openButton);
    c.add(statusbar);
  }

  public static void main(String args[]) {
    MyViewChooser vc = new MyViewChooser();
    vc.setVisible(true);
  }
}
