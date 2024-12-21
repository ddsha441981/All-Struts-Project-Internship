/*
 * SiteFrame.java
 * A simple extension of the JInternalFrame class that contains a list
 * object.  Elements of the list represent HTML pages for a web site.
 */
 
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SiteFrame extends JInternalFrame 
implements ListSelectionListener {

  JList nameList;
  SiteManager parent;
  String[] pages = {"index.html", "page1.html", "page2.html"};

  public SiteFrame(String name, SiteManager sm) {
    super("Site: " + name, true, true, true);
    parent = sm;
    setBounds(50,50,250,100);

    nameList = new JList(pages);
    nameList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    nameList.addListSelectionListener(this);

    Container contentPane = getContentPane();
    contentPane.add(nameList, BorderLayout.CENTER);
  }

  public void valueChanged(ListSelectionEvent lse) {
    // We know this is the list, so pop up the page
    if (!lse.getValueIsAdjusting()) {
      //System.out.println("Got file: " + (String)nameList.getSelectedValue());
      parent.addPageFrame((String)nameList.getSelectedValue());
    }
  }
}



