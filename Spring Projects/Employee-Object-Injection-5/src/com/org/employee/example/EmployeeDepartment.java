package com.org.employee.example;
/** @author Deendayal Kumawat
 */
public class EmployeeDepartment {

	/**@param create instance variable
	 */
	
	private int depId;
	private String empDepartment;
	

	/**
	 * @param create Getter and Setter to get and set values of Department Id
	 */
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	
	/**
	 * @param create Getter and Setter to get and set values of Employee Department
	 */
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	
}
