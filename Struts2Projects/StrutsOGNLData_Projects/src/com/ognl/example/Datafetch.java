package com.ognl.example;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Datafetch extends ActionSupport implements SessionAware {

	Beansdata bdata;
	Map my;
	public Beansdata getBdata() {
		return bdata;
	}

	public void setBdata(Beansdata bdata) {
		this.bdata = bdata;
	}
	
	@Override
	public void setSession(Map map) {
		
		my=map;
	
		
	}

	public String execute() throws Exception {
		my.put("username", bdata.user);
		my.put("password", bdata.pwd);
		return SUCCESS;
	}
	
}
