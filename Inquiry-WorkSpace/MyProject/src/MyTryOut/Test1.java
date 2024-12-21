package MyTryOut;

public class Test1 {
	public static void main(String[] args) {
		/*
		//Scenario 1
		
		Inherit1 hi = new Inherit1();
		System.out.println(hi.a);
		System.out.println(hi.b);
		//System.out.println(hi.c);because m3 is not part of class Inherit1
		
		hi.m1();
		hi.m2();
		//hi.m3();because m3 is not part of class Inherit1
*/	

	/*//Scenario 2
	
	Inheritance2 he = new Inheritance2();
	System.out.println(he.a);
	System.out.println(he.b);
	System.out.println(he.c);
	he.m1();
	he.m2();
	he.m3();*/
		
		//Scenario 3
		
		/*Inherit1 he = new Inheritance2();//problem
		System.out.println(he.a);//10
		System.out.println(he.b);//20 //this b variable  is class of Inherit1 
		//System.out.println(he.c);
		he.m1();//class Inheriti1 method call
		he.m2();//class Inheritance2 method call//this method call of class 2(inheritance2) because same method 
	//	he.m3();*/
	
		//Scenario 4
		/*Inheritance2 he = new Inherit1();//error because Superclass cannot assign subclass data but subclass class can be accessed superclass 
		System.out.println(he.a);
		System.out.println(he.b);
		System.out.println(he.c);
		he.m1();
		he.m2();*/
		
	}
}
