package com.login.page;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logindata extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Login obj1;
	Map<String, String> data;
	public Login getObj() {
		return obj1;
	}

	public void setObj1(Login obj1) {
		this.obj1 = obj1;
	}
	
	@Override
	public void setSession(Map k1) {
	
		data=k1;
	}
	@Override
	public String execute() throws Exception {
		
		int u= DAO.fireQuery(obj1);
		if(u>0)
		{
		//data.put("Username", obj1.user);
		System.out.println("In Method");
		
		return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	

	
	
}
