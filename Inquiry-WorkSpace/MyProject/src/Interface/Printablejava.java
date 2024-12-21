package Interface;

public interface Printablejava {
	void print();
}
class Date2 implements Printablejava {
	int day,month,year;
	Date2(int dd,int mm,int yy){
		
		day=dd;
		month=mm;
		year=yy;
	}
	public void print(){
		System.out.println("Date is :"+day+ "/ " +month+ "/"+year);
	}

}
class Employee1 implements Printablejava {
	int id;
	String name;
	double salary;

	Employee1(int i,String n,double sal){
		id=i;
		name=n;
		salary=sal;
	}
	public void print(){
		System.out.println("Id = "+id+ "Name = "+name+ " Salary = " +salary);
	}
}

class Rectangle_find  implements Printablejava{
	 int dim1,dim2;
	 
	 
	 Rectangle_find(int d1,int d2){
		 dim1=d1;
		 dim2=d2;
	 }
	 public void print(){
		 
		 System.out.println("Dimionsions of a Rectangle is   = " +dim1*dim2/2);
	 }
}
 class Contract2 {

	public static void main(String[] args) {
		
		Printablejava obj = new Date2(31,05,2016);
		obj.print();
		obj = new Employee1(101,"Deendayal",80000);
		obj.print();
		obj = new Rectangle_find(50,25);
		obj.print();
	}
}


