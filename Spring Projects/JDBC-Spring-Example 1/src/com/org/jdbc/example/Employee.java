package com.org.jdbc.example;
/**@author Deendayal*/
public class Employee {
	/**@param JDBC Example In Spring*/

	private int eId;
	private String eName;
	private float salary;
	
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	
	public Employee(int eId, String eName, float salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}


	/**@param Getter and Setter*/
	
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
}
