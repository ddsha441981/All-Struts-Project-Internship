package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Updateinform extends ActionSupport implements SessionAware
{
	
	private String uname;
	private String mono;
	private String email;
	Map m;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String db()
	{
		String user=getUname();
		String mono =getMono();
		String email =getEmail();
		System.out.println("user"+user);
		System.out.println(mono);
		System.out.println(email);
		String user1 = (String) m.get("uname");
			
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11", "java",
					"java");
			String qeury1 = "Update reg set uname='" +user+ "',mono='"+mono+"',email='"+email+"' where uname='"
					+ user1 + "' ";
			Statement stmt1 = conn.createStatement();
			System.out.println(stmt1.executeUpdate(qeury1));
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return SUCCESS;
	}
	
	@Override
	public String execute(){
		String result=db();
			return result;
		
	}
	
	@Override
	public void setSession(Map arg0) {
		m=arg0;
	}

}
