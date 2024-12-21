package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class add_view_projects {
	private String project_id,project_name;
ArrayList<add_view_projects> list=new ArrayList<add_view_projects>();
public ArrayList<add_view_projects> getList() {
	return list;
}
public void setList(ArrayList<add_view_projects> list) {
	this.list = list;
}
public String getProject_id() {
	return project_id;
}
public void setProject_id(String group_id) {
	this.project_id = group_id;
}
public String getProject_name() {
	return project_name;
}
public void setProject_name(String project_name) {
	this.project_name = project_name;
}

public String execute()throws Exception
    {
	try{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		con=MyConnection.getConnection();
		pst=con.prepareStatement("insert into sp_project(project_id,project_name) values(?,?)");
		pst.setString(1, project_id);
		pst.setString(2, project_name);
		pst.execute();
		System.out.println("values inserted in sp_project table");
	   }catch (Exception e) {
		e.printStackTrace();
	}
		return "success";
    } 

public String view5()throws Exception
    {
	try{
		Connection con;
		PreparedStatement ps;
		con=MyConnection.getConnection();
		PreparedStatement pst=con.prepareStatement("select * from sp_project");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			add_view_projects P=new add_view_projects();
			P.setProject_id(rs.getString(1));
			P.setProject_name(rs.getString(2));
			list.add(P);
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
		return "success";
	
	}
}
