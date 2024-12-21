package SwingDestopApplications;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

public class CloseDialogBox  extends JDialog{
	
	JButton yes,no,cancel;
	
	
	public CloseDialogBox(Notepad j)
	{
		this.setModal(true);
		
		yes = new JButton("Save");
		no = new JButton("NO");
		cancel = new JButton("Cancel");
		
		this.add(yes);
		this.add(no);
		this.add(cancel);
		
		this.setTitle(" Do you Want Close it");
		this.setSize(300,150);
		this.setLayout(new FlowLayout());
		this.setLocation(100,200);
		this.setVisible(true);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		yes.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent f1) {
				System.out.println("hello");
			
				
			}
		});
	}
	
	public static void main(String[] args) {
		CloseDialogBox d1 = new CloseDialogBox(new Notepad());
		
	}

}
