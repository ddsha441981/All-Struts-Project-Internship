//  AssistiveExample.java
//
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.accessibility.*;
import com.sun.java.accessibility.util.*;

public class AssistiveExample extends JPanel 
    implements MouseMotionListener, ActionListener, GUIInitializedListener {

     Timer timer;
     static JFrame frame;
 
     JLabel nameLabel;
     JLabel descriptionLabel;
 
     JCheckBox selectionCheckBox;
     JCheckBox textCheckBox;
     JCheckBox valueCheckBox;
     JCheckBox componentCheckBox;
     JCheckBox actionCheckBox;
     JCheckBox hypertextCheckBox;
     JButton performAction;
 
     public AssistiveExample() {
 
         frame = new JFrame("Assistive Example");
 
         //  Create and insert the appropriate labels and check boxes 
         nameLabel = new JLabel();
         descriptionLabel = new JLabel();
 
         selectionCheckBox = new JCheckBox("Selection", false);
         textCheckBox = new JCheckBox("Text", false);
         valueCheckBox = new JCheckBox("Value", false);
         componentCheckBox = new JCheckBox("Component", false);
         actionCheckBox = new JCheckBox("Action", false);
         hypertextCheckBox = new JCheckBox("Hyperlink", false);
         performAction = new JButton("Perform Action");
 
         setLayout(new GridLayout(10,1));
 
         add(nameLabel);
         add(descriptionLabel);
         add(new JSeparator());
         add(selectionCheckBox);
         add(textCheckBox);
         add(valueCheckBox);
         add(componentCheckBox);
         add(hypertextCheckBox);
         add(actionCheckBox);
         add(performAction);
 
         setBorder(new TitledBorder("Accessible Component"));
         
         performAction.addActionListener(this);
 
         frame.getContentPane().add("Center", this); 
         frame.pack();
         frame.show();
 
         //  Check to see if the GUI subsystem is initialized 
         //  correctly. (This is only needed in JDK 1.2). If it
         //  isn't, then we have to wait.
         if (EventQueueMonitor.isGUIInitialized()) {
             createGUI();
         } else {
             EventQueueMonitor.addGUIInitializedListener(this);
         }
 
         performAction.grabFocus();
     }
 
     public void guiInitialized() {
         createGUI();
     }
 
     public void createGUI() {
 
         //  We want to track the mouse motions, so notify the
         //  Swing event monitor of this.
         SwingEventMonitor.addMouseMotionListener(this);  
 
         //  Start a Timer object to measure how long the mouse stays
         //  over a particular area.
         timer = new Timer(500, this);
     }
 
     public void mouseMoved(MouseEvent e) {
 
         //  If the mouse moves, restart the timer.
         timer.restart();
     }
 
     public void mouseDragged(MouseEvent e) {
 
         //  If the mouse is dragged, restart the timer.
         timer.restart();
     }
 
     public void actionPerformed(ActionEvent e) {
 
         //  Find the component currently under the mouse.
        Point currentPosition = EventQueueMonitor.getCurrentMousePosition();
        Accessible comp = EventQueueMonitor.getAccessibleAt(currentPosition);
 
         //  If the user pressed the button, and the component
         //  has an accessible action, then execute it.
         if (e.getActionCommand() == "Perform Action") {
             AccessibleContext context = comp.getAccessibleContext();
             AccessibleAction action = context.getAccessibleAction();
 
             if (action != null) 
                 action.doAccessibleAction(0);
             else    
                 System.out.println("No accessible action present!"); 
             return; 
         }
 
         //  Otherwise, the timer has fired. Stop it and update the window.
         timer.stop();
          updateWindow(comp);
     }
 
     private void updateWindow(Accessible component) {
 
         // Reset the check boxes
         actionCheckBox.setSelected(false);
         selectionCheckBox.setSelected(false);
         textCheckBox.setSelected(false);
         componentCheckBox.setSelected(false);
         valueCheckBox.setSelected(false);
         hypertextCheckBox.setSelected(false);
 
         // Get the accessibile context of the component in question
         AccessibleContext context = component.getAccessibleContext();
 
         nameLabel.setText("Name: " + context.getAccessibleName());
         descriptionLabel.setText("Desc: " + 
             context.getAccessibleDescription());
 
         // Check the context for each of the accessibility types
         if (context.getAccessibleAction() != null)
             actionCheckBox.setSelected(true);
         if (context.getAccessibleSelection() != null)
             selectionCheckBox.setSelected(true);
         if (context.getAccessibleText() != null) {
             textCheckBox.setSelected(true);
             if (context.getAccessibleText() instanceof AccessibleHypertext) 
                 hypertextCheckBox.setSelected(true);
         }
         if (context.getAccessibleComponent() != null)
             componentCheckBox.setSelected(true);
         if (context.getAccessibleValue() != null)
             valueCheckBox.setSelected(true);
 
         repaint();
     }
 }
