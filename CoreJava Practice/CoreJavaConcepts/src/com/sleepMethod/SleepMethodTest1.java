package com.sleepMethod;

public class SleepMethodTest1 {

	public static void main(String[] args) {
		
		SleepMethodDemo1 sp = new SleepMethodDemo1();
		sp.start();
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Main Thread");
			
		}
		
	}
}

