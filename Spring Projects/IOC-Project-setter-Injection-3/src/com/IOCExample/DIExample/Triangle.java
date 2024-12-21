package com.IOCExample.DIExample;

public class Triangle {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {  //setter Injection
		this.type = type;
	}

	public void draw(){
		System.out.println(getType()+ " Drawing Triangle");
	}

}
