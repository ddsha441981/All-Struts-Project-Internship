// RootExample.java
//
import javax.swing.*;
import java.awt.*;

public class RootExample {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    JRootPane root = f.getRootPane();          // XXX
    Container content = root.getContentPane(); // XXX
    content.add(new JButton("Hello"));         // XXX
    f.pack();
    f.setVisible(true);
  }
}
