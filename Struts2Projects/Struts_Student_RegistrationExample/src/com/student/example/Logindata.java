package com.student.example;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logindata extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Login h1;
	Map<String, String> my;
	
	public Login getH1() {
		return h1;
	}

	public void setH1(Login h1) {
		this.h1 = h1;
	}
	
	

	@Override
	public void setSession(Map m1) {
		this.my=m1;
		
	}
	
	@Override
	public String execute() throws Exception {
		my.put("username", h1.sname);
		my.put("password", h1.pwd);
		System.out.println("method in");
		return SUCCESS;
	}
}
