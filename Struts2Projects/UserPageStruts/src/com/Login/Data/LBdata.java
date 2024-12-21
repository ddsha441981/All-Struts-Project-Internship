package com.Login.Data;

import com.opensymphony.xwork2.ActionSupport;

public class LBdata extends ActionSupport {

	Ldata d1 = new Ldata();

	public Ldata getD1() {
		return d1;
	}

	public void setD1(Ldata d1) {
		this.d1 = d1;
	}
	
	@Override
	public void validate() {
		
		if(d1.user.isEmpty() && d1.user.length()==0)
		{
			addFieldError("d1.user", "User Name Madantory");
		}

		if(d1.pwd.isEmpty() && d1.pwd.length()==0)
		{
			addFieldError("d1.pwd", "Password  Madantory");
		}
	}
	
	@Override
	public String execute() throws Exception {
		if(d1.user.equalsIgnoreCase("admin") && d1.pwd.equalsIgnoreCase("abc"))
		{
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
		
		
	}
}
