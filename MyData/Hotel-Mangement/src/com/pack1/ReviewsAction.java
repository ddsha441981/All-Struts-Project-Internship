package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReviewsAction extends ActionSupport  implements EstablishedConnection/*,SessionAware*/{
	 static Connection con;
	
/*		
	 Map m;
String fulName,email,comments;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

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
}*/
	 
	 ArrayList<Rew> list = new ArrayList<Rew>();	 
public ArrayList<Rew> getList() {
		return list;
	}


	public void setList(ArrayList<Rew> list) {
		this.list = list;
	}


public String execute()

{
	 Statement stmt;
	try
{
		
	stmt=con.createStatement();
	String sql="select fulname,email,comments from feedback";
	 ResultSet rs=stmt.executeQuery(sql);
	//ArrayList<ReviewsAction> veiw = new ArrayList<ReviewsAction>();
	while(rs.next())
	{/*	
		ReviewsAction hello = new ReviewsAction();
		hello.fulName=rs.getString(1);
		hello.email=rs.getString(2);
		hello.comments=rs.getString(3);
		veiw.add(hello);*/
/*888888888888888888888888888888888888888888888888888888888888888888888*/	
		Rew hello = new Rew();
		hello.setFulname(rs.getString(1));
		hello.setEmail(rs.getString(2));
		hello.setComments(rs.getString(3));
		list.add(hello);
		System.out.println("Hello Deendayal"+rs.getString(1));
/*888888888888888888888888888888888888888888888888888888888888888888888*/	
	/*String s=rs.getString(1);
      setFulName(s);
	System.out.println(rs.getString("fulname"));
	
	String s1=rs.getString(2);
	setComments(s1);
	System.out.println(rs.getString("comments"));*/
/*888888888888888888888888888888888888888888888888888888888888888888888*/	
   }
}
catch(Exception e)
{
	e.printStackTrace();
}
return SUCCESS;
}
	
	/*
	public void setSession(Map m1) {
		this.m=m1;
		
	}*/

	public void setConnection(Connection con) {
		this.con=con;
		
	}
}
	
