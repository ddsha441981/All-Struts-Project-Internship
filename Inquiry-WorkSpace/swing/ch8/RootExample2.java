// RootExample2.java
//
import javax.swing.*;
import java.awt.*;

public class RootExample2 {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    JRootPane root = f.getRootPane();

    // Create a menu bar
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("File");
    bar.add(menu);
    menu.add("Open");
    menu.add("Close");
    root.setJMenuBar(bar);

    // Add a button to the content pane
    root.getContentPane().add(new JButton("Hello World"));

    // Display the UI
    f.pack();
    f.setVisible(true);
  }
}
