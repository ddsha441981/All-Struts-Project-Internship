package com.expcaptions.throwNthorws;

public class ThrowExample {

	public static void main(String[] args) {
		
		int age = Integer.parseInt("40");
		if(age > 60){
			
			throw new TooYoungExcaption("Too young man ");
		}
		else if(age < 18){
			
			throw new YoungExcaption("Yes cann't marry");
		}
		else{
			
			System.out.println("you will get match information we will contact you by using mail");
		}
	}
}
