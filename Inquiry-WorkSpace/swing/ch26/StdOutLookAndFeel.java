// StdOutLookAndFeel.java
//
import javax.swing.*;
import javax.swing.plaf.*;

public class StdOutLookAndFeel extends LookAndFeel {

  // A few simple informational methods . . .

  public String getName() { return "Standard Output"; }
  public String getID() { return "StdOut"; }
  public String getDescription() { return "The Standard Output Look and Feel"; }
  public boolean isNativeLookAndFeel() { return false; }
  public boolean isSupportedLookAndFeel() { return true; }

  // Our only default is the UI-delegate for buttons

  public UIDefaults getDefaults() {
    UIDefaults table = new UIDefaults();

    table.put("ButtonUI", "StdOutButtonUI");

    return table;
  }
}
