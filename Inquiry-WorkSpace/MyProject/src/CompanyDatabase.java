 class CompanyDatabase extends CompanyEmployee implements Company, Sologn,Massage {
	

	 CompanyDatabase(String eId, String eN, double sal, String tech) {
		
		super(eId, eN,  sal,tech);
				
	}
	public void welcome() {
		System.out.println("Wel Come to Cabgimini Software Dovelopment Company");

	}
	public void company_data() {
		System.out.println("Company Name" + company_Name + "Address" + address
				+ "Location" + location + "NoEmployee" + noEmployee
				+ "Technology" /*+ technology*/);
	}
	public String toString(){
	return "Database Id" + empId + "Database Name " + empN + "Salary"
	+ salary;
}
	public void thank() {
		System.out.println("Thank For Joining Our Company");

	}

}
