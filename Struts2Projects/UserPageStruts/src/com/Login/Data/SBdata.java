package com.Login.Data;

import com.opensymphony.xwork2.ActionSupport;

public class SBdata extends ActionSupport {

	Sdata d1 = new Sdata();

	public Sdata getD1() {
		return d1;
	}

	public void setD1(Sdata d1) {
		this.d1 = d1;
	}
	@Override
	public void validate() {
		
		if(d1.user.isEmpty() && d1.user.length()==0)
		{
			addFieldError("d1.user", "user Name Mandatory");
		}
		if(d1.pwd.isEmpty() && d1.pwd.length()==0)
		{
			addFieldError("d1.pwd", "Password Mandatory");
		}
		if(d1.cpwd.isEmpty() && d1.cpwd.length()==0)
		{
			addFieldError("d1.cpwd", "Confirm Password Mandatory");
		}
		if(d1.name.isEmpty() && d1.name.length()==0)
		{
			addFieldError("d1.name", " Name Mandatory");
		}
		if(d1.mno.isEmpty() && d1.mno.length()==0)
		{
			addFieldError("d1.mno", "Mobile No Mandatory");
		}
		/*if(d1.dob.isEmpty() && d1.dob.length()==0)
		{
			addFieldError("d1.dob", "Date of Birth Mandatory");
		}*/
		if(d1.pwd ==  d1.cpwd)
		{
			addActionMessage("Password Not Match Found");
		}
	}
	
	@Override
	public String execute() throws Exception 
	{
		
		return SUCCESS;
	}
	
}
