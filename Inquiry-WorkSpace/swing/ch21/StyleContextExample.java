// StyleContextExample.java
//

import javax.swing.text.*;
import java.awt.*;

public class StyleContextExample {
  public static void main(String[] args) {
    StyleContext con = new StyleContext();

    // Create two different attribute sets . . .
    SimpleAttributeSet one = new SimpleAttributeSet();
    SimpleAttributeSet two = new SimpleAttributeSet();
    System.out.println("Refs are initially to the same object? "
    + (one == two)); // prints false

    // Add the same things to each set . . .
    AttributeSet oneA=con.addAttribute(one, StyleConstants.Bold, Boolean.TRUE);
    AttributeSet twoA=con.addAttribute(two, StyleConstants.Bold, Boolean.TRUE);
    System.out.println("Refs are same after setting the "
    + "same value? " + (oneA == twoA)); // prints true

    // Add a 2nd attribute to both sets
    AttributeSet oneB =
      con.addAttribute(oneA, StyleConstants.Foreground, Color.blue);
    System.out.println("Refs are same after adding a 2nd attribute "
    + "to one set? " + (oneB == twoA)); // prints false (of course)

    AttributeSet twoB = con.addAttribute(twoA,
      StyleConstants.Foreground, Color.blue);
    System.out.println("Refs are same after adding "
    + "2nd attribute to 2nd set? " + (oneB == twoB)); // prints true

    // remove the second attribute so it matches the old set . . .
    AttributeSet oneC = con.removeAttribute(oneB, StyleConstants.Foreground);
    System.out.println("Old set matches new set after removal? "
    + (oneC == oneA)); // prints true

    // show that a threshold for reusing sets is reached . . .
    AttributeSet tooBig1 = new SimpleAttributeSet();
    AttributeSet tooBig2 = new SimpleAttributeSet();
    for (int i=0; i<10; i++) {
      tooBig1 = con.addAttribute(tooBig1, Integer.toString(i), new Integer(i));
      tooBig2 = con.addAttribute(tooBig2, Integer.toString(i), new Integer(i));
      System.out.print(tooBig1 == tooBig2);
      System.out.print(" ");
    }
    System.out.println();
    System.exit(0);
  }
}
