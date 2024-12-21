public class EmployeeData {

	String empId;
	String empN;
	double salary;

	EmployeeData(String eId, String eN, double sal) {
		empId = eId;
		empN = eN;
		salary = sal;
	}
	public String toString(){
		return "Employee Id"+empId+ " Employee Name " +empN+ " Salary" + salary;
	}
}
