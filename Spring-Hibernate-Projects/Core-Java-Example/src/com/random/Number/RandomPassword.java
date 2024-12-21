package com.random.Number;

import java.util.Random;

public class RandomPassword {

	

	public static void main(String[] args) {
		
		int length = 10;
		System.out.println(geek_password(length));
	}
	
	static char[] geek_password(int len){
		System.out.println("Generating password using random() : " );
		System.out.println("Your New Password is " );
		
		String capital_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_letter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols ="!@#$%^&*_=+-/.?<>";
		String values = capital_letter + small_letter + numbers + symbols;
		
		Random random = new Random();
		
		char[] password = new char[len];
		
		for (int i = 0; i < len; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
			
		}
		return password;
		
	}
	
}
