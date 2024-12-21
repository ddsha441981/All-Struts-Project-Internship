// StyleBox.java
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

// A class that allows several paragraph style attributes to be entered and
// provides methods to add the attributes to a Style object or set the contents
// based on an existing Style.
public class StyleBox extends Container {

  // Create the box and add the fields
  public StyleBox() {
    setLayout(new GridBagLayout());
    gbc.insets = new Insets(1, 1, 1, 1);
    nameField = addField("Style Name", "");
    fontCombo = addCombo("Font", fonts, true);
    sizeCombo = addCombo("Size", sizes, true);
    leftField = addField("Left Indent", "0.0");
    rightField = addField("Right Indent", "0.0");
    aboveField = addField("Space Above", "0.0");
    belowField = addField("Space Below", "0.0");
    boldCheck = addCheck("Bold");
    italicCheck = addCheck("Italic");
  }

  // Return the name of the Style
  public String getStyleName() {
    String name = nameField.getText();
    if (name.length() > 0)
      return name;
    else
      return null;
  }

  // Fill the given Style object with the attributes entered in the fields. No
  // format checking is done in this version!
  public void fillStyle(Style style) {
    String font = (String)fontCombo.getSelectedItem();
    StyleConstants.setFontFamily(style, font);

    String size = (String)sizeCombo.getSelectedItem();
    StyleConstants.setFontSize(style, Integer.parseInt(size));

    String left = leftField.getText();
    StyleConstants.setLeftIndent(style, Float.valueOf(left).floatValue());

    String right = rightField.getText();
    StyleConstants.setRightIndent(style, Float.valueOf(right).floatValue());

    String above = aboveField.getText();
    StyleConstants.setSpaceAbove(style, Float.valueOf(above).floatValue());

    String below = belowField.getText();
    StyleConstants.setSpaceBelow(style, Float.valueOf(below).floatValue());

    boolean bold = boldCheck.isSelected();
    StyleConstants.setBold(style, bold);

    boolean italic = italicCheck.isSelected();
    StyleConstants.setItalic(style, italic);
  }

  // Load the form from an existing Style.
  public void loadFromStyle(Style style) {
    nameField.setText(style.getName());
    nameField.setEditable(false); // don't change the name

    String fam = StyleConstants.getFontFamily(style);
    fontCombo.setSelectedItem(fam);

    int size = StyleConstants.getFontSize(style);
    sizeCombo.setSelectedItem(Integer.toString(size));

    float left = StyleConstants.getLeftIndent(style);
    leftField.setText(Float.toString(left));

    float right = StyleConstants.getRightIndent(style);
    rightField.setText(Float.toString(right));

    float above = StyleConstants.getSpaceAbove(style);
    aboveField.setText(Float.toString(above));

    float below = StyleConstants.getSpaceBelow(style);
    belowField.setText(Float.toString(below));

    boolean bold = StyleConstants.isBold(style);
    boldCheck.setSelected(bold);

    boolean italic = StyleConstants.isItalic(style);
    italicCheck.setSelected(italic);
  }

  // Reset all fields
  public void clear() {
    nameField.setText("");
    nameField.setEditable(true);
    fontCombo.setSelectedIndex(0);
    sizeCombo.setSelectedIndex(0);
    leftField.setText("0.0");
    rightField.setText("0.0");
    aboveField.setText("0.0");
    belowField.setText("0.0");
    boldCheck.setSelected(false);
    italicCheck.setSelected(false);
  }

  // Add a JLabel/JTextField pair
  protected JTextField addField(String text, String value) {
    gbc.gridx = 0;
    gbc.anchor = GridBagConstraints.EAST;
    gbc.gridy++;
    JLabel l = new JLabel(text);
    add(l, gbc);
    JTextField tf = new JTextField(value, 10);
    gbc.gridx = 1;
    gbc.anchor = GridBagConstraints.WEST;
    add(tf, gbc);
    return tf;
  }

  // Add a JLabel/JComboBox pair
  protected JComboBox addCombo(String text,String[] choices,boolean editable) {
    gbc.gridx = 0;
    gbc.anchor = GridBagConstraints.EAST;
    gbc.gridy++;
    JLabel l = new JLabel(text);
    add(l, gbc);
    JComboBox cb = new JComboBox();
    cb.setEditable(editable);
    cb.setSelectedItem(choices[0]);
    cb.setBorder(BorderFactory.createLineBorder(Color.black));
    for (int i=0; i<choices.length; i++)
      cb.addItem(choices[i]);
    gbc.gridx = 1;
    gbc.anchor = GridBagConstraints.WEST;
    add(cb, gbc);
    return cb;
  }

  // Add a JCheckBox
  protected JCheckBox addCheck(String text) {
    gbc.gridx = 0;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    gbc.gridy++;
    JCheckBox cb = new JCheckBox(text);
    add(cb, gbc);
    return cb;
  }

  private GridBagConstraints gbc = new GridBagConstraints();

  private JTextField nameField;
  private JComboBox fontCombo;
  private JComboBox sizeCombo;
  private JTextField leftField;
  private JTextField rightField;
  private JTextField aboveField;
  private JTextField belowField;
  private JCheckBox boldCheck;
  private JCheckBox italicCheck;

  private static final String[] fonts = {"Serif", "SansSerif", "Monospaced"};
  private static final String[] sizes = {"8", "10", "12", "18", "24", "36"};
}
