package com.practice;

public class CurrentDirectory {

	public static void main(String[] args) {
		
		String str = System.getProperty("user.dir");
		System.out.println("Working Directory is " +str);
	}
}
