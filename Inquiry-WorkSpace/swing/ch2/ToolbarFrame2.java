/*
 * ToolbarFrame2.java
 * The Swing-ified button example.  
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolbarFrame2 extends Frame implements ActionListener {

  // This time, let's use JButtons!
  JButton cutButton, copyButton, pasteButton;
  JButton winButton, javaButton, motifButton;

  public ToolbarFrame2() {
    super("Toolbar Example (Swing)");
    setSize(450, 250);
    addWindowListener(new BasicWindowMonitor());
  
    JPanel toolbar = new JPanel();
    toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

    cutButton = new JButton("Cut");
    cutButton.addActionListener(this);
    toolbar.add(cutButton);

    copyButton = new JButton("Copy");
    copyButton.addActionListener(this);
    toolbar.add(copyButton);

    pasteButton = new JButton("Paste");
    pasteButton.addActionListener(this);
    toolbar.add(pasteButton);

    add(toolbar, BorderLayout.NORTH);  // the new "preferred" BorderLayout add

    // Add the look and feel controls using regular AWT buttons
    JPanel lnfPanel = new JPanel();
    LnFListener lnfListener = new LnFListener(this);
    javaButton = new JButton("Metal");
    javaButton.addActionListener(lnfListener);
    lnfPanel.add(javaButton);
    motifButton = new JButton("Motif");
    motifButton.addActionListener(lnfListener);
    lnfPanel.add(motifButton);
    winButton = new JButton("Windows");
    winButton.addActionListener(lnfListener);
    lnfPanel.add(winButton);
    add(lnfPanel, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent ae) {
    System.out.println(ae.getActionCommand());
  }

  public static void main(String args[]) {
    ToolbarFrame2 tf2 = new ToolbarFrame2();
    tf2.setVisible(true);
  }
}
