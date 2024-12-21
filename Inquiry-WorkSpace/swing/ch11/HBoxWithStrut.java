// HBoxWithStrut.java
// A quick test of the box layout manager using the Box utility class.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HBoxWithStrut extends JFrame {

  public HBoxWithStrut() {
    super("Box & Strut Frame");
    setSize(350, 80);
    Box box = Box.createHorizontalBox();
    setContentPane(box);
    for (int i = 0; i < 3; i++) {
      Button b = new Button("B" + i);
      box.add(b);
    }

    // Add a spacer between the first three buttons and the last three
    box.add(Box.createHorizontalStrut(10));
    for (int i = 3; i < 6; i++) {
      Button b = new Button("B" + i);
      box.add(b);
    }
    addWindowListener(new BasicWindowMonitor());
    setVisible(true);
  }

  public static void main(String args[]) {
    HBoxWithStrut bt = new HBoxWithStrut();
  }
}
