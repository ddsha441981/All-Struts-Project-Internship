// StyleFrame.java
//
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// A main frame containing a JTextPane and a menu.
public class StyleFrame extends JFrame {

  // Just creates and displays the main frame.
  public static void main(String[] args) {
    JFrame frame = new StyleFrame();
    frame.addWindowListener(new BasicWindowMonitor());
    frame.setVisible(true);
  }

  // Create a JTextPane and a JMenuBar and add them to the frame.
  public StyleFrame() {
    doc = new StylishDocument();

    textPane = new JTextPane(doc);
    setContentPane(new JScrollPane(textPane));

    JMenuBar menuBar = createMenuBar();
    setJMenuBar(menuBar);

    setSize(400, 300);
  }

  // Create a menubar with file/exit and style menus.
  protected JMenuBar createMenuBar() {
    JMenuBar bar = new JMenuBar();

    // Add a file/exit menu
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitItem = new JMenuItem("Exit");
    exitItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) { System.exit(0); }
    });
    fileMenu.add(exitItem);
    bar.add(fileMenu);

    // Add a style menu-the "Create Style" option will call our showStyleDialog()
    // method (as will "Modify Style" menu items)
    styleMenu = new JMenu("Style");
    JMenuItem createItem = new JMenuItem("Create Style");
    createItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) { showStyleDialog(); }
    });

    setStyleMenu = new JMenu("Set Style");
    modifyStyleMenu = new JMenu("Modify Style");
    styleMenu.add(createItem);
    styleMenu.add(setStyleMenu);
    styleMenu.add(modifyStyleMenu);
    bar.add(styleMenu);

    // Add the default style to our menus
    addStyleToMenus(doc.getStyle(StyleContext.DEFAULT_STYLE));
    return bar;
  }

  // Bring up a style-entry dialog and process the results.
  protected void showStyleDialog() {
    String[] options = {"OK", "Cancel"};

    int opt = JOptionPane.showOptionDialog(this, styleBox,
      "Style Editor", JOptionPane.DEFAULT_OPTION,
      JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    if (opt == 0) { // "OK" pressed

      String name = styleBox.getStyleName();
      // Only do anything if the user named the style
      if (name != null) {
        // See if the style already exists, in which case this
        // is a change, not a creation
        Style oldStyle = doc.getStyle(name);
        if (oldStyle != null) {

          // Redefine the Style and tell our document to
          // repaint all Elements using this Style
          styleBox.fillStyle(oldStyle);
          doc.styleUpdated(oldStyle);
        }
        else {
          // A new style has been specified. We'll add it to the document . . .
          Style newStyle = doc.addStyle(name, null);

          // Now fill the style with the values entered in the dialog
          styleBox.fillStyle(newStyle);

          // Add this Style so we can use it
          addStyleToMenus(newStyle);
        }
      }
    }
    styleBox.clear();
  }

  // Called to add a new Style to our menus.
  protected void addStyleToMenus(final Style newStyle) {
    String styleName = newStyle.getName();

    // Add a menu item to the "Set Style" menu
    JMenuItem newItem = new JMenuItem(styleName);
    setStyleMenu.add(newItem);

    newItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        textPane.setLogicalStyle(newStyle);
      }
    });

    // Add a menu item to the "Modify Style" menu
    newItem = new JMenuItem(styleName);
    modifyStyleMenu.add(newItem);

    newItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        styleBox.loadFromStyle(newStyle);
        showStyleDialog();
      }
    });
  }

  private StyleBox styleBox = new StyleBox();
  private JTextPane textPane;
  private StylishDocument doc;
  private JMenu styleMenu;
  private JMenu setStyleMenu;
  private JMenu modifyStyleMenu;
  private Hashtable styleHash = new Hashtable();
}
