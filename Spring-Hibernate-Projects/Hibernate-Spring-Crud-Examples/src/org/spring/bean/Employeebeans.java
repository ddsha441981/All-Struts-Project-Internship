package org.spring.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

/**
 * @author Deendayal Kumawat
 * @since 14 march 2017
 * @version 1.2.5
 */
public class Employeebeans {

	@NotNull
	private int empId;
	@NotEmpty (message = "UserName Not Empty")
	@Size(min = 6, max = 15, message = "Your UserName must between 6 and 15 characters")
	private String empName;
	
	private double empsalary;
	
	private int empAge;

	private String empAdd;

	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	

}
