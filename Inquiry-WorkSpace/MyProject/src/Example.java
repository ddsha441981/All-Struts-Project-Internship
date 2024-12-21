
class Greeting {

	public void sayHello(){
		System.out.println("Hello");
	}
}
class India {
	Greeting g = new Greeting(){//this is Anonmynous class
		public void sayHello(){
			System.out.println("Namste");//method overridding
		}
	};
}
public class Example{
	
	public static void main(String[] args) {
		India i = new India();
		i.g.sayHello();
	}
}
