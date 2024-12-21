 class Employee implements Printable {
	int id;
	String name;
	double salary;

	Employee(int i,String n,double sal){
		id=i;
		name=n;
		salary=sal;
	}
	public void print(){
		System.out.println("Id = "+id+ "Name = "+name+ " Salary = " +salary);
	}
}
