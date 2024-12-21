package com.synchronization;

public class Thread1 extends Thread{

	Display2 d2;
	public Thread1(Display2 d2) {
		this.d2 = d2;
	}
	public void run(){
		
		d2.displayNumber();
	}
}
