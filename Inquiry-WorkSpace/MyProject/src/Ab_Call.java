
abstract class Ab_Call {
	abstract void callme();//method is abstract we can't create any object
	
	void callmetoo(){
		System.out.println("This is Concrete Method");
	}

}
class B extends Ab_Call{
	
	void callme(){
		System.out.println("B is implements of A");
	}
}
class AbstractDemo extends Ab_Call{
	
	public static void main(String[] args) {
		Ab_Call b1 = new B();
		b1.callme();
		b1.callmetoo();
	}

	@Override
	void callme() {
		// TODO Auto-generated method stub
		
	}
}
