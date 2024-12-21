// ThumbNailFileView.java
// A simple implementation of the FileView class that provides a 16x16 image of
// each GIF or JPG file for its icon. This could be SLOW for large images, as we
// simply load the real image and then scale it.
//
import java.io.File;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.plaf.metal.MetalIconFactory;

public class ThumbNailFileView extends FileView {

  private Icon fileIcon = MetalIconFactory.getTreeLeafIcon();
  private Icon folderIcon = MetalIconFactory.getTreeFolderIcon();
  private Component observer;

  public ThumbNailFileView(Component c) {
    // we need a component around to create our icon's image
    observer = c;
  }

  public String getDescription(File f) {
    // we won't store individual descriptions, so just return the
    // type description
    return getTypeDescription(f);
  }

  public Icon getIcon(File f) {
    // is it a folder?
    if (f.isDirectory()) { return folderIcon; }

    // ok, it's a file, so return a custom icon if it's an image file
    String name = f.getName().toLowerCase();
    if (name.endsWith(".jpg") || name.endsWith(".gif")) {
      return new Icon16(f.getAbsolutePath());
    }

    // and return the generic file icon if it's not
    return fileIcon;
  }

  public String getName(File f) {
    String name = f.getName();
    return name.equals("") ? f.getPath() : name;
  }

  public String getTypeDescription(File f) {
    String name = f.getName().toLowerCase();
    if (f.isDirectory()) { return "Folder"; }
    if (name.endsWith(".jpg")) { return "JPG Image"; }
    if (name.endsWith(".gif")) { return "GIF Image"; }
    return "Generic File";
  }

  public Boolean isTraversable(File f) {
    // we'll mark all directories as traversable
    return f.isDirectory() ? Boolean.TRUE : Boolean.FALSE;
  }

  public class Icon16 extends ImageIcon {
    public Icon16(String f) { 
      super(f);
      Image i = observer.createImage(16, 16);
      i.getGraphics().drawImage(getImage(), 0, 0, 16, 16, observer);
      setImage(i);
    }

    public int getIconHeight() { return 16; }
    public int getIconWidth() { return 16; }
    
    public void paintIcon(Component c, Graphics g, int x, int y) {
      g.drawImage(getImage(), x, y, c);
    }
  }
}
