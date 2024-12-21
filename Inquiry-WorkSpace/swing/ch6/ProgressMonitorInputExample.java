// ProgressMonitorInputExample.java
//
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class ProgressMonitorInputExample extends JPanel {
  public ProgressMonitorInputExample(String filename) {

    ProgressMonitorInputStream monitor;

    try {
      monitor = new ProgressMonitorInputStream(
        this, "Loading "+filename, new FileInputStream(filename));

      InputStream in = new BufferedInputStream(monitor);

      while (in.available() > 0) {
        byte[] data = new byte[38];
        in.read(data);
        System.out.write(data);
      }

    } catch (FileNotFoundException e) {
      JOptionPane.showMessageDialog(null, "Unable to find file: "
        + filename, "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {;}

  }

  public static void main(String args[]) {
    new ProgressMonitorInputExample(args[0]);
  }
}
