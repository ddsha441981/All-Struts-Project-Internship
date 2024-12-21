// ColorPicker2.java
// A quick test of the JColorChooser dialog.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.colorchooser.*;

public class ColorPicker2 extends JFrame {

  JFrame parent;
  Color c;

  public ColorPicker2() {
    super("JColorChooser Test Frame");
    setSize(200, 100);
    parent = this;
    final JButton go = new JButton("Show JColorChoser");
    go.addActionListener(new ActionListener() {
      final JColorChooser chooser = new JColorChooser();
      boolean first = true;
      public void actionPerformed(ActionEvent e) {
        if (first) {
          first = false;
          GrayScalePanel gsp = new GrayScalePanel();

          // Bug workaround--you should eventually be able to replace the
          // remainder of this if statement with one line:
          // chooser.addChooserPanel(gsp);
	     // Can also cause odd side effects that should go away with bug fixes
          AbstractColorChooserPanel[] oldPanels =
                                      chooser.getChooserPanels();
          AbstractColorChooserPanel[] newPanels = 
             new AbstractColorChooserPanel[oldPanels.length + 1];
          int i;
          for (i = 0; i < oldPanels.length; i++) {
            newPanels[i] = oldPanels[i];
          }
          newPanels[i] = gsp;
          chooser.setChooserPanels(newPanels);
        }
        JDialog dialog = JColorChooser.createDialog(parent, "Demo 2", true,
                         chooser, new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                              c = chooser.getColor();
                            }}, null);
        dialog.setVisible(true);
        go.setBackground(c);
      }
    });
    getContentPane().add(go);
    addWindowListener(new BasicWindowMonitor());
  }

  public static void main(String args[]) {
    ColorPicker2 cp2 = new ColorPicker2();
    cp2.setVisible(true);
  }
}
