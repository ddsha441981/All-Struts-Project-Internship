// MetalModExample.java
//
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MetalModExample {
  public static void main(String[] args) {
    JComponent before = makeExamplePane();

    // Replace the MetalScrollBarUI with our own!
    UIManager.put("ScrollBarUI", "MyMetalScrollBarUI");

    JComponent after = makeExamplePane();

    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());

    Container c = f.getContentPane();
    c.setLayout(new GridLayout(2, 1, 0, 1));
    c.add(before);
    c.add(after);
    f.setSize(450, 400);
    f.setVisible(true);
  }

  // Create a scroll pane with a text area in it.
  public static JComponent makeExamplePane() {
    JTextArea text = new JTextArea();

    try {
      text.read(new FileReader("MetalModExample.java"), null);
    }
    catch (IOException ex) {}

    JScrollPane scroll = new JScrollPane(text);
    return scroll;
  }
}
