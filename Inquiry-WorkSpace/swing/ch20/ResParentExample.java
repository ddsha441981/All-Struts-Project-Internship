// ResParentExample.java
//
import javax.swing.text.*;
import java.awt.Color;

// An example showing how to use attribute sets and resolving parents.
public class ResParentExample {
  public static void main(String[] args) {

    // Create a set with 2 attributes
    SimpleAttributeSet elway = new SimpleAttributeSet();
    elway.addAttribute("name", "John Elway");
    elway.addAttribute("number", new Integer(7));

    // Create a "super" set :-)
    SimpleAttributeSet broncos = new SimpleAttributeSet();
    broncos.addAttribute("teamname", "Denver Broncos");
    Color[] colors = {Color.blue, Color.orange};
    broncos.addAttribute("colors", colors);
    broncos.addAttribute("superBowlChamps", Boolean.TRUE);

    // Set the new set as the resolveParent of the first
    elway.setResolveParent(broncos);

    // Show some attributes from the sets
    System.out.println("Name: " + elway.getAttribute("name"));
    System.out.println("Number: " + elway.getAttribute("number"));
    System.out.println("Team: " + elway.getAttribute("teamname"));

    // Note that we can get an attribute from a parent set, but if we ask if it's
    // defined, we get `no'.
    colors = (Color[])elway.getAttribute("colors");
    System.out.println("Colors: " + colors[0] + " & " + colors[1]);
    System.out.println("Colors Defined?: " + elway.isDefined("colors"));

    // containsAttribute matches attribute AND value
    System.out.println("----------");
    System.out.println("Contains number 8: "
      + elway.containsAttribute("number", new Integer(8)));
    System.out.println("Contains number 7: "
      + elway.containsAttribute("number", new Integer(7)));

    // copy an attribute set
    System.out.println("----------");
    AttributeSet copyElway = elway.copyAttributes();
    System.out.println("Copy works: " + elway.containsAttributes(copyElway));

    // use the same resolveParent for a second set
    SimpleAttributeSet davis = new SimpleAttributeSet();
    davis.setResolveParent(broncos);
    System.out.println("----------");
    System.out.println("Davis' Team: "
      + davis.getAttribute("teamname"));
    System.out.println("Davis won Super Bowl?: "
      + davis.getAttribute("superBowlChamps"));

    // show toString output
    System.out.println("----------");
    System.out.println(elway);
    System.out.println(broncos);
  }
}
