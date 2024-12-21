// LockingExample.java
//
import javax.swing.*;
import javax.swing.text.*;

// Sample program showing how AbstractDocument locking works.
public class LockingExample {
  public static void main(String[] args) {

    // Create a document with some initial text
    Document doc = new PlainDocument();
    try {
      doc.insertString(0, "Three blind mice", null);
    } catch (BadLocationException ex) {ex.printStackTrace();}

    // Create two "renders" which will simulate painting the document
    DocRenderer r1 = new DocRenderer("One", doc);
    DocRenderer r2 = new DocRenderer("Two", doc);

    // Start the renders in new threads. We'll print out timing data to show how
    // things work
    long startTime = System.currentTimeMillis();
    r1.renderInThread(startTime);
    r2.renderInThread(startTime);

    // Wait one second before writing
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {}

    // Attempt to add some content to the document
    System.out.println("Start writing: "
      + (System.currentTimeMillis()-startTime));

    try {
      doc.insertString(doc.getLength(), ", see how they run.", null);
    } catch (BadLocationException ex) {ex.printStackTrace();}

    System.out.println("Done writing: "
      + (System.currentTimeMillis()-startTime));

    // Render the modified document
    r1.renderInThread(startTime);
  }
}

// A simple class that implements Runnable and provides a method to run itself
// in a new Thread.
class DocRenderer implements Runnable {

  // Create a new renderer for the given document. A name is provided to
  // distinguish the output of different renderers.
  public DocRenderer(String rname, Document doc) {
    this.rname = rname;
    this.doc = doc;
  }

  // This method is called by AbstractDocument.render(). It "renders" the
  // document by sleeping for 3 sec, then dumping the doc contents to stdout.
  public void run() {
    try {
      System.out.println(rname + " start renderer.run(): "
        + (System.currentTimeMillis()-startTime));

      // Simulate a slow rendering process.
      Thread.sleep(3000);
    } catch (InterruptedException ex) {}

    // "render" by writing the text to stdout
    try {
      System.out.println(rname + ":" + doc.getText(0, doc.getLength()));
    } catch (BadLocationException ex) {ex.printStackTrace();}
  }

  // Calls render() on the document in a new Thread.
  public void renderInThread(final long startTime) {
    this.startTime = startTime;

    // An anonymous inner class for a new Thread
    new Thread() {
      public void run() {
        System.out.println(rname + " start rendering: "
          + (System.currentTimeMillis() - startTime));

        doc.render(DocRenderer.this);

        System.out.println(rname + " done rendering: "
          + (System.currentTimeMillis()-startTime));
      }
    }.start();        // start the new thread
  }

  private Document doc;
  private String rname;
  private long startTime;
}
