package com.IOCExample.DIExample;

public class Circle {
	private String msg;
	
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {	//setter Injection
		this.msg = msg;
	}


	public void draw() {
		System.out.println(getMsg()+ " Circle is Drawing");
		
	}

}
