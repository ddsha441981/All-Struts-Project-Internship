package SwingDestopApplications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Design {

	private JFrame frame;
	private JLabel lblUserName;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design window = new Design();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblUserName = new JLabel("User Name");
		lblUserName.setBounds(10, 30, 200, 59);
		frame.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(159, 45, 248, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 74, 200, 50);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 85, 248, 29);
		frame.getContentPane().add(passwordField);
		
		JLabel lblConfrimPassword = new JLabel("Confrim Password");
		lblConfrimPassword.setBounds(10, 114, 248, 50);
		frame.getContentPane().add(lblConfrimPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(121, 186, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(159, 125, 248, 29);
		frame.getContentPane().add(passwordField_1);
		
		lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 18));
		lblNewLabel.setBounds(177, 0, 200, 50);
		frame.getContentPane().add(lblNewLabel);
	}
}
