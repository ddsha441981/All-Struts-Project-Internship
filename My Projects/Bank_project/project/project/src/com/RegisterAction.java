package com;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport implements SessionAware
{
	private String id;
	private String uname;
	private String pass;
	private String cpass;
	private String mono;
	private String email;
	private String category;
	Map m;
	
	
	
	public String getId() 
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass()
	{
		return pass;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public String getCpass() 
	{
		return cpass;
	}

	public void setCpass(String cpass)
	{
		this.cpass = cpass;
	}

	public String getMono()
	{
		return mono;
	}

	public void setMono(String mono) 
	{
		this.mono = mono;
	}

	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	
	public String getCategory() 
	{
		return category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	@Override
	public String execute() throws Exception 
	{
		int i=Registercon.db(this);
		if(i>0)
		{
			return category;
		}
		return INPUT;
		
	}

	@Override
	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		m=arg0;
	}

	
	
}




