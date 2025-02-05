package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class FeedbackAction extends ActionSupport implements SessionAware,ServletRequestAware
{
	private String uname1;
	private String email1;
	private String contact1;
	private String message1;
	Map map;
	HttpServletRequest req;
	HttpSession session;
	public String getUname1() {
		return uname1;
	}
	public void setUname1(String uname1) {
		this.uname1 = uname1;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getContact1() {
		return contact1;
	}
	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public HttpServletRequest getReq() {
		return req;
	}
	public void setReq(HttpServletRequest req) {
		this.req = req;
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	public static int db(FeedbackAction a) throws ClassNotFoundException, SQLException 
	{
		int status=0;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11","java","java");
		PreparedStatement ps=conn.prepareStatement("insert into feedback1 values(?,?,?,?)");
		System.out.println(conn);
		ps.setString(1,a.getUname1());
		ps.setString(2,a.getEmail1());
		ps.setString(3,a.getContact1());
		ps.setString(4,a.getMessage1());
				
		status=ps.executeUpdate();
		System.out.println(status);
	
		return status;
	}
	
	
	
	
	public String execute() throws Exception 
	{
		int i=db(this);
		if(i>0)
		{
			return SUCCESS;
		}
		return INPUT;
		
		
		
	}
	@Override
	public void setSession(@SuppressWarnings("rawtypes") Map arg0) {
		map=arg0;
		
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		
		req=arg0;
	}
	
	
}
