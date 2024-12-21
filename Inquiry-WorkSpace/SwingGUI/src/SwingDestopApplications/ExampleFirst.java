package SwingDestopApplications;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExampleFirst extends JFrame  {
	
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	 
	ExampleFirst() {

	}
	
	public ExampleFirst(String s)
	{
		super(s);
	}
	
	void initMethod()
	{
		l1 = new JLabel("Two Number Addition");
		l2 = new JLabel("First No");
		l3 = new JLabel("Second No");
		l4 = new JLabel("Result");
		t1= new JTextField();
		t2 = new JTextField();
		b1 = new JButton("Add");
		b2 = new JButton("Sub");
		b3 = new JButton("Multi");
		b4 = new JButton("Div");
		
		setLayout(null);
		l1.setBounds(50, 50, 200, 20);
		l2.setBounds(50, 80, 100, 20);
		t1.setBounds(150, 90, 200, 20);
		l3.setBounds(50, 130, 100, 20);
		t2.setBounds(150, 130, 200, 20);
		b1.setBounds(80, 180, 100, 20);
		b2.setBounds(70, 210, 100, 20);
		b3.setBounds(80, 240, 100, 20);
		b4.setBounds(80, 280, 100, 20);
		l4.setBounds(50,300,200,20);
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l4);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		ExampleFirst jf = new ExampleFirst("My Example");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300, 300);
		
		jf.initMethod();
	}

}
