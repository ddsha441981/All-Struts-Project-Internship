// UndoableToggleApp2.java
//
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.undo.*;
import java.awt.*;
import java.awt.event.*;

// A sample app showing the use of UndoableToggleEdit and CompoundEdit
public class UndoableToggleApp2 extends JFrame implements ActionListener {

  // Create the main frame and everything in it.
  public UndoableToggleApp2() {

    // Create some toggle buttons (and subclasses)
    JToggleButton tog = new JToggleButton("ToggleButton");
    JCheckBox cb = new JCheckBox("CompoundEdit ExampleCheckBox");
    JRadioButton radio = new JRadioButton("RadioButton");

    // Add this object as a listener to each toggle button
    tog.addActionListener(this);
    cb.addActionListener(this);
    radio.addActionListener(this);

    // Lay out the buttons
    Box buttonBox = new Box(BoxLayout.Y_AXIS);
    buttonBox.add(tog);
    buttonBox.add(cb);
    buttonBox.add(radio);

    // Create undo and redo buttons (initially disabled)
    undoButton = new JButton("Undo");
    redoButton = new JButton("Redo");
    endButton = new JButton("End");
    undoButton.setEnabled(false);
    redoButton.setEnabled(false);
    endButton.setEnabled(false);

    // Add a listener to the undo button. It attempts to call undo() on the 
    // current edit, then enables/disables the undo/redo buttons as appropriate.
    undoButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        try {
          edit.undo();
        } catch (CannotUndoException ex) { ex.printStackTrace(); }
        finally {
          undoButton.setEnabled(edit.canUndo());
          redoButton.setEnabled(edit.canRedo());
        }
      }
    });

    // Add a redo listener: just like the undo listener, but for redo this time.
    redoButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        try {
          edit.redo();
        } catch (CannotRedoException ex) { ex.printStackTrace(); }
        finally {
          undoButton.setEnabled(edit.canUndo());
          redoButton.setEnabled(edit.canRedo());
        }
      }
    });

    // Add an end listener. This listener will call end() on the CompoundEdit and
    // update the undo/redo buttons.
    endButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        edit.end();
        endButton.setEnabled(false);
        undoButton.setEnabled(edit.canUndo());
        redoButton.setEnabled(edit.canRedo());
      }
    });

    // Layout the undo/redo/end buttons
    Box undoRedoEndBox = new Box(BoxLayout.X_AXIS);
    undoRedoEndBox.add(Box.createGlue());
    undoRedoEndBox.add(undoButton);
    undoRedoEndBox.add(Box.createHorizontalStrut(2));
    undoRedoEndBox.add(redoButton);
    undoRedoEndBox.add(Box.createHorizontalStrut(2));
    undoRedoEndBox.add(endButton);
    undoRedoEndBox.add(Box.createGlue());

    // Layout the main frame
    Container content = getContentPane();
    content.setLayout(new BorderLayout());
    content.add(buttonBox, BorderLayout.CENTER);
    content.add(undoRedoEndBox, BorderLayout.SOUTH);
    setSize(400, 150);
  }

  // When any toggle button is clicked, we check to see if there is an inProgress
  // CompoundEdit. If there is not, we create a new one (replacing the old
  // CompoundEdit if there was one). We then create a new UndoableToggleEdit and
  // add it to the CompoundEdit. Next, the end button is enabled and we enable/
  // disable the Undo/Redo buttons by asking the edit what we are allowed to do.
  public void actionPerformed(ActionEvent ev) {
    if (edit == null || edit.isInProgress() == false)
      edit = new CompoundEdit();

    JToggleButton tb = (JToggleButton)ev.getSource();
    UndoableEdit togEdit = new UndoableToggleEdit(tb);
    edit.addEdit(togEdit);
    endButton.setEnabled(true);
    undoButton.setEnabled(edit.canUndo());
    redoButton.setEnabled(edit.canRedo());
  }

  private CompoundEdit edit;
  private JButton undoButton;
  private JButton redoButton;
  private JButton endButton;

  // Main program just creates the frame and displays it.
  public static void main(String[] args) {
    JFrame f = new UndoableToggleApp2();
    f.addWindowListener(new BasicWindowMonitor());
    f.setVisible(true);
  }
}
