package org.spring.utility;

public class GeneratedOTP {
	
public static String generateOTP(){
		
		int randomPin = (int) ((Math.random()*9000)+1000);
		
		String otp = String.valueOf(randomPin); 
		return otp;
	}
}
