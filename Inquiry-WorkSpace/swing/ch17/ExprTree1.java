// ExprTree1.java
// An expression tree for holding algebraic expressions, built up using
// ExpressionTreeModel for use with a JTree object.
//
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class ExprTree1 extends JFrame implements TreeExpansionListener {
    
  JTree tree;
  ExpressionTreeModel treeModel;
  OpNode[] operators = new OpNode[4];
  Integer[] operands = new Integer[5];

  public ExprTree1() {
    super("Demo Expression Tree");
    setSize(400, 300);
    addWindowListener(new BasicWindowMonitor());
  }
    
  public void init() {
    // create the nodes and the leaves
    operators[0] = new OpNode("+");
    operators[1] = new OpNode("*");
    operators[2] = new OpNode("-");
    operators[3] = new OpNode("/");
    operands[0] = new Integer(1);
    operands[1] = new Integer(2);
    operands[2] = new Integer(3);
    operands[3] = new Integer(4);
    operands[4] = new Integer(5);

    // start our tree with a root of "+"
    treeModel = new ExpressionTreeModel(operators[0]);

    // build the tree from the root down
    treeModel.insertNode(operators[0], operands[0], 0);
    treeModel.insertNode(operators[0], operators[1], 1);
    treeModel.insertNode(operators[1], operators[2], 0);
    treeModel.insertNode(operators[1], operators[3], 1);
    treeModel.insertNode(operators[2], operands[1], 0);
    treeModel.insertNode(operators[2], operands[2], 1);
    treeModel.insertNode(operators[3], operands[3], 0);
    treeModel.insertNode(operators[3], operands[4], 1);

    tree = new JTree(treeModel);
    tree.setShowsRootHandles(true);
    tree.collapseRow(0);

    // Listen to our own expand/collapse events to keep the labels in sync
    tree.addTreeExpansionListener(this);
    getContentPane().add(tree, BorderLayout.CENTER);
  }

  // Make sure that we get the correct label after we have expanded the node
  public void treeExpanded(TreeExpansionEvent tee) {
    OpNode node = (OpNode)tee.getPath().getLastPathComponent();
    node.setExpanded(true);
    treeModel.refresh(tee);
  }

  // Likewise, make sure that we get the correct label after we have collapsed
  // the node
  public void treeCollapsed(TreeExpansionEvent tee) {
    OpNode node = (OpNode)tee.getPath().getLastPathComponent();
    node.setExpanded(false);
    treeModel.refresh(tee);
  }

  public static void main(String args[]) {
    ExprTree1 et = new ExprTree1();
    et.init();
    et.setVisible(true); 
  }
}
