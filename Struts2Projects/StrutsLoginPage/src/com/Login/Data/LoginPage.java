package com.Login.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class LoginPage {

	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String user,pwd,eid;
	String massage;

	public void connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
		Properties p = new Properties();
		p.put("user", "HR");
		p.put("password","password");
		con=DriverManager.getConnection(url,p);
		stmt=con.createStatement();
		System.out.println("Connection Successfully..........");
		
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}
	
	public String execute() throws ClassNotFoundException, SQLException
	{
		String sql ="select * from loginda where name=? and password=?";  
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "username");
		pstmt.setString(2, "password");
		 rs = pstmt.executeQuery();
		 
		
		  
		if(user.equals("ddsa") || eid.equals("kkumawat1111@gmail.com") && pwd.equals("kk")  )
		{
			return "succeess";
		}
		else
		{
			return "failure";
		}
	}
}
