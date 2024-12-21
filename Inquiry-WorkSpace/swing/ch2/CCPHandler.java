/*
 * CCPHandler.java
 * A Cut, Copy, and Paste event handler.  Nothing too fancy, just define
 * some constants that can be used to set the actionCommands on buttons.
 */

import java.awt.event.*;

public class CCPHandler implements ActionListener {

  public final static String CUT   = "cut";
  public final static String COPY  = "copy";
  public final static String PASTE = "paste";

  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    if (command == CUT) { // we can do this since we're comparing statics
      System.out.println("Got Cut event");
    }
    else if (command == COPY) {
      System.out.println("Got Copy event");
    }
    else if (command == PASTE) {
      System.out.println("Got Paste event");
    }
  }
}
