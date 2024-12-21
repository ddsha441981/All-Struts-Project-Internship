package com.example;

public class Months {

	public static void main(String[] args) {
		
		final int month = 30;
		int number = 99;
		int count = 0;
		int fla;
		int year ;
		
		count = number/month;
		System.out.println(count +"  महीना");
		
		fla = number%month;
		
		System.out.println(fla +"  दिन");
	
		
	}
}
