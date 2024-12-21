// KeymapExample.java
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;

// A simple example showing how to add Actions for KeyStrokes
public class KeymapExample {
  public static void main(String[] args) {

    // Start with a simple JTextPane. Get its Keymap to use as our parent. Create
    // a new map called "FontStyleMap" and add it to the JTextComponent static
    // table. Finally, we set the map for out JTextPane to our new map.
    JTextPane tp = new JTextPane();
    Keymap parent = tp.getKeymap();
    Keymap map = JTextComponent.addKeymap("FontStyleMap", parent);

    // Add CTRL-B -> Bold
    KeyStroke boldStroke = KeyStroke.getKeyStroke(KeyEvent.VK_B,
      InputEvent.CTRL_MASK, false);
    map.addActionForKeyStroke(boldStroke, new StyledEditorKit.BoldAction());

    // Add CTRL-U -> Underline
    KeyStroke underStroke = KeyStroke.getKeyStroke(KeyEvent.VK_U,
      InputEvent.CTRL_MASK, false);
    map.addActionForKeyStroke(underStroke,
      new StyledEditorKit.UnderlineAction());

    // Set the map for our text pane to our new map
    tp.setKeymap(map);

    // Show the TextPane
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.setContentPane(tp);
    f.setSize(300, 200);
    f.setVisible(true);
  }
}
