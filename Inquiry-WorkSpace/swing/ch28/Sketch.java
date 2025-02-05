//  Sketch.java
//
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.*;

public class Sketch extends JPanel implements PropertyChangeListener,
    ActionListener {

    JogShuttle shuttle1;
    JogShuttle shuttle2;
    JPanel board;
    JButton clear;

    public Sketch() {
        super(true);
 
        setLayout(new BorderLayout());
        board = new JPanel(true);
        board.setPreferredSize(new Dimension(300, 300));
        board.setBorder(new LineBorder(Color.black, 5));

        clear = new JButton("Clear Drawing Area");
        clear.addActionListener(this);

        shuttle1 = new JogShuttle(0, 300, 150);
        shuttle2 = new JogShuttle(0, 300, 150);

        shuttle1.setValuePerRevolution(100);
        shuttle2.setValuePerRevolution(100);

        shuttle1.addPropertyChangeListener(this);
        shuttle2.addPropertyChangeListener(this);

        shuttle1.setBorder(new BevelBorder(BevelBorder.RAISED));
        shuttle2.setBorder(new BevelBorder(BevelBorder.RAISED));

        add(board, BorderLayout.NORTH);
        add(shuttle1, BorderLayout.WEST);
        add(clear, BorderLayout.CENTER);
        add(shuttle2, BorderLayout.EAST);
    }

    public void propertyChange(PropertyChangeEvent e) {

        if (e.getPropertyName() == "value") {
            Graphics g = board.getGraphics();
            g.setColor(getForeground());
            g.drawLine(shuttle1.getValue(), shuttle2.getValue(),
                   shuttle1.getValue(), shuttle2.getValue());
        }
    }

    public void actionPerformed(ActionEvent e) {

        //  The button must have been pressed.
        Insets insets = board.getInsets();
        Graphics g = board.getGraphics();
        g.setColor(board.getBackground());
        g.fillRect(insets.left, insets.top,
                   board.getWidth()-insets.left-insets.right,
                   board.getHeight()-insets.top-insets.bottom);
    }

    public static void main(String[] args) {

        UIManager.put("JogShuttleUI", "BasicJogShuttleUI");
        Sketch s = new Sketch();
        JFrame frame = new JFrame("Sample Sketch Application");
        frame.addWindowListener(new BasicWindowMonitor());
        frame.setContentPane(s);
        frame.pack();
        frame.setVisible(true);
    }
}
