// MixerTest.java
// A test of the JTable class using default table models and a convenience
// constructor.
//
import java.awt.*;
import javax.swing.*;

public class MixerTest extends JFrame {

  public MixerTest() {
    super("Customer Editor Test");
    setSize(600,160);
    addWindowListener(new BasicWindowMonitor());

    MixerModel test = new MixerModel();
    test.dump();
    JTable jt = new JTable(test);
    jt.setDefaultRenderer(Volume.class, new VolumeRenderer());
    JScrollPane jsp = new JScrollPane(jt);
    jsp.setColumnHeaderView(jt.getTableHeader());
    getContentPane().add(jsp, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    MixerTest mt = new MixerTest();
    mt.setVisible(true);
  }
}
