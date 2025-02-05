package MyLogin;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import oracle.sql.CHAR;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {

	JPanel panel1;
	JPanel panel2;

	JLabel l1;
	JLabel l2;
	JTextField txt1;
	JPasswordField txt2;
	JButton b1;
	JButton b2;
	JButton b3;

	Login() {
		l1 = new JLabel("User Name");
		txt1 = new JTextField(20);
		l2 = new JLabel("Password");
		txt2 = new JPasswordField(20);
		b1 = new JButton("submit");
		b2 = new JButton("clear");
		b3 = new JButton("cancel");
		this.setLayout(new GridLayout(2, 4));// Frame is this

		panel1 = new JPanel();
		this.add(panel1);
		this.setLayout(new GridLayout(2,4));

		panel1.add(l1);
		panel1.add(txt1);
		panel1.add(l2);
		panel1.add(txt2);

		panel1.add(txt2);

		panel2 = new JPanel();
		this.add(panel2);
		this.setLayout(new GridLayout(3,1));
		
		panel2.add(b1);
		b1.addActionListener(this);
		panel2.add(b2);
		b2.addActionListener(this);
		panel2.add(b3);
		b3.addActionListener(this);

		// panel2 = new JPanel();

		this.setVisible(true);
		this.setTitle("MyApplication");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setBounds(400,400,400, 500);
	}

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Login te = new Login();

	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		/*if (e.getActionCommand().equals("submit"))
		{
			if(txt1.getText().equals("")&&txt2.getText().equals(""))
			{
				System.err.println("Enter Data firstly");
			}
			else
			{
			if (txt1.getText().equals("abc") && txt2.getText().equals("123")) {
				System.out.println("Login Succesfully");
			} else {
				System.err.println("Invaild User");
			}
			}
			
		}
		if (e.getActionCommand().equals("cancel")) {
			Login.this.dispose();

		}
		if (e.getActionCommand().equals("clear")) {
			txt1.setText("");
			txt2.setText("");
		}*/
		
		if(e.getActionCommand().equals("submit"));
		{
			if(txt1.getText().length()==0)
			{
			JOptionPane.showMessageDialog(null, "Enter user name first");
			}
			else if(txt2.getText().length()==0)
			{
				JOptionPane.showMessageDialog(null, "Enter Password first");
			}
			else
			{
				String user = txt1.getText();
				char[] a=txt2.getPassword();
				if(user==user && a==a)
				{
					JOptionPane.showMessageDialog(null, "Correct User name and password");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect user name and password");
				}
			}
		}
	
	
	}

}
