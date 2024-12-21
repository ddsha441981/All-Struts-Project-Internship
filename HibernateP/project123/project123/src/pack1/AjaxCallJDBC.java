package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AjaxCallJDBC {
private int id;
private String status;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getId() {
		return id;
}
public void setId(int id) {
		this.id = id;
}

public String leavestatus(){
	
		try{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		con=MyConnection.getConnection();
		pst=con.prepareStatement("update sp_leaves set status= '"+status+"' where leave_id="+id);
	    pst.executeUpdate();
		System.out.println("status change"+id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}

public String examstatus(){
	try{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	con=MyConnection.getConnection();
	System.out.println("Status : "+status);
	pst=con.prepareStatement("update sp_exam set status= '"+status+"' where exam_id="+id);
    pst.executeUpdate();
	System.out.println("status change"+id);
	}catch(Exception e){
		e.printStackTrace();
	}
	return "success";
}
public String taskstatus(){
	try{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		con=MyConnection.getConnection();
		pst=con.prepareStatement("update sp_task set status= '"+status+"' where intern_id="+id);
		pst.executeUpdate();
		System.out.println("change Task status:"+id);
	}catch(Exception e){
		e.printStackTrace();
	}
	return "success";
}
}
