package com.hospital;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.Action;



public class WelcomeToRe implements Action,ServletRequestAware {
	HttpServletRequest req;
	String msg;
	public void setServletRequest(HttpServletRequest arg0) {
		arg0 =req;
		
	}
	
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String execute() throws Exception {
		req.setAttribute("Welcome", "to you");
		setMsg("Hiiiiiiii........");
		return SUCCESS;
	}
	
	
}
