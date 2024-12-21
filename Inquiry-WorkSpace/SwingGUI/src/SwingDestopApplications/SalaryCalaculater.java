package SwingDestopApplications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class SalaryCalaculater {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalaryCalaculater window = new SalaryCalaculater();
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
	public SalaryCalaculater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(23, 81, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary");
		lblBasicSalary.setBounds(23, 121, 70, 14);
		frame.getContentPane().add(lblBasicSalary);
		
		JCheckBox chckbxHra = new JCheckBox("HRA");
		chckbxHra.setBounds(66, 160, 97, 23);
		frame.getContentPane().add(chckbxHra);
		
		JCheckBox chckbxDa = new JCheckBox("DA");
		chckbxDa.setBounds(66, 186, 97, 23);
		frame.getContentPane().add(chckbxDa);
		
		JLabel lblTotalSalary = new JLabel("Total Salary");
		lblTotalSalary.setBounds(211, 209, 70, 14);
		frame.getContentPane().add(lblTotalSalary);
		
		textField = new JTextField();
		textField.setBounds(291, 202, 254, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 78, 271, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 118, 271, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxPf = new JCheckBox("PF");
		chckbxPf.setBounds(233, 267, 97, 23);
		frame.getContentPane().add(chckbxPf);
		
		JCheckBox chckbxITex = new JCheckBox("I Tex");
		chckbxITex.setBounds(233, 294, 97, 23);
		frame.getContentPane().add(chckbxITex);
		
		JLabel lblSalaryHand = new JLabel("Salary Hand");
		lblSalaryHand.setBounds(211, 324, 70, 14);
		frame.getContentPane().add(lblSalaryHand);
		
		textField_3 = new JTextField();
		textField_3.setBounds(292, 317, 253, 29);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(207, 415, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblSalaryCalculater = new JLabel("Salary Calculater");
		lblSalaryCalculater.setBackground(Color.BLACK);
		lblSalaryCalculater.setToolTipText("");
		lblSalaryCalculater.setLabelFor(frame);
		lblSalaryCalculater.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalaryCalculater.setForeground(Color.MAGENTA);
		lblSalaryCalculater.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblSalaryCalculater.setBounds(243, 0, 283, 48);
		frame.getContentPane().add(lblSalaryCalculater);
	}
}
