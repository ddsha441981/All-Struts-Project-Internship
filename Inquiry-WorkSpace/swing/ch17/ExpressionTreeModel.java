// ExpressionTreeModel.java
// An implementation of the TreeModel interface for use with our calculation
// trees.
//
import javax.swing.tree.*;
import javax.swing.event.*;
import java.util.Vector;

public class ExpressionTreeModel implements TreeModel {
  
  Vector listeners;
  OpNode root;
  
  public ExpressionTreeModel(OpNode r) {
    if (r == null) {
      throw new IllegalArgumentException("root is null");
    }
    root = r;
  }

  public void insertNode(OpNode parent, Object node, int index) {
    parent.setChild(index, node);
  }
      
  // Methods from TreeModel
  public Object getChild(Object node, int index) {
    if (node instanceof OpNode) { return ((OpNode)node).getChild(index); }
    return null;
  }
  
  public int getIndexOfChild(Object parent, Object child) {
    if (parent instanceof OpNode) {
      return ((OpNode)parent).getIndexOfChild(child);
    }
    else { return -1; }
  }
  
  public Object getRoot() { return root; }
  
  public int getChildCount(Object parent) {
    if (parent instanceof OpNode) { return ((OpNode)parent).getChildCount(); }
    else { return 0; }
  }
  
  public boolean isLeaf(Object node) { return (!(node instanceof OpNode)); }

  // A new value has been entered into our tree, so make sure we record it
  // correctly, and then fire off a node Change event to any TreeModelListeners.
  public void valueForPathChanged(TreePath path, Object newValue) {
    Object[] p = path.getPath();
    Object[] pp = p;
    Object node;
    int index;
    if (p.length == 1) { //editing root . . . 
      root.setOperator(newValue);
      node = root;
      index = -1;
    }
    else {
      node = p[p.length - 1];
      OpNode parent = (OpNode)p[p.length - 2];
      index = parent.getIndexOfChild(node);
      if (node instanceof OpNode) {((OpNode)node).setOperator(newValue);}
      else { 
        // Play a few path games since Integer is a noneditable object. We'll say
        // that the changed node is our parent, not us.
        parent.setChild(index, newValue); 
        node = parent.getChild(index);
        // Create a new path down to our parent, but don't include us
        pp = new Object[p.length - 1];
        for (int i = 0; i < pp.length; i++) {pp[i]=p[i];}
      }
    }
    int[] ci = new int[] { index };        // child indices in parent
    Object [] cc = new Object[] { node };  // child objects in parent
    fireTreeNodesChanged(this, pp, ci, cc);
  }
  
  public void addTreeModelListener(TreeModelListener tml) {
    if (listeners == null) { listeners = new Vector(); }
    listeners.addElement(tml);
  }
  
  public void removeTreeModelListener(TreeModelListener tml) {
    if (listeners != null) { listeners.removeElement(tml); }
  }

  // Update our tree because expanding and collapsing changes the way we
  // represent OpNodes.
  public void refresh(TreeExpansionEvent tee) {
    int[] ci = new int[] { -1 };
    fireTreeNodesChanged(tee.getSource(), tee.getPath().getPath(), ci, null);
  }

  // And last but not least, fire off an event to anyone who cares to hear about
  // model changes.
  protected void fireTreeNodesChanged(Object source, Object[] path,
                                      int[] ci, Object[] cc)
  { // Short, but not very thread safe!!
    if (listeners != null) {
      TreeModelEvent tme = new TreeModelEvent(source, path, ci, cc);
      for (int i = 0; i < listeners.size(); i++) {
        ((TreeModelListener)listeners.elementAt(i)).treeNodesChanged(tme);
      }
    }
  }
}
