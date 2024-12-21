abstract class Hide_Class {

	abstract void data();
}

class Name extends Hide_Class {

	void data() {
		System.out.println("Hi...My Name is Deendayal");
	}
}

class Last extends Hide_Class {

	void data() {
		System.out.println("Hi.....My Last Name is Kumawat");
	}
}

class Address extends Hide_Class {

	void data() {
		System.out.println("My Address is Pune");

	}
}
class Details extends Hide_Class {
	public static void main(String[] args) {
	
		Hide_Class c1 = new Name();
		c1.data();
		Hide_Class c2 = new Last();
		c2.data();
		Hide_Class c3 = new Address();
		c3.data();
	}

	@Override
	void data() {
		// TODO Auto-generated method stub
		
	}
}
