package com.intercepters.methods;

import com.opensymphony.xwork2.ActionSupport;

public class MyLoginpage extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	public String execute() throws Exception {
		if(user.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("abc"))
		{
		return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
	
}
