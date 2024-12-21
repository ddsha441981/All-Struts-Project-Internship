
public class Contract {

	public static void main(String[] args) {
		
		Printable obj = new Date(31,05,2016);
		obj.print();
		obj = new Employee(101,"Deendayal",80000);
		obj.print();
		obj = new Rectangle_find(50,25);
		obj.print();
	}
}
