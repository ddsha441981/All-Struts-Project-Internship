// Splash.java
//
import javax.swing.*;
import java.awt.*;

public class Splash {
  public static void main(String[] args) {

    // Throw a nice little title page up on the screen first
    showSplash(10000);

    System.exit(0); // replace with application code!
  }

  // A simple little method to show a title screen in the
  // center of the screen for a given amount of time.
   public static void showSplash(int duration) {
    JWindow splash = new JWindow();
    JPanel content = (JPanel)splash.getContentPane();

    // set the window's bounds, centering the window
    int width = 240;
    int height = 120;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width-width)/2;
    int y = (screen.height-height)/2;
    splash.setBounds(x,y,width,height);

    // build the splash screen
    JLabel label = new JLabel(new ImageIcon("splash.gif"));
    JLabel copyrt = new JLabel
      ("Copyright 1998, PussinToast Inc.", JLabel.CENTER);
    copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
    content.add(label, BorderLayout.CENTER);
    content.add(copyrt, BorderLayout.SOUTH);
    content.setBorder(BorderFactory.createLineBorder(Color.red, 10));

    // display it
    splash.setVisible(true);

    // Wait a little while, maybe while loading resources
    try { Thread.sleep(duration); } catch (Exception e) {}

    splash.setVisible(false);
  }
}
