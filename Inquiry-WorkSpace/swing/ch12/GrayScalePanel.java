// GrayScalePanel.java
// A simple implementation of the AbstractColorChooserPanel class. This class
// provides a slider for picking out a shade of gray.
//
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;

public class GrayScalePanel extends AbstractColorChooserPanel 
                            implements ChangeListener {

  JSlider scale;

  // Set up our list of grays.  We'll assume we have all 256 possible shades, and
  // we'll do it when the class is loaded.
  static Color[] grays = new Color[256];
  static {
    for (int i=0; i<256; i++) { grays[i] = new Color(i, i, i); }
  }

  public GrayScalePanel() {
    setLayout(new GridLayout(0, 1));

    // create the slider and attach us as a listener
    scale = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
    scale.addChangeListener(this);

    // Set up our display for the chooser
    add(new JLabel("Pick your shade of gray:", JLabel.CENTER));
    JPanel jp = new JPanel();
    jp.add(new JLabel("Black"));
    jp.add(scale);
    jp.add(new JLabel("White"));
    add(jp);
  }

  // We did this work in the constructor so we can skip it here.
  protected void buildChooser() { }

  // Make sure the slider is in sync with the other chooser panels. We rely on
  // the red channel, but we could do a fancier averaging if we really wanted to.
  public void updateChooser() { 
    scale.setValue(getColorSelectionModel().getSelectedColor().getRed());
  }

  // Pick a name for our tab in the chooser
  public String getDisplayName() { return "Gray Scale"; }

  // No need for an icon.
  public Icon getSmallDisplayIcon() { return null; }
  public Icon getLargeDisplayIcon() { return null; }
  // And lastly, update the selection model as our slider changes.
  public void stateChanged(ChangeEvent ce) {
    getColorSelectionModel().setSelectedColor(grays[scale.getValue()]);
  }
}
