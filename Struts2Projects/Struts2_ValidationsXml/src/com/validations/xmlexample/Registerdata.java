package com.validations.xmlexample;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Registerdata extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String empid;
	String pwd;
	String cpwd;
	String ename;
	String email;
	Date dob;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String execute() throws Exception {
	
		return SUCCESS;
	}
}
