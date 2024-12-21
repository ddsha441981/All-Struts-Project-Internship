// JTextFieldExample.java
//
import javax.swing.*;
import java.awt.event.*;

public class JTextFieldExample {
  
  public static void main(String[] args) {
    
    final JTextField field = new JTextField(20);
    field.setHorizontalAlignment(SwingConstants.RIGHT);

    field.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        System.out.println("Entered: " + field.getText());
      }
    });

    JFrame frame = new JFrame();
    frame.addWindowListener(new BasicWindowMonitor());
    frame.getContentPane().add(field);
    frame.pack();
    frame.setVisible(true);
  }
}
