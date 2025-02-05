// ScrollDemo.java
// A simple JScrollPane demonstration.
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollDemo extends JFrame {

  JScrollPane scrollpane;

  public ScrollDemo() {
    super("JScrollPane Demonstration");
    setSize(300, 200);
    addWindowListener(new BasicWindowMonitor());
    init();
    setVisible(true);
  }

  public void init() {
    JRadioButton form[][] = new JRadioButton[12][5];
    String counts[] = { "", "0-1", "2-5", "6-10", "11-100", "101+" };
    String categories[] = { "Household", "Office", "Extended Family",
                            "Company (US)", "Company (World)", "Team",
                            "Will", "Birthday Card List", "High School",
                            "Country", "Continent", "Planet" };
    JPanel p = new JPanel();
    p.setSize(600, 400);
    p.setLayout(new GridLayout(13, 6, 10, 0));
    for (int row = 0; row < 13; row++) {
      ButtonGroup bg = new ButtonGroup();
      for (int col = 0; col < 6; col++) {
        if (row == 0) {
          p.add(new JLabel(counts[col]));
        }
        else {
          if (col == 0) {
            p.add(new JLabel(categories[row - 1]));
          }
          else {
            form[row - 1][col - 1] = new JRadioButton();
            bg.add(form[row -1][col - 1]);
            p.add(form[row -1][col - 1]);
         }
        }
      }
    }
    scrollpane = new JScrollPane(p);
    getContentPane().add(scrollpane, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    new ScrollDemo();
  }
}
