package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewLeaves_PM {

	ArrayList< Leaves_intern > list=new ArrayList<Leaves_intern >();

	public ArrayList<Leaves_intern > getList() {
		return list;
	}

	public void setList(ArrayList<Leaves_intern >list) {
		this.list = list;
	}
	public String execute()throws Exception
	{
		try{
			Connection con;
			PreparedStatement ps;
			con=MyConnection.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from sp_leaves");
		    ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					Leaves_intern LI=new Leaves_intern();
					LI.setLeave_id(rs.getString(1));
					LI.setReason(rs.getString(2));
					LI.setTo_date(rs.getString(3));
					LI.setFrom_date(rs.getString(4));
					LI.setStatus(rs.getString(5));
					LI.setLeave(rs.getString(6));
				    list.add(LI);
				    System.out.println(LI);
		        }
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		return "success";
	}
}
