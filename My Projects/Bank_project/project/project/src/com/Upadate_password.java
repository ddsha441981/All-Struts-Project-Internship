package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Upadate_password extends ActionSupport implements SessionAware
{

	
	private String upass;
	private String conpass;
	private String chpass;
	Map m;
	Map req;
	String type="error";
	
	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String getConpass() {
		return conpass;
	}

	public void setConpass(String conpass) {
		this.conpass = conpass;
	}

	public String getChpass() {
		return chpass;
	}

	public void setChpass(String chpass) {
		this.chpass = chpass;
	}

	public String db() throws ClassNotFoundException, SQLException {

		System.out.println("In Execute");
		String user = (String) m.get("uname");
		System.out.println("In Execute1");
		String pass = (String) m.get("upass");
		System.out.println("In Execute2");
		System.out.println("current" +pass);
		System.out.println("In Execute4");
		System.out.println("current" +user);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11", "java",
				"java");

		
		String pass1 = getConpass();
		System.out.println(pass1);
		String qeury1 = "Update reg set pass='" + pass1 + "' where uname='"
				+ user + "' ";
		Statement stmt1 = conn.createStatement();
		System.out.println(stmt1.executeUpdate(qeury1));
		String qeury2 = "Update reg set cpass='" + pass1 + "' where uname='"
				+ user + "' ";
		Statement stmt2 = conn.createStatement();
		System.out.println(stmt2.executeUpdate(qeury2));
		
		System.out.println("break");
		

		PreparedStatement ps=conn.prepareStatement("select category from reg where uname='"+user+"'");
		System.out.println("after conn");
		ResultSet rs=ps.executeQuery();
		System.out.println("user"+user);
		while(rs.next())
		{
			
			System.out.print("pass");
			type=rs.getString("category");
			System.out.print("password change"+type);
		}
		return type;
		
	}

	@Override
	public String execute() throws Exception
	{
		String result=db();
		return result;
	}

	@Override
	public void setSession(Map arg0) {
		m=arg0;
		
	}

	
}