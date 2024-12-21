package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Leaves_intern {
	private String leave_id,reason,to_date,from_date,leave;
	private String status;
	public String getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(String leave_id) {
		this.leave_id = leave_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getLeave() {
		return leave;
	}
	public void setLeave(String leave) {
		this.leave = leave;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String execute()throws Exception
	{
		try{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		con=MyConnection.getConnection();
			pst=con.prepareStatement("insert into sp_leaves(leave_id,reason,to_date,from_date,status,leave) values(?,?,?,?,?,?)");
			pst.setString(1, leave_id);
			pst.setString(2, reason);
			pst.setString(3, to_date);
			pst.setString(4, from_date);
			pst.setString(5, "Pending");
			pst.setString(6, leave);
			pst.execute();
			System.out.println("Leave Application save in DataBase");
		    }catch(Exception e){
			    e.printStackTrace();
		       }
		return "success";
	}
}
