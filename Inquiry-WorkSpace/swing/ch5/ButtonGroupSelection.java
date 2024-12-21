// ButtonGroupSelection.java
//
import javax.swing.*;

public class ButtonGroupSelection {
  public static void main(String[] args) {

    // create two selected buttons
    JToggleButton one = new JToggleButton();
    one.setSelected(true);
    JToggleButton two = new JToggleButton();
    two.setSelected(true);

    // both are selected (prints "true true")
    System.out.println(one.isSelected() + " " + two.isSelected());

    // put them in a group
    ButtonGroup group = new ButtonGroup();
    group.add(one);
    group.add(two);

    // Only first one is selected now (prints "true false"). This is because
    // ToggleButtonModel.isSelected() first checks to see if the button is in
    // a group and, if so, asks the group if it is selected.
    System.out.println(one.isSelected() + " " + two.isSelected());
  }
}
