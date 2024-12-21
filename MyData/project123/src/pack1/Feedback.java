package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Feedback {
private String intern_id,interns_name,e_mail_id,current_date,feedback;

public String getIntern_id() {
	return intern_id;
}

public void setIntern_id(String intern_id) {
	this.intern_id = intern_id;
}

public String getInterns_name() {
	return interns_name;
}

public void setInterns_name(String interns_name) {
	this.interns_name = interns_name;
}

public String getE_mail_id() {
	return e_mail_id;
}

public void setE_mail_id(String e_mail_id) {
	this.e_mail_id = e_mail_id;
}

public String getCurrent_date() {
	return current_date;
}

public void setCurrent_date(String current_date) {
	this.current_date = current_date;
}

public String getFeedback() {
	return feedback;
}

public void setFeedback(String feedback) {
	this.feedback = feedback;
}
public String execute()throws Exception{
	try{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	con=MyConnection.getConnection();
	pst=con.prepareStatement("insert into sp_feedback(intern_id,interns_name,e_mail_id,current_date,feedback) values(?,?,?,?,?)");
	pst.setString(1, intern_id);
	pst.setString(2, interns_name);
	pst.setString(3, e_mail_id);
	pst.setString(4, current_date);
	pst.setString(5, feedback);
	pst.execute();
	System.out.println("Data Inserted in sp_feedback table");
	}catch(SQLException e){
		e.printStackTrace();
	}
	return "success";
	}
}
