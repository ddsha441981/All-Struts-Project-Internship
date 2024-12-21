package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class Intern extends ActionSupport {
private String intern_id,batch_id,intern_username,intern_password,intern_re_enter_password ,intern_first_name,intern_middle_name,intern_last_name,intern_address,birth_date,join_date,intern_mobile_number,intern_e_mail,group_id,project_name;

   
public String getIntern_id() {
	return intern_id;
}

public void setIntern_id(String intern_id) {
	this.intern_id = intern_id;
}

public String getBatch_id() {
	return batch_id;
}

public void setBatch_id(String batch_id) {
	this.batch_id = batch_id;
}

public String getIntern_username() {
	return intern_username;
}

public void setIntern_username(String intern_username) {
	this.intern_username = intern_username;
}

public String getIntern_password() {
	return intern_password;
}

public void setIntern_password(String intern_password) {
	this.intern_password = intern_password;
}

public String getIntern_re_enter_password() {
	return intern_re_enter_password;
}

public void setIntern_re_enter_password(String intern_re_enter_password) {
	this.intern_re_enter_password = intern_re_enter_password;
}

public String getIntern_first_name() {
	return intern_first_name;
}

public void setIntern_first_name(String intern_first_name) {
	this.intern_first_name = intern_first_name;
}

public String getIntern_middle_name() {
	return intern_middle_name;
}

public void setIntern_middle_name(String intern_middle_name) {
	this.intern_middle_name = intern_middle_name;
}

public String getIntern_last_name() {
	return intern_last_name;
}

public void setIntern_last_name(String intern_last_name) {
	this.intern_last_name = intern_last_name;
}

public String getIntern_address() {
	return intern_address;
}

public void setIntern_address(String intern_address) {
	this.intern_address = intern_address;
}

public String getBirth_date() {
	return birth_date;
}

public void setBirth_date(String birth_date) {
	this.birth_date = birth_date;
}

public String getJoin_date() {
	return join_date;
}

public void setJoin_date(String join_date) {
	this.join_date = join_date;
}

public String getIntern_mobile_number() {
	return intern_mobile_number;
}

public void setIntern_mobile_number(String intern_mobile_number) {
	this.intern_mobile_number = intern_mobile_number;
}

public String getIntern_e_mail() {
	return intern_e_mail;
}

public void setIntern_e_mail(String intern_e_mail) {
	this.intern_e_mail = intern_e_mail;
}

public String getGroup_id() {
	return group_id;
}

public void setGroup_id(String group_id) {
	this.group_id = group_id;
}

public String getProject_name() {
	return project_name;
}

public void setProject_name(String project_name) {
	this.project_name = project_name;
}


   
public String execute() throws Exception{  
		try{
			Connection con;
			PreparedStatement pst;
			ResultSet rs;
			con=MyConnection.getConnection();
				pst=con.prepareStatement("insert into sp_intern values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, intern_id);
				pst.setString(2, batch_id);
				pst.setString(3, intern_username);
				pst.setString(4, intern_password);
				pst.setString(5, intern_re_enter_password);
				pst.setString(6, intern_first_name);
				pst.setString(7, intern_last_name);
				pst.setString(8, intern_middle_name);
				pst.setString(9, intern_address);
				pst.setString(10, birth_date);
				pst.setString(11, join_date);
				pst.setString(12, intern_mobile_number);
				pst.setString(13, intern_e_mail);
				pst.setString(14, group_id);
				pst.setString(15, project_name);
				pst.execute();
				System.out.println("value inserted");
			}catch(SQLException e){
				e.printStackTrace();
			}
		return SUCCESS; 
	 }
//public String view4() throws Exception{
//		try{
//			Connection con;
//			PreparedStatement ps;
//			con=MyConnection.getConnection();
//			PreparedStatement pst=con.prepareStatement("select * from sp_intern");
//		    ResultSet rs=pst.executeQuery();
//				while(rs.next())
//				{
//					Intern I1=new Intern();
//					I1.setIntern_id(rs.getString(1));
//					I1.setBatch_id(rs.getString(2));
//					I1.setIntern_username(rs.getString(3));
//					I1.setIntern_password(rs.getString(4));
//					
//					I1.setIntern_first_name(rs.getString(6));
//					I1.setIntern_middle_name(rs.getString(7));
//					I1.setIntern_last_name(rs.getString(8));
//					I1.setIntern_address(rs.getString(9));
//					I1.setBirth_date(rs.getString(10));
//					I1.setJoin_date(rs.getString(11));
//					I1.setIntern_mobile_number(rs.getString(12));
//					I1.setIntern_e_mail(rs.getString(13));
//					I1.setGroup_id(rs.getString(14));
//					I1.setProject_name(rs.getString(15));
//				    list3.add(I1);
//				    System.out.println("view data");
//		        }
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//			return SUCCESS;
//	    }
}