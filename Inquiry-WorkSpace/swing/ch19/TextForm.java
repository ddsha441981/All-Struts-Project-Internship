// TextForm.java
//
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// A simple label/field form panel
public class TextForm extends JPanel {

  // Create a form with the given labels, tooltips, and sizes
  public TextForm(String[] labels, String[] tips, int[] widths) {
    tf = new JTextField[labels.length];

    // Define layout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(2, 2, 2, 2);

    // Add labels and fields as specified
    for (int i=0; i<labels.length; i++) {
      JLabel l = new JLabel(labels[i]);

      // Create an accessibility-friendly field
      tf[i] = new JTextField(widths[i]);
      tf[i].setToolTipText(tips[i]); // sets accessible desc too!
      l.setLabelFor(tf[i]);          // sets accessibleName for tf[i]!

      // lay out label & field
      gbc.gridy = i;
      gbc.gridx = 0;
      add(l, gbc);
      gbc.gridx = 1;
      add(tf[i], gbc);
    }
  }

  // Get the contents of one of the TFs.
  public String getEnteredText(int index) {
    return tf[index].getText();
  }

  private JTextField[] tf;

  // A simple example program
  public static void main(String[] args) {
    String[] labels =
      { "First Name", "Middle Initial", "Last Name", "Age" };

    String[] descs = { "First Name","Middle Initial",
      "Last Name", "Age" };

    int[] widths = { 15, 1, 15, 3 };

    final TextForm form = new TextForm(labels, descs, widths);

    // A button that dumps the field contents
    JButton dump = new JButton("Dump");
    dump.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        System.out.println(form.getEnteredText(0));
        System.out.println(form.getEnteredText(1));
        System.out.println(form.getEnteredText(2));
        System.out.println(form.getEnteredText(3));
      }
    });

    // layout
    JFrame f = new JFrame();
    f.addWindowListener(new BasicWindowMonitor());
    Container c = f.getContentPane();
    c.setLayout(new BorderLayout());
    c.add(form, BorderLayout.CENTER);
    c.add(dump, BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
  }
}
