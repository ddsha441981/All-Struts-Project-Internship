package com.data.Login;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class Ldata extends ActionSupport  {
String user;
String pwd;
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

@Override
	public void validate() 
{
		
		
		if(user.isEmpty() && user.length()==0)
		{
			addFieldError("user", " User Name Mandatory");
		}
		if(pwd.isEmpty() && pwd.length()==0)
		{
			addFieldError("pwd", " Password Mandatory");
		}
		/*if(user.length()<=5 && pwd.length()<=5)
		{
			addActionMessage("Try Again.......");
		}*/
}
public String execute() 
{
	int st = Database.mydatabase(this);
	//if(st>1)//data insert
	
	System.out.println(st);
	
	return SUCCESS;
	
	
	
}
}
