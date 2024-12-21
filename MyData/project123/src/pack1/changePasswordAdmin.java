package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class changePasswordAdmin {
private String old_password,new_password;

public String getOld_password() {
	return old_password;
}

public void setOld_password(String old_password) {
	this.old_password = old_password;
}

public String getNew_password() {
	return new_password;
}

public void setNew_password(String new_password) {
	this.new_password = new_password;
}


public String execute()throws Exception
      {
	   Connection con=null;
	   PreparedStatement pst=null;
	   con=MyConnection.getConnection();
	   try{
		   pst=con.prepareStatement("update sp_admin set password=? where password=?");
		   pst.setString(1, new_password);
		   pst.setString(2, old_password);
		   pst.executeUpdate();
		   System.out.println("password successfully change");
	      }catch(SQLException e){
	    	  e.printStackTrace();
	      }
	   return "success";
      }
public String manager()throws Exception
  {
	try{
		Connection con=null;
		PreparedStatement pst=null;
		con=MyConnection.getConnection();
		pst=con.prepareStatement("update sp_projectmanagernew set password=? where password=?");
		pst.setString(1, new_password);
		pst.setString(2, old_password);
		pst.executeUpdate();
		System.out.println("PM- password successfully change");
	}catch (Exception e) {
		e.printStackTrace();
	}
	return "success";	
  }
public String Intern()throws Exception
{
	try{
		Connection con=null;
		PreparedStatement pst=null;
		con=MyConnection.getConnection();
		pst=con.prepareStatement("update sp_Intern set intern_password=? where intern_password=?");
		pst.setString(1, new_password);
		pst.setString(2, old_password);
		pst.executeUpdate();
		System.out.println("Interns password successfully change");
	}catch (Exception e) {
		e.printStackTrace();
	}
	return "success";	
}
public String GL()throws Exception
{
	try{
		Connection con=null;
		PreparedStatement pst=null;
		con=MyConnection.getConnection();
		pst=con.prepareStatement("update sp_group_leader set password=? where password=?");
		pst.setString(1, new_password);
		pst.setString(2, old_password);
		pst.executeUpdate();
		System.out.println("Group Leader password successfully change");
	}catch (Exception e) {
		e.printStackTrace();
	}
	return "success";	
}
}
