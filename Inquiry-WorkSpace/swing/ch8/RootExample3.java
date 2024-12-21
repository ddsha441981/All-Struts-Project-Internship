// RootExample3.java
//
import javax.swing.*;
import java.awt.*;

public class RootExample3 {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("File");
    bar.add(menu);
    menu.add("Open");
    menu.add("Close");

    // Shortcuts provided by JFrame (and other RootPaneContainers)...
    f.setJMenuBar(bar);
    f.getContentPane().add(new JButton("Hello World"));

    f.pack();
    f.setVisible(true);
  }
}
