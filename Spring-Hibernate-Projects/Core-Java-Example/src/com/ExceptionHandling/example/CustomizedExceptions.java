package com.ExceptionHandling.example;

class TooYoungException extends RuntimeException {


	TooYoungException(String s){
		super(s);
	}
}

class TooOldException extends RuntimeException {


	TooOldException(String s){
		super(s);
	}
}
 public class CustomizedExceptions {

	public static void main(String[] args) {
		
		//int age = Integer.parseInt(args[0]);
		int age = 99;
		if(age > 60){
			
			throw new TooYoungException("Plz wait someMore time you will get best match soon");
		}
		else if(age < 18){
			
			throw new TooOldException("You crossed marriage age ...no change to getting marriage...");
		}
		else{
			System.out.println("You will get match details soon by email...!");
		}
	}
}
