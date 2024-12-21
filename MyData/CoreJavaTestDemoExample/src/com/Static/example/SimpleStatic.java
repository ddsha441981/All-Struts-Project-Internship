package com.Static.example;

class Test {
	private int a=120;;//instance data memeber
	static int  b;//this is static data memmber
	
	public void display(){//instance method
		
		System.out.println("This is value is" +a);
	}
	public static void displaystatic(){//static method
		int b=145;
		System.out.println("This value is"+b);
	}
	
static class B{//This is inner static class
	public static String country ="I love My Country";
}
	/*public static void main(String[] args) {
		SimpleStatic ss = new SimpleStatic();
		ss.display();
		//SimpleStatic.b=100;
		//SimpleStatic.displaystatic();
		System.out.println(SimpleStatic.B.country);
		
	}*/
}
public class SimpleStatic{
	public static void main(String[] args) {
		Test s1 = new Test();
		s1.display();
		System.out.println(Test.B.country);
		Test.displaystatic();
	}
	
}