
 class Programmer extends EmployeeData {
	 
	 double perhour;
	 Programmer(String eId,String eN,double sal,double prh){
		 
		 super(eId,eN,sal);
		 perhour=prh;
	 }
	 public String toString(){
		 return "Programmer Id"+empId+ " Programmer Name " +empN+ " Salary " + salary + " perhour  "+ perhour;
		}

}
