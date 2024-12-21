package com.methodOverloading;

public class FirstClass {

	int a;
	int b;
	int c;
	int total;
	double x;
	double y;
	double z;
	double div;
	
	void sum(int a , int b ,int c){
		System.out.println("A is "+a);
		System.out.println("A is "+b);
		System.out.println("A is "+c);
		total = a+ b + c;
		System.out.println("Sum is "+total);
		
	}
	
	void sum(double x , double y ,double z){
		System.out.println("x is "+a);
		System.out.println("y is "+b);
		System.out.println("z is "+c);
		div = x+ y + z;
		System.out.println("Sum is "+div);
		
	}
	public static void main(String[] args) {
		FirstClass f = new FirstClass();
		f.sum(10.8, 20.2, 15.2);
		f.sum(2, 4, 6);
	}
}
