package com.multiOverview;

public class OverridingStartMethodTest {

	public static void main(String[] args) {
		
		OverloadingRunMethod t6 = new OverloadingRunMethod();
		t6.start();												//main method treat here just like normal method
		System.out.println("Main Thread");
	}
}
