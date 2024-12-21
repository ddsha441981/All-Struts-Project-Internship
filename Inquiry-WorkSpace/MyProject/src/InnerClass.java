
public class InnerClass { //This is my Outer Class
	
	private int a=200;

	public class InnClass{ // This is my inner class
		
		void msg(){
			System.out.println("A is "+a);
		}
	}
public static void main(String[] args) {
	InnerClass in = new InnerClass();
	InnerClass.InnClass inn =in.new InnClass();
	inn.msg();
	
}
}

