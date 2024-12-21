// Mnemonic.java
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mnemonic extends JFrame {

// Create a new frame with some buttons on it.
  public Mnemonic() {

    buttonPanel.setLayout(new GridLayout(1, 4, 4, 4));

    // Create the buttons.
    addButton("Sports", new ImageIcon("images/sports.gif"));
    addButton("Music", new ImageIcon("images/music.gif"));
    addButton("Travel", new ImageIcon("images/travel.gif"));
    addButton("Art", new ImageIcon("images/art.gif"));

    // Layout.
    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    c.add(new JLabel("Select an Activity"), BorderLayout.NORTH);
    c.add(buttonPanel, BorderLayout.CENTER);
    pack();
  }

  // Add a button to the button panel with the specified text and icon. The
  // first character of the text is used as a mnemonic key.
  private void addButton(String label, Icon icon) {

    // Use the first char as our key mnemonic
    final char key = label.charAt(0);
    JButton button = new JButton(label, icon);

    // this will register keystrokes with the ALT mask
    button.setMnemonic(key);
    button.setVerticalTextPosition(SwingConstants.BOTTOM);
    button.setHorizontalTextPosition(SwingConstants.CENTER);

    // add this button to the panel
    buttonPanel.add(button);
  }

  // button panel
  private JPanel buttonPanel = new JPanel();

  // A simple test program
  public static void main(String[] args) {
    Mnemonic acc = new Mnemonic();
    acc.setVisible(true);
  }
}
