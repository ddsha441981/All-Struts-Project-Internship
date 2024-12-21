// UndoableToggleApp.java
//
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.undo.*;
import java.awt.*;
import java.awt.event.*;

// A sample app showing the use of UndoableToggleEdit
public class UndoableToggleApp extends JFrame implements ActionListener {

  // Create the main frame and everything in it.
  public UndoableToggleApp() {

    // Create some toggle buttons (and subclasses)
    JToggleButton tog = new JToggleButton("ToggleButton");
    JCheckBox cb = new JCheckBox("CheckBox");
    JRadioButton radio = new JRadioButton("RadioButton");

    // Add this object as a listener to each toggle button
    tog.addActionListener(this);
    cb.addActionListener(this);
    radio.addActionListener(this);

    // Layout the buttons
    Box buttonBox = new Box(BoxLayout.Y_AXIS);
    buttonBox.add(tog);
    buttonBox.add(cb);
    buttonBox.add(radio);

    // Create undo and redo buttons (initially disabled)
    undoButton = new JButton("Undo");
    redoButton = new JButton("Redo");
    undoButton.setEnabled(false);
    redoButton.setEnabled(false);

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

    // Layout the undo/redo buttons
    Box undoRedoBox = new Box(BoxLayout.X_AXIS);
    undoRedoBox.add(Box.createGlue());
    undoRedoBox.add(undoButton);
    undoRedoBox.add(Box.createHorizontalStrut(2));
    undoRedoBox.add(redoButton);
    undoRedoBox.add(Box.createGlue());

    // Layout the main frame
    Container content = getContentPane();
    content.setLayout(new BorderLayout());
    content.add(buttonBox, BorderLayout.CENTER);
    content.add(undoRedoBox, BorderLayout.SOUTH);
    setSize(400, 150);
  }

  // When any toggle button is clicked, we create a new UndoableToggleEdit (which
  // replaces any previous edit). We then get the edit's undo/redo names and set
  // the undo/redo button labels. Finally, we enable/disable these buttons by
  // asking the edit what we are allowed to do.
  public void actionPerformed(ActionEvent ev) {
    JToggleButton tb = (JToggleButton)ev.getSource();
    edit = new UndoableToggleEdit(tb);
    undoButton.setText(edit.getUndoPresentationName());
    redoButton.setText(edit.getRedoPresentationName());
    undoButton.getParent().validate();
    undoButton.setEnabled(edit.canUndo());
    redoButton.setEnabled(edit.canRedo());
  }

  private UndoableEdit edit;
  private JButton undoButton;
  private JButton redoButton;

  // Main program just creates the frame and displays it.
  public static void main(String[] args) {
    JFrame f = new UndoableToggleApp();
    f.addWindowListener(new BasicWindowMonitor());
    f.setVisible(true);
  }
}
