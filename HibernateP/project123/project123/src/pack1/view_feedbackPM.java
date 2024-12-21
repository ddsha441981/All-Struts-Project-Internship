package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class view_feedbackPM {

	
	ArrayList< Feedback > list=new ArrayList<Feedback >();

	public ArrayList<Feedback > getList() {
		return list;
	}

	public void setList(ArrayList<Feedback >list) {
		this.list = list;
	}
	public String execute(){
		
		try{
			Connection con;
			PreparedStatement ps;
			con=MyConnection.getConnection();
			System.out.println("view data");
			PreparedStatement pst=con.prepareStatement("select * from sp_feedback");
		    ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					Feedback F1=new Feedback();
					F1.setIntern_id(rs.getString(1));
					F1.setInterns_name(rs.getString(2));
					F1.setE_mail_id(rs.getString(3));
					F1.setCurrent_date(rs.getString(4));
					F1.setFeedback(rs.getString(5));
				    list.add(F1);
				    System.out.println(F1);
		        }
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		return "success";
		
	}
}
