package com.random.Number;

public class GeneratedOTP {

	public static String generateOTP(){
		
		int randomPin = (int) ((Math.random()*9000)+1000);
		
		String otp = String.valueOf(randomPin); 
		return otp;
	}
	
	public static void main(String[] args) {
		
		String optString = generateOTP();
		System.out.println("OTP :  "+ optString);
		
	}
}
