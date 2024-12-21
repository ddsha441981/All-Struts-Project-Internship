package com.Inheritance.Examples;

class MyFirstExample {
	int id;
	String name;
	int age;
	
	public MyFirstExample(int id , String n , int age){
		this.id = id;
		this.name = n;
		this.age = age;
		
	}
	public void display(){
		System.out.println("This is a Parent Class");
	}
	

}
class B extends MyFirstExample{

	
	public B(int id, String n, int age) {
		super(id, n, age);
		
	}

	public void display(){
		System.out.println("This is Child Class");
	}
	
	public static void main(String[] args) {
		MyFirstExample MFE = new MyFirstExample(123,"Deendayal", 23);
		MFE.display();
		B b = new B(1,"hello",22);
		b.display();
	}
}

	
	
	
