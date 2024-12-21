// SliderExample.java
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SliderExample extends JPanel {

  public SliderExample() {

    super(true);

    this.setLayout(new BorderLayout());
    JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
    slider.setMinorTickSpacing(2);
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    slider.setPaintLabels(true);

    // Note that the following line is really unnecessary. By setting a
    // positive integer to the major tick spacing and setting the paintLabel
    // property to true, it's done for us!

    slider.setLabelTable(slider.createStandardLabels(10));
    add(slider, BorderLayout.CENTER);
  }

  public static void main(String s[]) {
    JFrame frame = new JFrame("Slider");
    frame.addWindowListener(new BasicWindowMonitor());
    frame.setContentPane(new SliderExample());
    frame.pack();
    frame.setVisible(true);
  }
}
