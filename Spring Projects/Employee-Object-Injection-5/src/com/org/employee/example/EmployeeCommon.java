package com.org.employee.example;

/**
 * @author Deendayal Kumawat
 */
public class EmployeeCommon {

	/**
	 * @param instance variable
	 */
	private int  empId;
	private String empName;
	private String empGender;
	
	/**
	 * @param Getter and Setter to set and get values of EmpId 
	 */
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	/**
	 * @param Getter and Setter to set and get values of EmpName 
	 */
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/**
	 * @param Getter and Setter to set and get values of EmpGender 
	 */
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	
}
