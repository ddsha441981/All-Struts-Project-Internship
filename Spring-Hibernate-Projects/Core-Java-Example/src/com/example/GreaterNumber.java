package com.example;

public class GreaterNumber {

	public int  display(){
		int a =50;
		int b =20;
		
		if(a>b){
			
			System.out.println(a);
			return a;
		}
		else{
			System.out.println(b);
			return b;	
		}
		
	}
	public static void main(String[] args) {
		
		GreaterNumber number = new GreaterNumber();
		number.display();
		
	}
}
