package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class view_GL {
	ArrayList<add_view_GLeader> list=new ArrayList<add_view_GLeader>();

	public ArrayList< add_view_GLeader> getList() {
		return list;
	}
	public void setList(ArrayList<add_view_GLeader>list) {
		this.list = list;
}
	public String execute()throws Exception{
		try{
			Connection con;
			PreparedStatement ps;
			con=MyConnection.getConnection();
			System.out.println("view data");
			PreparedStatement pst=con.prepareStatement("select * from sp_group_leader");
		    ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					add_view_GLeader CGL=new add_view_GLeader();
					CGL.setBatch_id(rs.getString(1));
					CGL.setIntern_id(rs.getString(2));
					CGL.setGroup_id(rs.getString(3));
					CGL.setUsername(rs.getString(4));
					CGL.setPassword(rs.getString(5));
				    list.add(CGL);			
		        }
			}catch(Exception e)
			{
				e.printStackTrace();
			}
				return "success";
		   }
	}
