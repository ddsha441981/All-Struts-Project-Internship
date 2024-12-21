package SwingDestopApplications;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
//import java.awt.event.MouseListener;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Notepad extends JFrame implements ActionListener{

	JMenuBar jmenubar;
	JTextArea txtarea;
	JScrollPane scroll;
	JMenu file,Edit,Format,view,Help;
	JMenuItem newf,openf,savef,exitf,copy,paste,cut,clear,delete,undo,statusbar,veiwHelp,aboutNotepad,close;
	
	JMenuItem txtcolor,bcolor;
	
	JPopupMenu popmenu;
	JMenuItem undo1,paste1,copy1,cut1;
	
	public Notepad()
	{
		Initialze();
		
		openf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser j = new JFileChooser(".");
				int val = j.showOpenDialog(Notepad.this);
				if(val==0)
				{
					File f = j.getSelectedFile();
					System.out.println(f.getAbsolutePath());
					System.out.println(f.length());
					StringBuffer str = new StringBuffer();
					String s;
					BufferedReader br;
					//more code......remaining
				}
				
			}
			
		});
		
savef.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent s1) {
				if(!Notepad.this.txtarea.getText().equals(""))
				{
					int p= JOptionPane.showConfirmDialog(Notepad.this, "Do You Want Save it");
					if(p==0)
					{
						JFileChooser jf = new JFileChooser(".");
						int svaefile = jf.showSaveDialog(Notepad.this);
					
					if(svaefile==0)
					{
						File savef=jf.getSelectedFile();
					}
					
					}
					else if(p==1)
					{
						txtarea.setText(null);
					}
				}
				
				else
				{
					Notepad.this.dispose();
				}
				
			}//more code......remaining
		});
		
		newf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent n1) {
				if(!Notepad.this.txtarea.getText().equals(""))
				{
					int p= JOptionPane.showConfirmDialog(Notepad.this, "Do You Want Save it");
					if(p==0)
					{
						JFileChooser jf = new JFileChooser(".");
						int svaefile = jf.showSaveDialog(Notepad.this);
					
					if(svaefile==0)
					{
						File savef=jf.getSelectedFile();
					}
					
					}
					else if(p==1)
					{
						txtarea.setText(null);
					}
				}
				
				else
				{
					Notepad.this.dispose();
				}
				
			}//more code......remaining
		});
		
		exitf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ex) {
				
				if(!Notepad.this.txtarea.getText().equals(""))
				{
					int p = JOptionPane.showConfirmDialog(Notepad.this,"Do You Want To Exit It");
					if(p==0)
					{
						//System.out.println("called");
						JFileChooser jf = new JFileChooser(".");
						int savefile = jf.showSaveDialog(Notepad.this);
						
						if(savefile==1)
						{
							File savef = jf.getSelectedFile();
						}
					}
						else if(p==1)
						{
							txtarea.setText(null);
						}
					
				}
						else
						{
							Notepad.this.dispose();
						}
				
				}//more code......remaining
		});
		
		txtcolor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e1) {
				Color c = JColorChooser.showDialog(Notepad.this, "Choose color", Color.green);
				txtarea.setForeground(c);
				
			}
		});
		
		bcolor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				
				Color c = JColorChooser.showDialog(Notepad.this, "Choose Color", Color.YELLOW);
				txtarea.setBackground(c);
				//System.out.println("deendayal");
				
			}
		});
	
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent c1) {
				txtarea.copy();
				
			}
		});
		
		paste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent p1) {
				txtarea.paste();
				
			}
		});
		
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent c1) {
			txtarea.cut();
				
			}
		});
		copy1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent c11) {
				txtarea.copy();
				
			}
		});
		paste1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent c11) {
				txtarea.paste();
				
			}
		});
		cut1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent c11) {
		txtarea.cut();
		
	}
});
		
		txtarea.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent a1){
				if(a1.isPopupTrigger())
				{
					popmenu.show(a1.getComponent(),a1.getX(),a1.getY());
				}
				
			}
		});
//		txtarea.addMouseListener(new  MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent a1) {
//				if(a1.isPopupTrigger())
//				{
//					popmenu.show(a1.getComponent(),a1.getX(),a1.getY());
//				}
//				
//			}
//			
//			@Override
//			public void mousePressed(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent r1) {
				
				CloseDialogBox d1 = new CloseDialogBox( Notepad.this);
				System.out.println("In Notepad");
				
			}
		});
		
	}
	public void Initialze()
	{
		jmenubar = new JMenuBar();//create Jmenubar
		
		//1st menu bar data
		file = new JMenu("File");//create menu bar
		newf = new JMenuItem("New");//menu bar option 
		openf = new JMenuItem("Open");
		savef = new JMenuItem("Save");
		exitf = new JMenuItem("Exit");
		close = new JMenuItem("Close");
		
		file.add(newf);
		file.addSeparator();
		file.add(openf);
		file.addSeparator();
		file.add(savef);
		file.addSeparator();
		file.add(exitf);
		file.addSeparator();
		file.add(close);
		
		
		//2nd menubar data
		Edit = new JMenu("Edit");
		undo = new JMenuItem("undo");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		cut = new JMenuItem("cut");
		delete = new JMenuItem("delete");
		clear = new JMenuItem("clear");

		Edit.add(undo).setForeground(getForeground().RED);
		Edit.addSeparator();
		Edit.add(copy).setForeground(getForeground().blue);
		Edit.addSeparator();
		Edit.add(paste).setForeground(getForeground().cyan);
		Edit.addSeparator();
		Edit.add(cut).setForeground(getForeground().GREEN);
		Edit.addSeparator();
		Edit.add(delete).setForeground(getForeground().RED);
		Edit.addSeparator();
		Edit.add(clear).setForeground(getForeground().RED);
		//3rd menu bar Format
		Format = new JMenu("Format");
		txtcolor = new JMenuItem("Text Color");
		bcolor = new JMenuItem("BackGround Color");
		Format.add(txtcolor);
		Format.addSeparator();
		Format.add(bcolor);
		//4th menubar View
		view = new JMenu("view");
		statusbar = new JMenuItem("statusbar");
		view.add("statusbar");
		
		//5th menubar file
		Help = new JMenu("Help");
		veiwHelp = new JMenuItem("veiwHelp");
		Help.add("veiwHelp");
		Help.addSeparator();
		Help.add("aboutNotepad");
		
		
		jmenubar.add(file);
		jmenubar.add(Edit);
		jmenubar.add(Format);
		jmenubar.add(view);
		jmenubar.add(Help);
		
		txtarea = new JTextArea();//create referance for txt area
		this.add(txtarea);
		
		
		// Create Popupmenu

		popmenu = new JPopupMenu();
		
		undo1 = new JMenuItem("undo1");
		copy1 = new JMenuItem("copy1");
		paste1 = new JMenuItem("paste1");
		cut1 = new JMenuItem("cut1");
		
		popmenu.add(cut1);
		popmenu.addSeparator();
		popmenu.add(copy1);
		popmenu.addSeparator();
		popmenu.add(paste1);
		popmenu.addSeparator();
		popmenu.add(undo1);
		
		//Create Scroll Bar
		scroll = new JScrollPane(txtarea);
		this.add(scroll);
		
		this.setJMenuBar(jmenubar);
		//this.add(pane);
		this.setSize(700, 700);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My Notepad");
		
		
	}
	
	
public static void main(String[] args) {
	Notepad not = new Notepad();
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}	


}

