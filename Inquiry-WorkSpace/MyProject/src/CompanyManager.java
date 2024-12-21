 class CompanyManager extends CompanyEmployee implements Company, Sologn,Massage {
	String owner = "Cabgimini";

	CompanyManager(String eId, String eN, double sal, String tech,String own) {
		
		super(eId, eN,  sal,tech);
		owner=own;
				
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
	return "Mangaer Id" + empId + "Manager Name " + empN + "Salary"
	+ salary + "Owner"+owner;
}

}
