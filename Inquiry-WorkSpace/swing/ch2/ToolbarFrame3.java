/*
 * ToolbarFrame3.java
 * The Swing-ified button example.  The buttons in this toolbar all carry
 * images as well as text.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolbarFrame3 extends Frame implements ActionListener {

  // This time, let's use JButtons!
  JButton cutButton, copyButton, pasteButton;
  JButton winButton, javaButton, motifButton;

  public ToolbarFrame3() {
    super("Toolbar Example (Swing)");
    setSize(450, 250);
    addWindowListener(new BasicWindowMonitor());
  
    JPanel toolbar = new JPanel();
    toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

    cutButton = new JButton("Cut", new ImageIcon("cut.gif"));
    cutButton.addActionListener(this);
    toolbar.add(cutButton);

    copyButton = new JButton("Copy", new ImageIcon("copy.gif"));
    copyButton.addActionListener(this);
    toolbar.add(copyButton);

    pasteButton = new JButton("Paste", new ImageIcon("paste.gif"));
    pasteButton.addActionListener(this);
    toolbar.add(pasteButton);

    add(toolbar, BorderLayout.NORTH);

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
    ToolbarFrame3 tf3 = new ToolbarFrame3();
    tf3.setVisible(true);
  }
}
