// ExpressionTreeCellRenderer.java
// A renderer for our expression cells.
//
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class ExpressionTreeCellRenderer extends JLabel 
implements TreeCellRenderer {

  Color backColor;
  boolean isLeaf;

  public ExpressionTreeCellRenderer() {

    // Pick a nice, big, fixed width font for our labels
    setFont(new Font("Monospaced", Font.PLAIN, 16));
    setHorizontalAlignment(SwingConstants.CENTER);
  }

  public Component getTreeCellRendererComponent(JTree tree, Object value,
                                                boolean selected,
                                                boolean expanded, boolean leaf,
                                                int row, boolean hasFocus) {
    if (selected) {
      setOpaque(true);
      setForeground(Color.white);
    }
    else {
      setOpaque(false);
      setForeground(Color.black);
    }
    setText(value.toString());
    isLeaf = leaf;
    return this;
  }

  // Override the default to send back different strings for folders and leaves
  public String getToolTipText() {
    if (isLeaf) { return "Leaf"; }
    return "Node";
  }

  // Override the default to give us a bit of horizontal padding
  public Dimension getPreferredSize() {
    Dimension dim = super.getPreferredSize();
    if(dim != null) { dim = new Dimension(dim.width + 4, dim.height); }
    return dim;
  }
}
