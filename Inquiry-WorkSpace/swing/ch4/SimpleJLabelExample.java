// SimpleJLabelExample.java

//



import javax.swing.*;

public class SimpleJLabelExample {

    public static void main(String[] args) {

        JLabel label = new JLabel("A Very Simple Text Label");

        JFrame frame = new JFrame();

        frame.addWindowListener(new BasicWindowMonitor());

        frame.getContentPane().add(label);

        frame.pack();

        frame.setVisible(true);

    }

}
