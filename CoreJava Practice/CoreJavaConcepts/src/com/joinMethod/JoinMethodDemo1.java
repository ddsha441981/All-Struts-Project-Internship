package com.joinMethod;

public class JoinMethodDemo1 extends Thread {

	public void run(){
		for (int i = 0; i <10; i++) {
			
			System.out.println("Sita");
			try{
				
				Thread.sleep(2000);
			}
			catch(InterruptedException IE){
				IE.printStackTrace();
			}
			
		}
		
	}
}
