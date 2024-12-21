 class Manager extends EmployeeData {
	 double eTime;
	 
	 Manager(String eId,String eN,double sal,double e){
		 
		 super(eId,eN,sal);
		 eTime=e;
	 }
	public String toString(){
		return  "Manager Id"+empId+ " Manager Name " +empN+ " Salary " + salary + " Extra Time "+ eTime;
	}
}
