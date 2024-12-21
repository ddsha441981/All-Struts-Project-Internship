package org.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Deendayal Kumawat
 * @since 14 march 2017
 * @version 1.2.5
 */
@Entity
@Table(name="employeescontents")
public class EmployeeModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "empId")
	private int empId;
	@Column(name = "employeeName")
	private String empName;
	@Column(name = "employeeSalary")
	private double empsalary;
	@Column(name = "employeeAge")
	private int empAge;
	@Column(name = "employeeAddress")
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
	@Override
	public String toString() {
		return "Employeebeans [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + ", empAge="
				+ empAge + ", empAdd=" + empAdd + "]";
	}
}
