package com.org.simple.dataof.employee;

import java.util.List;
import java.util.Map;

/**@author Deendayal*/
public class Employee {

	private int eId;
	private String eName;
	private Address address;
	private List<Leave> leave;
	private Map<Integer, String> task;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Leave> getLeave() {
		return leave;
	}
	public void setLeave(List<Leave> leave) {
		this.leave = leave;
	}
	public Map<Integer, String> getTask() {
		return task;
	}
	public void setTask(Map<Integer, String> task) {
		this.task = task;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [task=" + task + "]";
	}
	public void display(){
		System.out.println("Hello");
		System.out.println(geteId()+ ","+geteName());
		System.out.println(address.toString());
		
		for (Leave leave2 : leave) {
			System.out.println(leave2.toString());
		}
		
		System.out.println(getTask());
	}
	
	
}
