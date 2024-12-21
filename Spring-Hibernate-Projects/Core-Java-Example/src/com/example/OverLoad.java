package com.example;

public class OverLoad {

	/*int a = 20;
	int b = 10;
	int c = 5;*/
	
	public static void display(int a,int b){
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void display(int a,int b,int c){
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		//OverLoad over = new OverLoad();
		//over.display();
		OverLoad.display(11, 20, 20);
	}

}
