package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class FeedBachAction extends ActionSupport implements EstablishedConnection {

	String fulName,email,comments;
	Connection con;
	public String getFulName() {
		return fulName;
	}

	public void setFulName(String fulName) {
		this.fulName = fulName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
 
	public String execute()
	{
	 
		PreparedStatement pst;
		try
		{
			
		System.out.println("Hello in try block");
		pst=con.prepareStatement("insert into feedback values(?,?,?)");
		pst.setString(1,fulName);
		pst.setString(2,email);
		pst.setString(3,comments);
		
		int res=pst.executeUpdate();
		pst.clearParameters();
		System.out.println("user registered:"+res);
		System.out.println("inserted successfully to the database");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	@Override
	public void setConnection(Connection con) {
this.con=con;

	}

}
