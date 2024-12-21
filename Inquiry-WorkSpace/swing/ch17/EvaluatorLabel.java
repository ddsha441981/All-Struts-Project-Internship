// EvaluatorLabel.java
// An extension of the JLabel class that evaluates the value of an expression
// tree. This class is specifically designed to work with OpNodes and Integer
// objects, but it returns a double value so that odd expressions will show an
// interesting value instead of 0 . . .
//
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class EvaluatorLabel extends JLabel implements TreeModelListener {

  public EvaluatorLabel() { super("No tree specified"); }

  public void showEvaluation(Object node) {
    double value = evaluate(node);
    setText("Current expression value: " + value);
    repaint();
  }

  protected double evaluate(Object n) {
    if (n instanceof Integer) {
      return ((Integer)n).doubleValue();
    }
    // must be an OpNode . . .
    OpNode node = (OpNode) n;
    double leftSide = evaluate(node.getChild(0));
    double rightSide = evaluate(node.getChild(1));
    String op = node.getOperator();

    // Ok, do the correct calculation of leftside OP rightside
    if (op.equals( OpNode.ADD )) return leftSide + rightSide;
    if (op.equals( OpNode.SUBTRACT )) return leftSide - rightSide;
    if (op.equals( OpNode.MULTIPLY )) return leftSide * rightSide;
    if (op.equals( OpNode.DIVIDE )) return leftSide / rightSide;
 
    // Shouldn't get here, but just in case
    return Double.NaN;
  }

  // Implement the TreeModelListener methods. Regardless of the change, we just
  // need to recalculate and redisplay the tree's value from the root down.
  public void treeNodesChanged(TreeModelEvent tme) {
    Object source = tme.getSource();
    if (source instanceof JTree) {
      showEvaluation(((JTree)source).getModel().getRoot());
    }
    else if (tme.getSource() instanceof TreeModel) {
      showEvaluation(((TreeModel)source).getRoot());
    }
  }

  public void treeNodesInserted(TreeModelEvent tme) {
    treeNodesChanged(tme); 
  }
  public void treeNodesRemoved(TreeModelEvent tme) { 
    treeNodesChanged(tme); 
  }
  public void treeStructureChanged(TreeModelEvent tme) { 
    treeNodesChanged(tme); 
  }
}
