package com.interruptMethod;

public class InterruptMethodDemo1 extends Thread {

	public void run(){
		try {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Child Thread is lazzy Thread");
			
				Thread.sleep(3000);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("I Got interrupted");
			}
		}
	
}
