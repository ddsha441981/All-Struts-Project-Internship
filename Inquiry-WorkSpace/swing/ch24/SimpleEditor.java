// SimpleEditor.java
//
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.Hashtable;

// An example showing several DefaultEditorKit features. This class is designed
// to be easily extended to add additional functionality.
public class SimpleEditor extends JFrame {

  public static void main(String[] args) {
    SimpleEditor editor = new SimpleEditor();
    editor.addWindowListener(new BasicWindowMonitor());
    editor.setVisible(true);
  }

  // Create an editor
  public SimpleEditor() {
    super("Swing Editor");
    textComp = createTextComponent();
    hashDefaultActions();
    makeActionsPretty();
    updateKeymap();

    Container content = getContentPane();
    content.add(textComp, BorderLayout.CENTER);
    content.add(createToolBar(), BorderLayout.NORTH);

    setJMenuBar(createMenuBar());

    setSize(320, 240);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent ev) { System.exit(0); }
    });
  }

  // Create the JTextComponent subclass.
  protected JTextComponent createTextComponent() {
    JTextArea ta = new JTextArea();
    ta.setLineWrap(true);
    return ta;
  }

  // Get all of the actions defined for our text component. Hash each one by name
  // so we can look for it later.
  protected void hashDefaultActions() {
    Action[] actions = textComp.getActions();
    for (int i=0; i<actions.length; i++) {
      String name = (String)actions[i].getValue(Action.NAME);
      actionHash.put(name, actions[i]);
    }
  }

  // Get an action by name
  protected Action getHashedAction(String name) {
    return (Action)actionHash.get(name);
  }

  // Add icons and friendly names to actions we care about
  protected void makeActionsPretty() {
    Action a;
    a = getHashedAction(DefaultEditorKit.cutAction);
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/cut.gif"));
    a.putValue(Action.NAME, "Cut");

    a = getHashedAction(DefaultEditorKit.copyAction);
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/copy.gif"));
    a.putValue(Action.NAME, "Copy");

    a = getHashedAction(DefaultEditorKit.pasteAction);
    a.putValue(Action.SMALL_ICON, new ImageIcon("icons/paste.gif"));
    a.putValue(Action.NAME, "Paste");

    a = getHashedAction(DefaultEditorKit.selectAllAction);
    a.putValue(Action.NAME, "Select All");
  }

  // Add some key->Action mappings
  protected void updateKeymap() {

    // Create a new child Keymap
    Keymap map = JTextComponent.addKeymap("NextPrevMap",
      textComp.getKeymap());

    // Define the keystrokes to be added
    KeyStroke next = KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT,
      InputEvent.CTRL_MASK, false);
    KeyStroke prev = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,
      InputEvent.CTRL_MASK, false);
    KeyStroke selNext = KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT,
      InputEvent.CTRL_MASK|InputEvent.SHIFT_MASK, false);
    KeyStroke selPrev = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,
      InputEvent.CTRL_MASK|InputEvent.SHIFT_MASK, false);

    // Add the new mappings used DefaultEditorKit actions
    map.addActionForKeyStroke(next, getHashedAction(
      DefaultEditorKit.nextWordAction));
    map.addActionForKeyStroke(prev, getHashedAction(
      DefaultEditorKit.previousWordAction));
    map.addActionForKeyStroke(selNext, getHashedAction(
      DefaultEditorKit.selectionNextWordAction));
    map.addActionForKeyStroke(selPrev, getHashedAction(
      DefaultEditorKit.selectionPreviousWordAction));

    // Set the Keymap for the text component
    textComp.setKeymap(map);
  }

  // Create a simple JToolBar with some buttons
  protected JToolBar createToolBar() {
    JToolBar bar = new JToolBar();

    // Add simple actions for opening & saving
    bar.add(getOpenAction()).setText("");
    bar.add(getSaveAction()).setText("");
    bar.addSeparator();

    // Add cut/copy/paste buttons
    bar.add(getHashedAction(DefaultEditorKit.cutAction)).setText("");
    bar.add(getHashedAction(DefaultEditorKit.copyAction)).setText("");
    bar.add(getHashedAction(DefaultEditorKit.pasteAction)).setText("");
    return bar;
  }

  // Create a JMenuBar with file & edit menus
  protected JMenuBar createMenuBar() {
    JMenuBar menubar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    menubar.add(file);
    menubar.add(edit);

    file.add(getOpenAction());
    file.add(getSaveAction());
    file.add(new ExitAction());
    edit.add(getHashedAction(DefaultEditorKit.cutAction));
    edit.add(getHashedAction(DefaultEditorKit.copyAction));
    edit.add(getHashedAction(DefaultEditorKit.pasteAction));
    edit.add(getHashedAction(DefaultEditorKit.selectAllAction));
    return menubar;
  }

  // Subclass can override to use a different open action
  protected Action getOpenAction() { return openAction; }

  // Subclass can override to use a different save action
  protected Action getSaveAction() { return saveAction; }

  protected JTextComponent getTextComponent() { return textComp; }

  private Action openAction = new OpenAction();
  private Action saveAction = new SaveAction();

  private JTextComponent textComp;
  private Hashtable actionHash = new Hashtable();

  // ********** ACTION INNER CLASSES ********** //

  // A very simple "exit" action
  public class ExitAction extends AbstractAction {
    public ExitAction() { super("Exit"); }
    public void actionPerformed(ActionEvent ev) { System.exit(0); }
  }

  // An action that opens an existing file
  class OpenAction extends AbstractAction {

    public OpenAction() { 
      super("Open", new ImageIcon("icons/open.gif")); 
    }

    // Query user for a filename and attempt to open and read the file into the
    // text component
    public void actionPerformed(ActionEvent ev) {
      String filename = JOptionPane.showInputDialog(
        SimpleEditor.this, "Enter Filename");
      if (filename == null)
        return;

      FileReader reader = null;
      try {
        reader = new FileReader(filename);
        textComp.read(reader, null);
      }
      catch (IOException ex) {
        JOptionPane.showMessageDialog(SimpleEditor.this,
        "File Not Found", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
      finally {
        if (reader != null) {
          try {
            reader.close();
          } catch (IOException x) {}
        }
      }
    }
  }

  // An action that saves the document to a file
  class SaveAction extends AbstractAction {
    public SaveAction() {
      super("Save", new ImageIcon("icons/save.gif"));
    }

    // Query user for a filename and attempt to open and write the text
    // component's content to the file
    public void actionPerformed(ActionEvent ev) {
      String filename = JOptionPane.showInputDialog(
        SimpleEditor.this, "Enter Filename");
      if (filename == null)
        return;

      FileWriter writer = null;
      try {
        writer = new FileWriter(filename);
        textComp.write(writer);
      }
      catch (IOException ex) {
        JOptionPane.showMessageDialog(SimpleEditor.this,
        "File Not Saved", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
      finally {
        if (writer != null) {
          try {
            writer.close();
          } catch (IOException x) {}
        }
      }
    }
  }
}
