 package com.result.data;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;

public class ResultAction2 implements Action,ServletRequestAware {

	HttpServletRequest request;
	
	@Override
	public void setServletRequest(HttpServletRequest c1) {
		// TODO Auto-generated method stub
		request=c1;
		
	}

	@Override
	public String execute() throws Exception {
		request.setAttribute("company", "Capgimini");
		return SUCCESS;
	}

	
	
}
