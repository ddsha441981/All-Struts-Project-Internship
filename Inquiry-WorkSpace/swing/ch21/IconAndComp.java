// IconAndComp.java
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

// Shows that Icons and Components can be added to a JTextPane
public class IconAndComp {
  public static void main(String[] args) {
    final JTextPane pane = new JTextPane();

    // Add an icon button
    final ImageIcon icon = new ImageIcon("images/bluepaw.gif");
    JButton iconButton = new JButton(icon);
    iconButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        pane.insertIcon(icon);
      }
    });

    // Add a "Button" button
    JButton buttonButton = new JButton("Insert Button");
    buttonButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        pane.insertComponent(new Button("Click Me"));
      }
    });

    // Lay out . . .
    JPanel buttons = new JPanel();
    buttons.add(iconButton);
    buttons.add(buttonButton);

    JFrame frame = new JFrame();
    frame.addWindowListener(new BasicWindowMonitor());
    frame.setSize(300,200);
    Container c = frame.getContentPane();
    c.setLayout(new BorderLayout());
    c.add(pane, BorderLayout.CENTER);
    c.add(buttons, BorderLayout.SOUTH);
    frame.setVisible(true);
  }
}
