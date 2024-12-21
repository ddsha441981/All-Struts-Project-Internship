class CompanyEmployee implements Company, Sologn, Massage {

	String empId;
	String empN;
	double salary;
	String technology;

	CompanyEmployee(String eId, String eN, double sal, String tech) {
		empId = eId;
		empN = eN;
		salary = sal;
		technology = tech;
	}

	public void welcome() {
		System.out.println("Wel Come to Cabgimini Software Dovelopment Company");

	}

	public void company_data() {
		System.out.println(" Company Name " + company_Name + " Address " +  address
				+ " Location  " + location + " NoEmployee " +  noEmployee
				+ "  Technology" + technology);
	}

	public String toString() {
		return "Employee Id" + empId + " Employee Name  " + empN + " Salary "
				+ salary + " Technology " + technology;
	}

	public void thank() {
		System.out.println("Thank For Joining Our Company");

	}

}
