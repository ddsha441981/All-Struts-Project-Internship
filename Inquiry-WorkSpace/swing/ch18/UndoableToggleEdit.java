// UndoableToggleEdit.java
//
import javax.swing.*;
import javax.swing.undo.*;

// An UndoableEdit used to undo the pressing of a JToggleButton
public class UndoableToggleEdit extends AbstractUndoableEdit {

  // Create a new edit for a JToggleButton which has just been toggled.
  public UndoableToggleEdit(JToggleButton button) {
    this.button = button;
    selected = button.isSelected();
  }

  // Return a reasonable name for this edit.
  public String getPresentationName() {
    return "Toggle " + button.getText() + " " +
    (selected ? "on" : "off");
  }

  // Redo by setting the button state as it was initially.
  public void redo() throws CannotRedoException {
    super.redo();
    button.setSelected(selected);
  }

  // Undo by setting the button state to the opposite value.
  public void undo() throws CannotUndoException {
    super.undo();
    button.setSelected(!selected);
  }

  private JToggleButton button;
  private boolean selected;
}
