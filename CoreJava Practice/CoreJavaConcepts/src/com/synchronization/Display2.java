package com.synchronization;

public class Display2 {

	public synchronized void displayNumber(){
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
	
	public synchronized void displayChar(){
		
		for (int i = 65; i <=96; i++) {
			
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
}
