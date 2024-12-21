//  BasicJogShuttleUI.java
//
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.*;
import javax.swing.border.*;

public class BasicJogShuttleUI extends JogShuttleUI implements MouseListener,
    MouseMotionListener {

    private int KNOB_DISPLACEMENT = 3;
    private int FINGER_SLOT_DISPLACEMENT = 15;

    private Point lastPoint = new Point();

    public BasicJogShuttleUI() {
       lastPoint = new Point();
    }

public static ComponentUI createUI(JComponent c) {
    return new BasicJogShuttleUI();
}

public void installUI(JComponent c) {
    JogShuttle shuttle = (JogShuttle)c;
    shuttle.addMouseListener(this);
    shuttle.addMouseMotionListener(this);
}

public void uninstallUI(JComponent c) {
    JogShuttle shuttle = (JogShuttle)c;
    shuttle.removeMouseListener(this);
    shuttle.removeMouseMotionListener(this);
}

    public void paint(Graphics g, JComponent c) {

        //  We don't want to paint inside of the insets or borders
        Insets insets = c.getInsets();
        g.translate(insets.left, insets.top);
        int width = c.getWidth()-insets.left-insets.right;
        int height = c.getHeight()-insets.top-insets.bottom;
 
        //  Draw the outside circle
        g.setColor(c.getForeground());
        g.fillOval(0, 0, width, height); 
       
        Insets d = ((JogShuttle)c).getDialInsets();
        int value = ((JogShuttle)c).getValue();
        int valuePerRevolution = ((JogShuttle)c).getValuePerRevolution();
 
        //  Draw the edge of the dial 
        g.setColor(Color.darkGray);
        g.fillOval(d.left, d.top, width-(d.right*2),height-(d.bottom*2)); 

        //  Draw the inside of the dial
        g.setColor(Color.gray);
        g.fillOval(d.left+KNOB_DISPLACEMENT,
                   d.top+KNOB_DISPLACEMENT,
                   width-(d.right+d.left)-(KNOB_DISPLACEMENT*2),
                   height-(d.bottom+d.top)-(KNOB_DISPLACEMENT*2)); 

        //  Draw the "finger slot"
        drawFingerSlot(g, c, value, width, height, valuePerRevolution,
                FINGER_SLOT_DISPLACEMENT-1,
                (double)(width/2)-d.right-FINGER_SLOT_DISPLACEMENT,
                (double)(height/2)-d.bottom-FINGER_SLOT_DISPLACEMENT);

        g.translate(-insets.left, -insets.top);
    }

    private void drawFingerSlot(Graphics g, JComponent c, int value,
        int width, int height, int valuePerRevolution, int size,
        double xradius, double yradius) {
    
        int currentPosition = value % valuePerRevolution;

        //  Obtain the current degrees in radians
        double degrees = ((double)currentPosition /
                                         100)*java.lang.Math.PI*2;
        degrees -= (java.lang.Math.PI/2);

        //  Obtain the X and Y coordinates of the finger slot. Assume that
        //  the origin mimics a unit circle (i.e., the right side of the circle)
        int xPosition = (int) (xradius * java.lang.Math.sin(degrees));
        int yPosition = (int) (yradius * java.lang.Math.cos(degrees));
        xPosition = (width/2) - xPosition; 
        yPosition = (height/2) + yPosition; 

        //  Draw the finger slot with a cresent shadow on the top left
        g.setColor(Color.darkGray); 
        g.fillOval(xPosition-(size/2), yPosition-(size/2), size, size); 
        g.setColor(Color.lightGray); 
        g.fillOval(xPosition-(size/2)+1, yPosition-(size/2)+1,
                   size-1, size-1); 

    }

    public void mousePressed(MouseEvent e) {lastPoint = e.getPoint();}
    public void mouseReleased(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }

    public void mouseDragged(MouseEvent e) {

        //  This interface is lousy. I encourage you to search for a better one.
        Point thisPoint = e.getPoint();
        JogShuttle theShuttle = (JogShuttle)e.getComponent();
        int difference = thisPoint.x - lastPoint.x;
        if (difference < 0)
            theShuttle.setValue(theShuttle.getValue() - 1);            
        else if (difference > 0)
            theShuttle.setValue(theShuttle.getValue() + 1);            
    }

    public void mouseMoved(MouseEvent e) { }
}
