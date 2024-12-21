/*
 * ToolbarFrame4.java
 * The Swing-ified button example.  The buttons in this toolbar all carry
 * images but no text.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ToolbarFrame4 extends Frame {

  // This time, let's use JButtons!
  JButton cutButton, copyButton, pasteButton;
  JButton winButton, javaButton, motifButton;

  public ToolbarFrame4() {
    super("Toolbar Example (Swing no text)");
    setSize(450, 250);
    addWindowListener(new BasicWindowMonitor());

    // JPanel works much like Panel does, so we'll use it
    JPanel toolbar = new JPanel();
    toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

    CCPHandler handler = new CCPHandler();

    cutButton = new JButton(new ImageIcon("cut.gif"));
    cutButton.setActionCommand(CCPHandler.CUT);
    cutButton.addActionListener(handler);
    toolbar.add(cutButton);

    copyButton = new JButton(new ImageIcon("copy.gif"));
    copyButton.setActionCommand(CCPHandler.COPY);
    copyButton.addActionListener(handler);
    toolbar.add(copyButton);

    pasteButton = new JButton(new ImageIcon("paste.gif"));
    pasteButton.setActionCommand(CCPHandler.PASTE);
    pasteButton.addActionListener(handler);
    toolbar.add(pasteButton);

    add(toolbar, BorderLayout.NORTH);

    // Add the look and feel controls
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

  public static void main(String args[]) {
    ToolbarFrame4 tf4 = new ToolbarFrame4();
    tf4.setVisible(true);
  }
}
