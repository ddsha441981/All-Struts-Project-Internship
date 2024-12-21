// InvokeExample.java
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InvokeExample {
  private static JButton good = new JButton("Good");
  private static JButton bad = new JButton("Bad");
  private static JButton bad2 = new JButton("Bad2");
  private static JLabel resultLabel = new JLabel("Ready", JLabel.CENTER);

  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());

    // Layout . . .
    JPanel p = new JPanel();
    p.setOpaque(true);
    p.setLayout(new FlowLayout());
    p.add(good);
    p.add(bad);
    p.add(bad2);
    
    Container c = f.getContentPane();
    c.setLayout(new BorderLayout());
    c.add(p, BorderLayout.CENTER);
    c.add(resultLabel, BorderLayout.SOUTH);

    // Listeners
    good.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        resultLabel.setText("Working . . .");
        setEnabled(false);

        // We're going to do something that takes a long time, so we will
        // spin off a thread and update the display when we're done.
        Thread worker = new Thread() {
          public void run() {
            // something that takes a long time . . . in real life, this
            // might be a DB query, remote method invocation, etc.
            try {
              Thread.sleep(5000);
            }
            catch (InterruptedException ex) {}

            // report the result using invokeLater()
            SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                resultLabel.setText("Ready");
                setEnabled(true);
              }
            });
          }
        };

        worker.start(); // so we don't hold up the dispatch thread
      }
    });

    bad.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        resultLabel.setText("Working . . .");
        setEnabled(false);

        // We're going to do the same thing, but not in a separate thread.
        try {
          Thread.sleep(5000); // dispatch thread is starving!
        }
        catch (InterruptedException ex) {}

        // report the result
        resultLabel.setText("Ready");
        setEnabled(true);
      }
    });

    bad2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        resultLabel.setText("Working . . . ");
        setEnabled(false);

        // The wrong way to use invokeLater().  The runnable() shouldn't
        // starve the dispatch thread.
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            try {
              Thread.sleep(5000); // dispatch thread is starving!
            }
            catch (InterruptedException ex) {}

            resultLabel.setText("Ready");
            setEnabled(true);
          }
        });
      }
    });

    f.setSize(300, 100);
    f.setVisible(true);
  }

  // allows us to turn the buttons on or off while we work.
  static void setEnabled(boolean b) {
    good.setEnabled(b);
    bad.setEnabled(b);
    bad2.setEnabled(b);
  }
}
