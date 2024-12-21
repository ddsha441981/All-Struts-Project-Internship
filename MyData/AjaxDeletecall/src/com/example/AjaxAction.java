package com.example;
public class AjaxAction  {

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String execute(){
		
		System.out.println("this is my name");
		return "success";
	}
}
