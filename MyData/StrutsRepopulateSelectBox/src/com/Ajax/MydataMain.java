package com.Ajax;

public class MydataMain {
String name;
String fname;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

public String adddata(){
	System.out.println("here my data is "+fname);
	
	return "success";
	
	
}
}
