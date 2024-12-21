package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class view_task {
	ArrayList< add_task > list=new ArrayList<add_task >();

	public ArrayList<add_task > getList() {
		return list;
	}

	public void setList(ArrayList<add_task >list) {
		this.list = list;
	}
	public String execute()throws Exception
	{
		try{
			Connection con;
			PreparedStatement ps;
			con=MyConnection.getConnection();
			System.out.println("view data");
			PreparedStatement pst=con.prepareStatement("select * from sp_task");
		    ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					add_task A1=new add_task();
					A1.setIntern_id(rs.getString(1));
					A1.setTask_id(rs.getString(2));
					A1.setActual_task(rs.getString(3));
					A1.setStart_date(rs.getString(4));
					A1.setEnd_date(rs.getString(5));
					A1.setStatus(rs.getString(6));
				    list.add(A1);
				    System.out.println(A1);
		        }
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		return "success";
	}
}
