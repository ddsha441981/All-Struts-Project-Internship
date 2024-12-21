// SelectableTest.java
// A test of the SelectableTextArea class.
//
import javax.swing.*;
import java.awt.BorderLayout;

public class SelectableTest extends JFrame {

  public SelectableTest() {
    super("Selectable Text Area Test");
    setSize(400, 300);
    addWindowListener(new BasicWindowMonitor());

    SelectableTextArea sta = new SelectableTextArea("Starter text", 8, 40);
    getContentPane().add(sta, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    SelectableTest st = new SelectableTest();
    st.setVisible(true);
  }
}
