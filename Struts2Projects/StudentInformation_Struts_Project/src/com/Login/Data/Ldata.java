package com.Login.Data;

public class Ldata {

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
	
	public String execute()
	{
		if(user.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("123"))
		{
		return "SUCCESS";
		}
		else
		{
			return "error";
		}
	}
}
