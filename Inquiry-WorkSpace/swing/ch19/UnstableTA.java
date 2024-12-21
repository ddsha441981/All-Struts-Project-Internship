// UnstableTA.java
//
import javax.swing.*;
import java.awt.*;

public class UnstableTA {
  public static void main(String[] args) {
    JTextArea area = new JTextArea(3, 10);

    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    f.getContentPane().setLayout(new FlowLayout());
    f.getContentPane().add(area);
    f.setSize(200, 110);
    f.setVisible(true);
  }
}
