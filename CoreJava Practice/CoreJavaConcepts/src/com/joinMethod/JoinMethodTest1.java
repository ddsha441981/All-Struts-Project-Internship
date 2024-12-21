package com.joinMethod;

public class JoinMethodTest1 {

	public static void main(String[] args) throws InterruptedException {
		JoinMethodDemo1 j1 = new JoinMethodDemo1();
		j1.start();
		j1.join();
		for (int i = 0; i <10; i++) {
			
			System.out.println("Ramma");
		}
	}
}
