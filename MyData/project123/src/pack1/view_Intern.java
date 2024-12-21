package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class view_Intern {

ArrayList< Intern > list3=new ArrayList<Intern>();
	
public ArrayList<Intern> getList3() {
		return list3;
	}
	public void setList3(ArrayList<Intern> list3) {
		this.list3 = list3;
	}
public String execute() throws Exception{
	try{
			Connection con;
			PreparedStatement ps;
			con=MyConnection.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from sp_intern");
		    ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					Intern I1=new Intern();
					I1.setIntern_id(rs.getString(1));
					I1.setBatch_id(rs.getString(2));
					I1.setIntern_username(rs.getString(3));
					I1.setIntern_password(rs.getString(4));
					I1.setIntern_first_name(rs.getString(6));
					I1.setIntern_middle_name(rs.getString(7));
					I1.setIntern_last_name(rs.getString(8));
					I1.setIntern_address(rs.getString(9));
					I1.setBirth_date(rs.getString(10));
					I1.setJoin_date(rs.getString(11));
					I1.setIntern_mobile_number(rs.getString(12));
					I1.setIntern_e_mail(rs.getString(13));
					I1.setGroup_id(rs.getString(14));
					I1.setProject_name(rs.getString(15));
				    list3.add(I1);
				    System.out.println("view data");
		        }
			}catch(Exception e){
				e.printStackTrace();
			}
			return "success";
	    }
}
