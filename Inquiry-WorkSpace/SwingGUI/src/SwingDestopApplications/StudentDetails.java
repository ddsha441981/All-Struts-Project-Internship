package SwingDestopApplications;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StudentDetails extends JFrame implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JSpinner spinner;
	
	private JLabel lblBirthdate;
	private JLabel lblQualification;
	private JLabel lblGender;
	private JRadioButton rdbtnFemale;
	private JLabel lblSubject;
	private JTextArea textArea;
	private JLabel lblSelectedSubject;
	private JLabel lblStudentInformation;
	private JButton btnSubmit;
	private JButton btnReset;
	private JComboBox comboBox_1;
	//JComboBox tt;
	 String quali[]={"BCA","MCA","MBA","BBA","BCS"}; 
	 String sub[]={"Java","C","C++","PHP","SQL"};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails window = new StudentDetails();
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
	public StudentDetails() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 58, 200, 50);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(131, 67, 440, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSpinner sp1 = new JSpinner();
		sp1.setBounds(131, 119, 114, 20);
		frame.getContentPane().add(sp1);
		
		JSpinner sp2 = new JSpinner();
		sp2.setBounds(244, 119, 114, 20);
		frame.getContentPane().add(sp2);
		
		JSpinner sp3 = new JSpinner();
		sp3.setBounds(359, 119, 114, 20);
		frame.getContentPane().add(sp3);
		
		lblBirthdate = new JLabel("BirthDate");
		lblBirthdate.setBounds(10, 111, 200, 50);
		frame.getContentPane().add(lblBirthdate);
		
		lblQualification  = new JLabel("Qualification");
		lblQualification.setBounds(10, 151, 377, 33);
		frame.getContentPane().add(lblQualification);
		
		
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(20, 204, 200, 50);
		frame.getContentPane().add(lblGender);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(131, 192, 169, 50);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FeMale");
		r2.setBounds(131, 221, 169, 50);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();  
		bg.add(r1);bg.add(r2);  
		  
		frame.add(r1);frame.add(r2);
		
		JComboBox c1 = new JComboBox(sub);
		c1.setBounds(131, 278, 96, 33);
		frame.getContentPane().add(c1);
		
		lblSubject = new JLabel("Subject");
		lblSubject.setBounds(10, 269, 200, 50);
		frame.getContentPane().add(lblSubject);
		
		
		textArea = new JTextArea();
		textArea.setBounds(366, 217, 227, 96);
		frame.getContentPane().add(textArea);
		
		lblSelectedSubject = new JLabel("Selected Subject");
		lblSelectedSubject.setBounds(422, 168, 200, 50);
		frame.getContentPane().add(lblSelectedSubject);
		
		lblStudentInformation = new JLabel("Student Information");
		lblStudentInformation.setForeground(Color.BLUE);
		lblStudentInformation.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblStudentInformation.setBounds(190, 6, 283, 50);
		frame.getContentPane().add(lblStudentInformation);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(103, 372, 89, 23);
		frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(this);
		
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(256, 372, 89, 23);
		frame.getContentPane().add(btnReset);
		
		comboBox_1 = new JComboBox(quali);
		comboBox_1.setBounds(131, 150, 96, 33);
		frame.getContentPane().add(comboBox_1);
		
		comboBox_1.setEditable(true);
		
//		comboBox_2 = new JComboBox(sub);
//		comboBox_2.setBounds(131, 150, 96, 33);
//		frame.getContentPane().add(comboBox_2);
		

//		JComboBox cb=new JComboBox(country);  
//		    cb.setBounds(50, 50,90,20);  
//		    frame.add(cb); 
		
	}

	@Override
	public void actionPerformed(ActionEvent a1) {
		
		if(a1.getActionCommand().equals("btnSubmit"))
		{
//			if(! textField.getText().equals(""))
			System.out.println(!textField.getText().equals(""));
			System.out.println("lkcdlksjlk");
		}
		else 
		{
			System.out.println(textField.getText());
		}
		
//		JTextField t =  (JTextField)a1.getSource();
//		textField.setText(t.getText());
		
	}
	

		
}
