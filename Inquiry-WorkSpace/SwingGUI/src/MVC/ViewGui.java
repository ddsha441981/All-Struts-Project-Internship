package MVC;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewGui extends JFrame {
	
	JLabel lblno1,lblno2,lblres3;
	JTextField txt1 ,txt2 , res ;
	JButton b1,b2,b3,b4;
	ViewGui()
	{
		this.setLayout(new FlowLayout());
		lblno1 = new JLabel("Enter 1st No");
		lblno2 = new JLabel("Enter 2st No");
		lblres3 = new JLabel("Result");
		
		txt1 = new JTextField(10);
		txt2 = new JTextField(10);
		res = new JTextField(10);
		res.setEditable(false);
		
		b1 = new JButton("Add");
		
		b2 = new JButton("Sub");

		b3 = new JButton("Multi");

		b4 = new JButton("Div");
		
		this.add(lblno1);
		this.add(txt1);
		this.add(lblno2);
		this.add(txt2);
		this.add(lblres3);
		this.add(res);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Calculater");	
	}
	public static void main(String[] args) {
		ViewGui g = new ViewGui();
		
	}
}
