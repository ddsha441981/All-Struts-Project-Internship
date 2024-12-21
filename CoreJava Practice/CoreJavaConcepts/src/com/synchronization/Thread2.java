package com.synchronization;

public class Thread2 extends Thread {

	Display2 d2;
	public Thread2(Display2 d2) {
		this.d2 = d2;
	}
	public void run(){
		
		d2.displayChar();
	}
}
