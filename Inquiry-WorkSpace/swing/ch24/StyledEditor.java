// StyledEditor.java
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;

// An extension of SimpleEditor that adds styled-text features
public class StyledEditor extends SimpleEditor{

  public static void main(String[] args) {
    StyledEditor editor = new StyledEditor();
    editor.setVisible(true);
  }

  // Override to create a JTextPane
  protected JTextComponent createTextComponent() {
    return new JTextPane();
  }

  // Add icons & friendly names for font actions
  protected void makeActionsPretty() {
    super.makeActionsPretty();

    Action a;
    a = getHashedAction("font-bold");
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/bold.gif"));
    a.putValue(Action.NAME, "Bold");
    a = getHashedAction("font-italic");
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/italic.gif"));
    a.putValue(Action.NAME, "Italic");
    a = getHashedAction("font-underline");
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/underline.gif"));
    a.putValue(Action.NAME, "Underline");

    a = getHashedAction("font-family-SansSerif");
    a.putValue(Action.NAME, "SansSerif");
    a = getHashedAction("font-family-Monospaced");
    a.putValue(Action.NAME, "Monospaced");
    a = getHashedAction("font-family-Serif");
    a.putValue(Action.NAME, "Serif");

    a = getHashedAction("font-size-10");
    a.putValue(Action.NAME, "10");
    a = getHashedAction("font-size-12");
    a.putValue(Action.NAME, "12");
    a = getHashedAction("font-size-16");
    a.putValue(Action.NAME, "16");
    a = getHashedAction("font-size-24");
    a.putValue(Action.NAME, "24");
  }

  // Add key mappings for font style features. The CtrlIFocusManager used here is
  // defined in Chapter 22.
  protected void updateKeymap() {

    // Start with the keymap defined in SimpleEditor
    super.updateKeymap();

    FocusManager.setCurrentManager(new CtrlIFocusManager());

    // Extend the map defined by SimpleEditor
    JTextComponent comp = getTextComponent();
    Keymap map = JTextComponent.addKeymap("BoldUnderMap", comp.getKeymap());
    KeyStroke bold = KeyStroke.getKeyStroke(KeyEvent.VK_B,
      InputEvent.CTRL_MASK, false);
    KeyStroke italic = KeyStroke.getKeyStroke(KeyEvent.VK_I,
      InputEvent.CTRL_MASK, false);
    KeyStroke under = KeyStroke.getKeyStroke(KeyEvent.VK_U,
      InputEvent.CTRL_MASK, false);
    map.addActionForKeyStroke(bold, getHashedAction("font-bold"));
    map.addActionForKeyStroke(italic, getHashedAction("font-italic"));
    map.addActionForKeyStroke(under, getHashedAction("font-underline"));

    // Set the keymap for our component
    comp.setKeymap(map);
  }

  // Add font actions to the toolbar
  protected JToolBar createToolBar() {
    JToolBar bar = super.createToolBar();
    bar.addSeparator();

    bar.add(getHashedAction("font-bold")).setText("");
    bar.add(getHashedAction("font-italic")).setText("");
    bar.add(getHashedAction("font-underline")).setText("");

    return bar;
  }

  // Add font actions to the menu
  protected JMenuBar createMenuBar() {
    JMenuBar menubar = super.createMenuBar();
    JMenu font = new JMenu("Font");
    menubar.add(font);

    JMenu style = new JMenu("Style");
    JMenu family = new JMenu("Family");
    JMenu size = new JMenu("Size");
    font.add(style);
    font.add(family);
    font.add(size);

    style.add(getHashedAction("font-bold"));
    style.add(getHashedAction("font-underline"));
    style.add(getHashedAction("font-italic"));

    family.add(getHashedAction("font-family-SansSerif"));
    family.add(getHashedAction("font-family-Monospaced"));
    family.add(getHashedAction("font-family-Serif"));

    size.add(getHashedAction("font-size-10"));
    size.add(getHashedAction("font-size-12"));
    size.add(getHashedAction("font-size-16"));
    size.add(getHashedAction("font-size-24"));

    // Don't forget, we can define new actions too!
    size.add(new StyledEditorKit.FontSizeAction("64", 64));

    return menubar;
  }
}
