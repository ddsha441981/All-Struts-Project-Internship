package com.Example;

import java.util.HashSet;

class Employees {

	private int emp_id;
	private String emp_name;
	private int age;
	
	

	public Employees(int emp_id,String emp_name, int age) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [emp_id=" + emp_id + ", emp_name=" + emp_name + ", age=" + age + "]";
	}
	
	
}
