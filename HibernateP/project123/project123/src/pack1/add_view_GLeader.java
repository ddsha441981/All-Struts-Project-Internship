package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class add_view_GLeader extends ActionSupport {
private String batch_id,intern_id,group_id,username,password;

public String getBatch_id() {
	return batch_id;
}

public void setBatch_id(String batch_id) {
	this.batch_id = batch_id;
}

public String getIntern_id() {
	return intern_id;
}

public void setIntern_id(String intern_id) {
	this.intern_id = intern_id;
}

public String getGroup_id() {
	return group_id;
}

public void setGroup_id(String group_id) {
	this.group_id = group_id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
ArrayList<add_view_GLeader> list=new ArrayList<add_view_GLeader>();

public ArrayList< add_view_GLeader> getList() {
	return list;
}

public void setList(ArrayList<add_view_GLeader>list) {
	this.list = list;
}

public String execute()throws Exception
{
  try{
	 Connection con;
	 ResultSet rs;
	 PreparedStatement pst;
	 con=MyConnection.getConnection();
     pst=con.prepareStatement("insert into sp_group_leader(batch_id,intern_id,group_id,username,password) values(?,?,?,?,?)");
     pst.setString(1, batch_id);
     pst.setString(2, intern_id);
     pst.setString(3, group_id);
     pst.setString(4, username);
     pst.setString(5, password);
     pst.execute();
     System.out.println("value inserted  in Group Leader Table");
     }catch (Exception e){
    	 e.printStackTrace();
     }	
		return SUCCESS;
   }
//public String viewreport()throws Exception
//{
//	try{
//	Connection con;
//	PreparedStatement ps;
//	con=MyConnection.getConnection();
//	System.out.println("view data");
//	PreparedStatement pst=con.prepareStatement("select * from sp_group_leader");
//    ResultSet rs=pst.executeQuery();
//		while(rs.next())
//		{
//			add_view_GLeader CGL=new add_view_GLeader();
//			CGL.setBatch_id(rs.getString(1));
//			CGL.setIntern_id(rs.getString(2));
//			CGL.setGroup_id(rs.getString(3));
//			CGL.setUsername(rs.getString(4));
//			CGL.setPassword(rs.getString(5));
//		    list.add(CGL);			
//        }
//	}catch(Exception e)
//	{
//		e.printStackTrace();
//	}
//		return SUCCESS;
//   }
}
