package com.synchronizationBlock;

public class SynchronizationBlockDisplay {

	public void wish(String name){
		
		synchronized (this) {
			
			for (int i = 0; i < 10; i++) {
				
				System.out.println("Good Morning");
				try{
					Thread.sleep(2000);
				}catch(InterruptedException IE){
					IE.printStackTrace();
				}
				System.out.println(name);
			}
		}
		
	}
}
