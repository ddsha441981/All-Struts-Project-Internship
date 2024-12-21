//  AlphaButtonFocusManager.java
//
import javax.swing.*;
import javax.swing.FocusManager;
import javax.swing.event.*;

import java.util.*;
import java.awt.*;
import java.text.*;
import java.awt.event.*;

public class AlphaButtonFocusManager extends FocusManager {

    public void processKeyEvent(Component focusedComponent, KeyEvent event)
    {
        if (event.getKeyCode() == KeyEvent.VK_TAB) {
            //  We are only interested in key presses, not key releases
            if (event.getID() != KeyEvent.KEY_PRESSED) {
                event.consume();
            } else {
                //  If the user pressed SHIFT, then go to the previous     
                //  component. Otherwise, go to the next component.
                if ((event.getModifiers() & ActionEvent.SHIFT_MASK) ==
                    ActionEvent.SHIFT_MASK) 
                    focusPreviousComponent(focusedComponent);
                else
                    focusNextComponent(focusedComponent);
                event.consume();
            }
        }
    } 
    
    public void focusNextComponent(Component c) {

        Vector v = new Vector();
        Hashtable list = getAllComponentsAtThisLevel(c, v);
        String buttonText;

        if (list != null) {
            if (c instanceof JButton) {
                JButton button = (JButton)c;
                int currentIndex = v.indexOf(button.getText()) + 1;
                if (currentIndex >= v.size())
                    buttonText = (String)v.firstElement();
                else
                    buttonText = (String)v.elementAt(currentIndex);
                JButton b = (JButton)list.get(buttonText);
                b.grabFocus();
            } 
        }
    }

    public void focusPreviousComponent(Component c) {

        Vector v = new Vector();
        Hashtable list = getAllComponentsAtThisLevel(c, v);
        String buttonText;

        if (list != null) {
            if (c instanceof JButton) {
                JButton button = (JButton)c;
                int currentIndex = v.indexOf(button.getText()) - 1;
                if (currentIndex < 0)
                    buttonText = (String)v.lastElement();
                else
                    buttonText = (String)v.elementAt(currentIndex);
                JButton b = (JButton)list.get(buttonText);
                b.grabFocus();

            } 
        }
    }

    public Hashtable getAllComponentsAtThisLevel(Component c, Vector v)
    {
        Container cont = c.getParent(); 

        if (cont == null)
            return null;
        Hashtable h = new Hashtable();
        Component[] components = cont.getComponents(); 
        v.removeAllElements();

        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JButton) {
                JButton button = (JButton)components[i];
                v.addElement(button.getText());
                h.put(button.getText(), button);
            } 
        }
        sortVector(v);
        return h;
    } 

    private void sortVector(Vector v) {

        Collator c = Collator.getInstance();
        int length = v.size();

        //  Sort the vector of strings using a standard sort
        for (int i = 0; i < length; i++) {
            for (int j = length-1; j >= i+1; j--) {
                if (c.compare((String)v.elementAt(j-1),
                                         (String)v.elementAt(j)) == 1) {
                    String temp = (String)v.elementAt(j);
                    v.setElementAt(v.elementAt(j-1),j);
                    v.setElementAt(temp, j-1);
                }  
            }
        }
    }
}
