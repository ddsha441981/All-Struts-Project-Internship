package com.joinMethod;

public class JoinMethodDemo2 extends Thread {

	public static JoinMethodDemo2 demo2;
	
	public void run(){
		
		
			try{
				demo2.join();
			}
			catch(InterruptedException IE){
				
				IE.printStackTrace();
			}
			for (int i = 0; i < 10; i++) {
				
				System.out.println("Child");
			}
	}
}
