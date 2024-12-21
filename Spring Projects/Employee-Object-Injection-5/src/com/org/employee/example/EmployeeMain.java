package com.org.employee.example;

/**
 * @author Deendayal Kumawat
 */

public class EmployeeMain {

	/**
	 * @param create
	 *        instance level Object of another classes
	 */

	private EmployeeCommon Empcommon;
	private EmployeeBasic EmpBasic;
	private EmployeeDepartment EmpDepart;

	/**
	 * @param create
	 *        Getter and Setter to get and set object of EmployeeCommon
	 */

	public EmployeeCommon getEmpcommon() {
		return Empcommon;
	}

	public void setEmpcommon(EmployeeCommon empcommon) {
		Empcommon = empcommon;
	}

	/**
	 * @param create
	 *  	  Getter and Setter to get and set object of EmployeeBasic
	 */
	public EmployeeBasic getEmpBasic() {
		return EmpBasic;
	}

	public void setEmpBasic(EmployeeBasic empBasic) {
		EmpBasic = empBasic;
	}

	/**
	 * @param create
	 *         Getter and Setter to get and set object of EmployeeDepartment
	 */
	public EmployeeDepartment getEmpDepart() {
		return EmpDepart;
	}

	public void setEmpDepart(EmployeeDepartment empDepart) {
		EmpDepart = empDepart;
	}

	public void displayemployeeDetails() {
		
		System.out.println("Employee Details:- \n\n\t\t" + "Employee Id (" + getEmpcommon().getEmpId() + "),\t\t"
				+ "Employee Name (" + getEmpcommon().getEmpName() + "),\t\t" + "Employee Gender ("
				+ getEmpcommon().getEmpGender() + ")\n");
		
		System.out.println("Employee Basic Details:- \n\n\t\t" + "Employee Age (" + getEmpBasic().getEmpAge() + "),\t\t"
				+ "Employee Address (" + getEmpBasic().getEmpAdd() + "),\t\t" + "Employee Phone ("
				+ getEmpBasic().getPhone() + "),\t\t" + "Basic Salary (" + getEmpBasic().getEmpSal() + "),\t\t"
				+ "Education (" + getEmpBasic().getEmpEdu() + "),\t\t" + "Experiance ("
				+ getEmpBasic().getEmpExperience() + ")\n");
		
		System.out.println("Employess Department:- \n\n\t\t" + "Dpartment Id (" + getEmpDepart().getDepId() + "),\t\t"
				+ "Employee Dpartment (" + getEmpDepart().getEmpDepartment() + ")");
	}
}
