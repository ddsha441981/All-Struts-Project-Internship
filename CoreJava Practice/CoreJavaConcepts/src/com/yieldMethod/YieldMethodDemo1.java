package com.yieldMethod;

public class YieldMethodDemo1 extends Thread {

	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			//Thread.yield();//it will get change more than more of main thread
		}
		
	}
}
