// FixedButton.java
// A simple extension to the button class that gives the button a fixed size. 
// Basically the "maximum" and "minimum" just return the same size.
//
import java.awt.*;

public class FixedButton extends Button {

  public FixedButton(String name) {super(name);}

  public Dimension getMinimumSize() {return getPreferredSize();
  }

  public Dimension getMaximumSize() {return getPreferredSize();
  }
}
