package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.struts2.components.DateTimePicker;
import org.apache.struts2.views.freemarker.tags.DateTimePickerModel;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport
{
	private String user1,pass,cpass,fname,lname,gender,state,city,date1;
	Connection conn;
	PreparedStatement pstmt;
	
	public String getUser1() {
		return user1;
	}
	public void setUser1(String user1) {
		this.user1 = user1;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String execute() throws Exception 
	{
		
		System.out.println("in execute");
		String s = db(); 
		if(s!=null)
		{
		return "success";
		}
		return "input";
	}
	public String db() throws SQLException, ClassNotFoundException 
	{
		conn=Registercon();
		System.out.println("in method");
	
	pstmt=conn.prepareStatement("insert into Register01 values(?,?,?,?,?,?,?,?,?)");

	pstmt.setString(1,user1);
	pstmt.setString(2,pass);

	pstmt.setString(3,cpass);
	pstmt.setString(4,fname);
	pstmt.setString(5,lname);


	pstmt.setString(6,gender);
	
	pstmt.setString(7,date1);
	pstmt.setString(8,state);
	pstmt.setString(9,city);

	System.out.println(pstmt.executeUpdate());
	return "success";
	 
	}
	public Connection Registercon() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@aquarius:1521:Oracle11","java","java");
		System.out.println(conn);
		return conn;
	}
	
}
