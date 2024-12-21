package com.example;

class TooYoungExcaption extends ArithmeticException{
	
	public TooYoungExcaption(String s) {
		
		super(s);
	}
	
	class TooOldExcaption extends RuntimeException{
		
		public TooOldExcaption(String s) {
		
			super(s);
		}
	}
	
}
public class CustomizedExcaption {

	public static void main(String[] args) {
		
		//int age = Integer.parseInt(args[18]);
		int age = 70;
		if(age>60){
			
			throw new TooYoungExcaption("Wait Some More Time for next birth ");
		}
		else if(age<18){
			throw new TooYoungExcaption("No change to getting Marriage Sorry");
		}
		else{
			System.out.println("you get match soon and details send by email");
		}
	}
	
}
