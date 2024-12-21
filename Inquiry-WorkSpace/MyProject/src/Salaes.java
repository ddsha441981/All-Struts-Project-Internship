
class Salaes extends EmployeeData {
	double commission;
	
	 Salaes(String eId,String eN,double sal,double com){
		
		super(eId,eN,sal);
		commission=com;
	}
	 public String toString (){
		return "Sales Id"+empId+ " Sales Name " +empN+ " Salary " + salary + " Commission  "+ commission;
		}

}
