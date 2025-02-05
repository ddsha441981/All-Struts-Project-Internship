// CurvedExample.java
//

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
//import java.awt.swing.*;
//import java.awt.swing.border.*;

public class CurvedExample extends JPanel {

    public CurvedExample() {
        super(true);

        JSlider mySlider = new JSlider();
        mySlider.setMajorTickSpacing(20);
        mySlider.setMinorTickSpacing(10);
        mySlider.setPaintTicks(true);
        mySlider.setPaintLabels(true);

        CurvedBorder border = new CurvedBorder(10, Color.darkGray);
        mySlider.setBorder(border);

        add(mySlider);
    }

    public static void main(String s[]) {
         JFrame frame = new JFrame("Custom Curved Border");
         frame.addWindowListener(new BasicWindowMonitor());
         frame.setSize(300,150);
         frame.setContentPane(new CurvedExample());
         frame.setVisible(true);
    }
}
