package com.yieldMethod;

public class YieldMethodTest1 {

	public static void main(String[] args) {
		
		YieldMethodDemo1 p1 = new YieldMethodDemo1();
		p1.start();
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Main Thread");
		}
	}
}
//no suitable output because some platform doesn't support