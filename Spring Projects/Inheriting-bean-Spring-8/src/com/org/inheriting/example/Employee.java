package com.org.inheriting.example;
/**@author Deendayal*/
public class Employee {

	/**@param instance varriable*/
	private int eid;
	private String eName;
	private Address address; /**@param here address is referance of Address class*/
	
	public Employee(){
		System.out.println("Default Construtor");
	}
	
	
	public Employee(int eid, String eName, Address address){
		super();
		System.out.println("Parameter Constructor");
		this.eid = eid;
		this.eName = eName;
		this.address = address;
	}
	
	public Employee(int eid, String eName){
		super();
		System.out.println("Parameter Constructor");
		this.eid = eid;
		this.eName = eName;
	}
	
	public void show(){
		System.out.println(eid + "," + eName);
		System.out.println(eid + "," + eName + "," + address);
		
	}
	
}
