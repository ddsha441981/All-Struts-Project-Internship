// ObjectTree.java
// A Simple test to see how we can build a tree and populate it.
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

public class ObjectTree extends JFrame {

  JTree tree;
  String[][] sampleData = {
    {"Amy"}, {"Brandon", "Bailey"},
    {"Jodi"}, {"Trent", "Garrett", "Paige", "Dylan"},
    {"Donn"}, {"Nancy", "Donald", "Phyllis", "John", "Pat"}
  };

  public ObjectTree() {
    super("Hashtable Test");
    setSize(400, 300);
    addWindowListener(new BasicWindowMonitor());
  }

  public void init() {
    Hashtable h = new Hashtable();
    // build up the hashtable using every other entry in the String[][] as a key
    // followed by a "value" which is a String[]
    for (int i = 0; i < sampleData.length; i+=2) {
      h.put(sampleData[i][0], sampleData[i + 1]);
    }
    tree = new JTree(h);
    getContentPane().add(tree, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    ObjectTree tt = new ObjectTree();
    tt.init();
    tt.setVisible(true);
  }
}
