// ClockTest.java
// A demonstration framework for the Timer driven ClockLabel class.
//
import javax.swing.*;
import java.awt.*;

public class ClockTest extends JFrame {

  public ClockTest() {
    super("Timer Demo");
    setSize(300, 100);
    addWindowListener(new BasicWindowMonitor());

    ClockLabel clock = new ClockLabel();
    getContentPane().add(clock, BorderLayout.NORTH);
  }

  public static void main(String args[]) {
    ClockTest ct = new ClockTest();
    ct.setVisible(true);
  }
}
