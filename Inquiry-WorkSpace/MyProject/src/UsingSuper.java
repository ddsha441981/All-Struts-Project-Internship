public class UsingSuper {

	int empId;
	String empN;
	double salary;

	UsingSuper() {
		System.out.println("Without parameter constructor class UsingSuper");
	}

	UsingSuper(int id, String en, double sal) {
		empId = id;
		empN = en;
		salary = sal;
		System.out.println("Construtor is parameterised"+ "  " + empId+ "  " + empN+ "  "+ salary);
	}

}

class UseSuper extends UsingSuper {
	double commission = 0.15;

	UseSuper() {
		System.out.println("Without parameter constructor class UseSuper");
	}

	UseSuper(int id, String en, double sal, double c) {

		// super();
		super(id, en, sal);
		commission = c;
	}
	public String toString(){
		return "Commision"+commission; 
	}

	public static void main(String[] args) {
		UsingSuper u1 = new UsingSuper(101, "Deendayal", 6000);
		UseSuper u2 = new UseSuper();
		System.out.println(u2);
	}
}
