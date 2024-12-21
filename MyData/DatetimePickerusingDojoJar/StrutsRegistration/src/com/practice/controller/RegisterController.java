package com.practice.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class RegisterController {
	private String name;
	private String contact;
	private String email;
	private String password;
	private Date doj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	public String save(){
		System.out.println("Name : "+name);
		System.out.println("Contact : "+contact);
		System.out.println("Email : "+email);
		System.out.println("Password : "+password);
		System.out.println("Date Of  Join : "+doj);
		int status=0;
		try{  
			   Class.forName("oracle.jdbc.driver.OracleDriver");  
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@SHARESRV.YASHODHAN.SEEDINFOTECH:1521:orcl","spic","spic");  
			     
			   PreparedStatement ps=con.prepareStatement("insert into reg1 values(?,?,?,?,?)");  
			   
			   ps.setString(1,name);  
			   ps.setString(2,email);
			   ps.setString(3,contact);
			   ps.setString(4,password);
			   ps.setDate(5,new java.sql.Date(doj.getTime()));
			   
			   status =ps.executeUpdate();  
			   System.out.println("Number of row inserted : "+status); 
			   con.close();
			  }
			  catch(Exception e)
			  {e.printStackTrace();}  
		
		return "success";
	}
}
