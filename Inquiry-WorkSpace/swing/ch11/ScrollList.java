// ScrollList.java
// A simple JScrollPane.
//
import javax.swing.*;
import java.awt.*;

public class ScrollList extends JFrame {

  JScrollPane scrollpane;

  public ScrollList() {
    super("JScrollPane Demonstration");
    setSize(300, 200);
    addWindowListener(new BasicWindowMonitor());

    String categories[] = { "Household", "Office", "Extended Family",
                            "Company (US)", "Company (World)", "Team",
                            "Will", "Birthday Card List", "High School",
                            "Country", "Continent", "Planet" };
    JList list = new JList(categories);
    scrollpane = new JScrollPane(list);

    getContentPane().add(scrollpane, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    ScrollList sl = new ScrollList();
    sl.setVisible(true);
  }
}
