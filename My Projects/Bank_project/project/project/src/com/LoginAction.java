 package com;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware,ServletRequestAware
{
	
	private static final long serialVersionUID = 1L;
	
	private String uname;
	private String upass;
	@SuppressWarnings("rawtypes")
	Map map;
	HttpServletRequest req;
	HttpSession session;
	
	
	public String getUname() 
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	public String getUpass() 
	{
		return upass;
	}
	public void setUpass(String upass) 
	{
		this.upass = upass;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public String execute() throws SQLException
	{
		System.out.println("In Execute");
		
		String type=Logincon.db(this);
		String status=Logincon.db(this);
		if(status==null)
		{
			return INPUT;
		}
		
		else
		{
			req.setAttribute("hii", uname);
			 
			map.put("HomePage","true");
			map.put("uname",uname);
			map.put("upass",upass);
			
			return type;
		}
			
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
