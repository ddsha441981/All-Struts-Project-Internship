/*
 * ToolbarFrame1.java
 * A simple frame containing a "toolbar" made up of several java.awt.Button
 * objects.  We'll be converting the Buttons to JButtons in the
 * ToolbarFrame2.java file.
 */

import java.awt.*;
import java.awt.event.*;

public class ToolbarFrame1 extends Frame implements ActionListener {

  Button cutButton, copyButton, pasteButton;
  public ToolbarFrame1() {
    super("Toolbar Example (AWT)");
    setSize(450, 250);
    addWindowListener(new BasicWindowMonitor());
  
    Panel toolbar = new Panel();
    toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

    cutButton = new Button("Cut");
    cutButton.addActionListener(this);
    toolbar.add(cutButton);

    copyButton = new Button("Copy");
    copyButton.addActionListener(this);
    toolbar.add(copyButton);

    pasteButton = new Button("Paste");
    pasteButton.addActionListener(this);
    toolbar.add(pasteButton);

    add(toolbar, BorderLayout.NORTH);
  }

  public void actionPerformed(ActionEvent ae) {
    System.out.println(ae.getActionCommand());
  }

  public static void main(String args[]) {
    ToolbarFrame1 tf1 = new ToolbarFrame1();
    tf1.setVisible(true);
  }
}
