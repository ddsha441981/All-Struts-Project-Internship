// TestTree.java
// A Simple test to see how we can build a tree and populate it.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class TestTree extends JFrame {

  JTree tree;
  DefaultTreeModel treeModel;

  public TestTree() {
    super("Tree Test Example");
    setSize(400, 300);
    addWindowListener(new BasicWindowMonitor());
  }

  public void init() {
    // Build up a bunch of TreeNodes. We use DefaultMutableTreeNode because the
    // DefaultTreeModel can use that to build a complete tree.
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
    DefaultMutableTreeNode subroot = new DefaultMutableTreeNode("SubRoot");
    DefaultMutableTreeNode leaf1 = new DefaultMutableTreeNode("Leaf 1");
    DefaultMutableTreeNode leaf2 = new DefaultMutableTreeNode("Leaf 2");
    
    // Build our tree model starting at the root node, and then make a JTree out
    // of that.
    treeModel = new DefaultTreeModel(root);
    tree = new JTree(treeModel);

    // Build the tree up from the nodes we created
    treeModel.insertNodeInto(subroot, root, 0);
    treeModel.insertNodeInto(leaf1, subroot, 0);
    treeModel.insertNodeInto(leaf2, root, 1);

    // And display it
    getContentPane().add(tree, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    TestTree tt = new TestTree();
    tt.init();
    tt.setVisible(true);
  }
}
