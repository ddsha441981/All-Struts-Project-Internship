/*
 * SimpleInternalFrame.java
 * A quick demonstration of setting up an Internal Frame in an application.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleInternalFrame extends Frame implements ActionListener {

  JButton openButton, winButton, javaButton, motifButton;
  JLayeredPane desktop;
  JInternalFrame internalFrame;

  public SimpleInternalFrame() {
    super("Internal Frame Demo");
    setSize(500,400);
    openButton = new JButton("Open");
    winButton = new JButton("Windows");
    javaButton = new JButton("Metal");
    motifButton = new JButton("Motif");
    Panel p = new Panel();
    p.add(openButton);
    p.add(javaButton);
    p.add(motifButton);
    p.add(winButton);
    add(p, BorderLayout.SOUTH);
    addWindowListener(new BasicWindowMonitor());
    openButton.addActionListener(this);
    LnFListener lnf = new LnFListener(this);
    winButton.addActionListener(lnf);
    javaButton.addActionListener(lnf);
    motifButton.addActionListener(lnf);

    // Set up the layered pane
    desktop = new JDesktopPane();
    desktop.setOpaque(true);
    add(desktop, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e) {
    if ((internalFrame == null) || (internalFrame.isClosed())) {
      internalFrame = new JInternalFrame("Internal Frame", 
					 true, true, true, true);
      internalFrame.setBounds(50, 50, 200, 100);
      if (internalFrame.isIconifiable()) {
	System.out.println("It's iconifiable...");
      }
      else { // bug work around...
	internalFrame.setIconifiable(true);
      }
      desktop.add(internalFrame, new Integer(1));    
    }
  }

  public static void main(String args[]) {
    SimpleInternalFrame sif = new SimpleInternalFrame();
    sif.setVisible(true);
  }

}

