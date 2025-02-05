// Bounded.java
//
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class Bounded {

  public Bounded() {

    try {
      DefaultBoundedRangeModel model = new DefaultBoundedRangeModel();
      ChangeListener myListener = new MyChangeListener();
      model.addChangeListener(myListener);
      System.out.println(model.toString());
      System.out.println("Now setting minimum to 50 . . .");
      model.setMinimum(50);
      System.out.println(model.toString());
      System.out.println("Now setting maximum to 40 . . .");
      model.setMaximum(40);
      System.out.println(model.toString());
      System.out.println("Now setting maximum to 50 . . .");
      model.setMaximum(50);
      System.out.println(model.toString());
      System.out.println("Now setting extent to 30 . . .");
      model.setExtent(30);
      System.out.println(model.toString());
      System.out.println("Now setting several properties . . .");
      if (!model.getValueIsAdjusting()) {
        model.setValueIsAdjusting(true);
        System.out.println(model.toString());
        model.setMinimum(0);
        model.setMaximum(100);
        model.setExtent(20);
        model.setValueIsAdjusting(false);
      }
      System.out.println(model.toString());
    } catch (Exception e) { e.printStackTrace(); }
  }

  class MyChangeListener implements ChangeListener {
    public void stateChanged(ChangeEvent e) {
      System.out.println("A ChangeEvent has been fired!");
    }
  }

  public static void main(String args[]) { new Bounded(); }

}
