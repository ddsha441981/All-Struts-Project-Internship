package com.crud;

public class Student {

	private int id;
	private String name;
	private String password;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Student(int id, String name, String password, double salary) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.salary = salary;
	}

	
}
