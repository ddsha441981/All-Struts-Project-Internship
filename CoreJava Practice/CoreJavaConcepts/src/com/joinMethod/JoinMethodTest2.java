package com.joinMethod;

public class JoinMethodTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		//JoinMethodDemo2 demo2 =   Thread.currentThread();
		
		JoinMethodDemo2 join2 = new JoinMethodDemo2();
		join2.start();
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Main");
			
				Thread.sleep(2000);
			
			
		}
	}
}
