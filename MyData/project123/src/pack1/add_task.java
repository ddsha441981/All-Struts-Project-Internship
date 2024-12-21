package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class add_task {
private String intern_id,task_id,actual_task,start_date,end_date,status;



public String getIntern_id() {
	return intern_id;
}

public void setIntern_id(String intern_id) {
	this.intern_id = intern_id;
}

public String getTask_id() {
	return task_id;
}

public void setTask_id(String task_id) {
	this.task_id = task_id;
}

public String getActual_task() {
	return actual_task;
}

public void setActual_task(String actual_task) {
	this.actual_task = actual_task;
}

public String getStart_date() {
	return start_date;
}

public void setStart_date(String start_date) {
	this.start_date = start_date;
}

public String getEnd_date() {
	return end_date;
}

public void setEnd_date(String end_date) {
	this.end_date = end_date;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String execute(){
	try{
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		con=MyConnection.getConnection();
		pst=con.prepareStatement("insert into sp_task values(?,taskseq.nextval,?,?,?,?)");
		
		pst.setString(1, intern_id);
		pst.setString(2, actual_task);
		pst.setString(3, start_date);
		pst.setString(4, end_date);
		pst.setString(5, "Pending");
		pst.execute();
	
		System.out.println("Assign Task inserted in sp_task table");
	}catch(Exception e){
		e.printStackTrace();
	}
	return "success";
}
}
