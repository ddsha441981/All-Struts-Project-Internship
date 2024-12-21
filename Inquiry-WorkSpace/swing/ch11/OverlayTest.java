// OverlayTest.java
// A test of the OverlayLayout manger . . .
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OverlayTest extends JFrame {

  public OverlayTest(float[] alignments) {
    super("OverlayLayout Test");
    setSize(400, 200);
    addWindowListener(new BasicWindowMonitor());

    Container c = getContentPane();

    final JPanel p1 = new GridPanel();
    final OverlayLayout overlay = new OverlayLayout(p1);
    p1.setLayout(overlay);

    final JButton jb1 = new JButton("B1");
    final JButton jb2 = new JButton("Button 2");
    final JButton jb3 = new JButton("Another Button");

    SimpleReporter reporter = new SimpleReporter();
    jb1.addActionListener(reporter);
    jb2.addActionListener(reporter);
    jb3.addActionListener(reporter);

    p1.add(jb1);
    p1.add(jb2);
    p1.add(jb3);

    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(1,7));
    final JTextField x1 = new JTextField("0", 4); //Button1 x alignment
    final JTextField y1 = new JTextField("0", 4); //Button1 y alignment
    final JTextField x2 = new JTextField("0", 4);
    final JTextField y2 = new JTextField("0", 4);
    final JTextField x3 = new JTextField("0", 4);
    final JTextField y3 = new JTextField("0", 4);

    p2.add(x1);
    p2.add(y1);
    p2.add(x2);
    p2.add(y2);
    p2.add(x3);
    p2.add(y3);
    
    JButton updateButton = new JButton("Update");
    //Note that we expect real values in the text fields
    updateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        jb1.setAlignmentX(Float.valueOf(x1.getText().trim()).floatValue());
        jb1.setAlignmentY(Float.valueOf(y1.getText().trim()).floatValue());
        jb2.setAlignmentX(Float.valueOf(x2.getText().trim()).floatValue());
        jb2.setAlignmentY(Float.valueOf(y2.getText().trim()).floatValue());
        jb3.setAlignmentX(Float.valueOf(x3.getText().trim()).floatValue());
        jb3.setAlignmentY(Float.valueOf(y3.getText().trim()).floatValue());

        overlay.invalidateLayout(p1);
        p1.doLayout();
      }
    } );

    p2.add(updateButton);

    c.add(p1, BorderLayout.CENTER);
    c.add(p2, BorderLayout.SOUTH);

  }

  public static void main(String args[]) {
    float alignments[] = { 0.0f, 0.0f, 0.0f, 0.0f };
    if (args.length == 4) {
      for (int i = 0; i < 4; i++) {
        alignments[i] = Float.valueOf(args[i]).floatValue();
      }
    }
    OverlayTest ot = new OverlayTest(alignments);
    ot.setSize(500,300);
    ot.setVisible(true);
  }

  public class SimpleReporter implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
      System.out.println(ae.getActionCommand());
    }
  }

  public class GridPanel extends JPanel {
    public void paint(Graphics g) {
      super.paint(g);
      int w = getSize().width;
      int h = getSize().height;

      System.out.println("w: " + w + " h: " + h);
      g.setColor(Color.red);
      g.drawRect(0, 0, w-1, h-1);
      g.drawLine(w/2, 0, w/2, h);
      g.drawLine(0, h/2, w, h/2);
    }
  }
}
