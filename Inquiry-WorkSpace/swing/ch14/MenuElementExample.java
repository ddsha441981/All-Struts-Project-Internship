//  MenuElementExample.java
//

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class MenuElementExample extends JPanel implements ActionListener,
    PopupMenuListener, MouseListener {

    public JPopupMenu popup;
    SliderMenuItem slider;
    int theValue = 0;

    public MenuElementExample() {

        popup = new JPopupMenu(); 
        slider = new SliderMenuItem();

        popup.add(slider);
        popup.add(new JSeparator());

        JMenuItem ticks = new JCheckBoxMenuItem("Slider Tick Marks");
        JMenuItem labels = new JCheckBoxMenuItem("Slider Labels");
        ticks.addActionListener(this);
        labels.addActionListener(this);

        popup.add(ticks);
        popup.add(labels);
        popup.addPopupMenuListener(this);

        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) { popupCheck(e); }
    public void mouseClicked(MouseEvent e) { popupCheck(e); }
    public void mouseReleased(MouseEvent e) { popupCheck(e); }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    private void popupCheck(MouseEvent e) {
        if (e.isPopupTrigger()) { 
            popup.show(this, e.getX(), e.getY());
        } 
    }

    public void popupMenuWillBecomeVisible(PopupMenuEvent e) { }

    public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        theValue = slider.getValue();
        System.out.println("The value is now " + theValue);
    }

    public void popupMenuCanceled(PopupMenuEvent e) {
        System.out.println("Popup menu is hidden!");
    }
  
    public void actionPerformed(ActionEvent event) {
         if (event.getActionCommand() == "Slider Tick Marks")
             slider.setPaintTicks(!slider.getPaintTicks());
         if (event.getActionCommand() == "Slider Labels")
             slider.setPaintLabels(!slider.getPaintLabels());
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("Menu Element Example");
        frame.addWindowListener(new BasicWindowMonitor());
        frame.setContentPane(new MenuElementExample());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class SliderMenuItem extends JSlider implements MenuElement {

        public SliderMenuItem() {
            setBorder(new CompoundBorder(new TitledBorder("Control"),
                                  new EmptyBorder(10, 10, 10, 10)));

            setMajorTickSpacing(20); 
            setMinorTickSpacing(10); 
        }

        public void processMouseEvent(MouseEvent e, MenuElement path[],
                                    MenuSelectionManager manager) {}

        public void processKeyEvent(KeyEvent e, MenuElement path[],
                                    MenuSelectionManager manager) {}

        public void menuSelectionChanged(boolean isIncluded) {}
 
        public MenuElement[] getSubElements() {return new MenuElement[0];}

        public Component getComponent() {return this;}
    }
}
