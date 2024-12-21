// OpNode.java
// A node structure containing an operator in our calculation tree. This node
// will hold two children.
// 
import javax.swing.tree.*;

public class OpNode {
  public static final String MULTIPLY = "*";
  public static final String DIVIDE   = "/";
  public static final String ADD      = "+";
  public static final String SUBTRACT = "-";

  String operator;
  Object[] children = new Object[2];
  boolean expanded = false;
  
  public OpNode() { this(ADD); }
  public OpNode(String op) { operator = op; }

  public void setExpanded(boolean b) { expanded = b; }
  
  // Add in a child (which can be either another OpNode or an Integer. If the
  // index isn't 0 or 1, throw an exception
  public void setChild(int index, Object child) {
    if (index == 0) { children[0] = buildChild(child); }
    else if (index == 1) { children[1] = buildChild(child); } 
    else {
      throw new IllegalArgumentException("child index " + index 
                                         + " must be 0 or 1");
    }
  }
  
  // return the child for the given index, may return null
  public Object getChild(int index) {
    if (index == 0) { return children[0]; }
    else if (index == 1) { return children[1]; }
    throw new IllegalArgumentException("child index must be 0 or 1");
  }
  
  // return the index of the given child
  public int getIndexOfChild(Object child) {
    if (child.equals(children[0])) { return 0;  }
    else if (child.equals(children[1])) { return 1; }
    return -1;
  }
  
  public int getChildCount() {
    int count = 0;
    if (children[0] != null) { count++; }
    if (children[1] != null) { count++; }
    return count;
  }
  
  // Get and set the current operator. We'll need to support the set method when
  // we start to make the tree editable
  public String getOperator() { return operator; }
  public void setOperator(Object op) {
    if (op instanceof String) { operator = (String)op; }
    else {
      throw new IllegalArgumentException("operators must be strings");
    }
  }

  // Here's the workhorse for OpNode. This method parses an Object and returns
  // either a valid OpNode or an Integer. If the object can't be parsed, an error
  // is printed and an Integer(0) is returned. (This keeps the tree from crashing
  // out . . . )
  protected Object buildChild(Object o) {
    if ((o instanceof Integer) || (o instanceof OpNode)) {
      return o;
    }
    String op = null;
    if (o instanceof String) {
      op = ((String)o).trim();
      if (op.equals(ADD)) { return new OpNode(ADD); }
      else if (op.equals(SUBTRACT)) { return new OpNode(SUBTRACT); }
      else if (op.equals(MULTIPLY)) { return new OpNode(MULTIPLY); }
      else if (op.equals(DIVIDE)) { return new OpNode(DIVIDE); }
      else {
        try { return Integer.valueOf(op); }
        catch (NumberFormatException nfe) { return new Integer(0); }
      }
    }
    System.err.println("Fell through new child: " + op);
    return new Integer(0);
  }

  // Return a string representing this node. If the tree is collapsed, build up
  // the expression below this node and return that as the string.
  public String toString() {
    if (expanded) { return operator; }
    else {
      StringBuffer buf = new StringBuffer(40);
      buildCollapsedString(buf, this);
      return buf.toString();
    }
  }

  // put together an expression of (leftside op rightside), but do it recursively
  // so we get the entire subtree
  protected void buildCollapsedString(StringBuffer buf, Object node) {
    if (node == null) { return; }
    if (node instanceof OpNode) {
      buf.append("(");
      buildCollapsedString(buf, ((OpNode)node).getChild(0));
      buf.append(" ");
      buf.append(((OpNode)node).getOperator());
      buf.append(" ");
      buildCollapsedString(buf, ((OpNode)node).getChild(1));
      buf.append(")");
    }
    else { buf.append(node); }
  }
}
