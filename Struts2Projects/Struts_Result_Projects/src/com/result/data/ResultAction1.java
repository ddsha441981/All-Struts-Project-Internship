package com.result.data;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

public class ResultAction1 implements Action,ServletRequestAware {

	HttpServletRequest request;
	String massage;

	@Override
	public void setServletRequest(HttpServletRequest b1) {
		request=b1;
		
	}


	public String getMassage() {
		return massage;
	}


	public void setMassage(String massage) {
		this.massage = massage;
	}


	@Override
	public String execute() throws Exception {
		request.setAttribute("name", "Hello user");
		setMassage("Hello");
		return SUCCESS;
	}
	
	

}
