// ExpressionTreeCellEditor.java
// A customized editor for our expression tree. This editor only kicks in if the
// node you try to edit is an OpNode, otherwise the default text field is used
// for integers.
//
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.tree.*;

public class ExpressionTreeCellEditor implements TreeCellEditor {

  EditorComboBox nodeEditor;
  EditorTextField leafEditor;
  CellEditor currentEditor;

  static String[] operators = { "+", "-", "*", "/" };

    public ExpressionTreeCellEditor() {

        EditorTextField tf = new EditorTextField();
        tf.setFont(new Font("Monospaced", Font.PLAIN, 14));
        EditorComboBox cb = new EditorComboBox(operators);
        cb.setFont(new Font("Monospaced", Font.PLAIN, 14));

        nodeEditor = cb;
        leafEditor = tf;
    }

    public Component getTreeCellEditorComponent(JTree tree, Object value,
                                                boolean isSelected,
                                                boolean expanded,
                                                boolean leaf, int row) {
        if (leaf) { 
          currentEditor = leafEditor;
          leafEditor.setText(value.toString());
        }
        else {
          currentEditor = nodeEditor;
          nodeEditor.setSelectedItem(((OpNode)value).getOperator());
        }
        return (Component)currentEditor;
    }

    public Object getCellEditorValue() {
      return currentEditor.getCellEditorValue();
    }

    public boolean isCellEditable(EventObject event) {
      return currentEditor.isCellEditable(event);
    }

    public boolean shouldSelectCell(EventObject event) {
      return currentEditor.shouldSelectCell(event);
    }

    public boolean stopCellEditing() {
      return currentEditor.stopCellEditing();
    }

    public void cancelCellEditing() {
      currentEditor.cancelCellEditing();
    }

    public void addCellEditorListener(CellEditorListener l) {
      nodeEditor.addCellEditorListener(l);
      leafEditor.addCellEditorListener(l);
    }

    public void removeCellEditorListener(CellEditorListener l) {
      nodeEditor.removeCellEditorListener(l);
      leafEditor.removeCellEditorListener(l);
    }
}
