package org.spring.hibernate.spring.examples;

/**
 * @author Deendayal
 * @Since 2017
 * @Version 1.1.2
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Employee.
 */
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "empId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;

	@Column(name = "name")
	private String name;

	@Column(name = "salary")
	private float salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
