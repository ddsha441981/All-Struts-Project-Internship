package SwingDestopApplications;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JLabelExample extends JFrame {
JPanel panel1;
JPanel panel2;

JLabel j1;
JLabel j2;
JLabel j3;
JTextField txt1;
JTextField txt2;
JPasswordField txt3;
JButton b1;
JButton b2;
JButton b3;
	JLabelExample()
	{
		
		
		
		j1 = new JLabel("User Name");
		txt1 = new JTextField(20);
		j2 = new JLabel(" Password");
		txt2 = new JPasswordField(20);
		j3 = new JLabel("Confirm Password");
		txt3 = new JPasswordField(20);
		b1 = new JButton("submit");
		b2 = new JButton("clear");
		b3 = new JButton("cancle");
		
//		j1.setVerticalAlignment(JLabel.TOP);
//		j1.setToolTipText("Enter User Name");
		
		panel1 = new JPanel();
		add(panel1);
		setLayout(new GridLayout(3,3));
		panel1.add(j1);
		panel1.add(txt1);
		
		panel1.add(j2);
		panel1.add(txt2);
		
		panel1.add(j3);
		panel1.add(txt3);
		
		panel2 = new JPanel();
		add(panel2);
		setLayout(new GridLayout(1,3));
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		
		setTitle("MyJLabel");
		setSize(400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setVisible(true);
		setLayout(new GridLayout(4,2));
		
	}
	



	public static void main(String[] args) {
		
		new JLabelExample().setVisible(true);
		//JLabelExample j = new JLabelExample();
	}

}
