package com;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.recompile;

public class Login extends ActionSupport implements SessionAware
{
	Map m;
	private String username;
	private String pass;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String execute() throws Exception 
	{
	if(LoginCon.db(this))
	{
		m.put("login","true");
		m.put("username",username);
		
		return SUCCESS;
		
	}
	return INPUT;
	}
	@Override
	public void setSession(Map arg0) {
		m=arg0;
		
	}
}
