// SelectableTextArea
// A class that extends JTextArea and supports the common Ctrl-A shortcut
// for selecting all of the text in the field.
//
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class SelectableTextArea extends JTextArea {
  public SelectableTextArea(String text, int rows, int cols) {
    super(text, rows, cols);
    Keymap km = getKeymap();

    // get the "Ctrl-A" key code
    // and attach it to a selectAll() call for this component
    km.addActionForKeyStroke(
      KeyStroke.getKeyStroke('A', KeyEvent.CTRL_MASK, true),
      new AbstractAction() {
        public void actionPerformed(ActionEvent ae) {
          SelectableTextArea.this.selectAll();
        }
      }
    );
  }
}
