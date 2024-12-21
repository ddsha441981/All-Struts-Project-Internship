package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.omg.PortableInterceptor.SUCCESSFUL;

public class view_batch {
	
	ArrayList< Batch > list=new ArrayList<Batch >();

	public ArrayList<Batch > getList() {
		return list;
	}

	public void setList(ArrayList<Batch >list) {
		this.list = list;
	}
	public String execute()throws Exception
	{
		try{
			Connection con;
			PreparedStatement ps;
			con=MyConnection.getConnection();
			System.out.println("view data");
			PreparedStatement pst=con.prepareStatement("select * from sp_batch");
		    ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					Batch B1=new Batch();
					B1.setBatch_id(rs.getString(1));
					B1.setBatch_name(rs.getString(2));
					B1.setStart_date(rs.getString(3));
					B1.setEnd_date(rs.getString(4));
					B1.setTechnology(rs.getString(5));
				    list.add(B1);
				    System.out.println(B1);
		        }
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		return "success";
	}
}
