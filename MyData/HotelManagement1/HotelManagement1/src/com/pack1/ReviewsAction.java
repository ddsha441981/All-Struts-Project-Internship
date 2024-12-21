package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReviewsAction extends ActionSupport  implements EstablishedConnection,SessionAware{
	 static Connection con;
	
		
	 Map m;
String fulName,comments;

public String getFulName() {
	return fulName;
}

public void setFulName(String fulName) {
	this.fulName = fulName;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}
public String execute()

{
	 Statement stmt;
	try
{
		
	stmt=con.createStatement();
	String sql="select Name ,comments from feedback";
	 ResultSet rs=stmt.executeQuery(sql);
	
	while(rs.next())
	{	
	String s=rs.getString(1);
      setFulName(s);
	System.out.println(rs.getString("Name"));
	
	String s1=rs.getString(2);
	setComments(s1);
	System.out.println(rs.getString("comments"));
   }
}
catch(Exception e)
{
	e.printStackTrace();
}
return SUCCESS;
}
	
	
	@Override
	public void setSession(Map m1) {
		this.m=m1;
		
	}

	@Override
	public void setConnection(Connection con) {
		this.con=con;
		
	}
}
	
