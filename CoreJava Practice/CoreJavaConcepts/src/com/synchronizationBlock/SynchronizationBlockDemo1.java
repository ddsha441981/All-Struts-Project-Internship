package com.synchronizationBlock;

public class SynchronizationBlockDemo1 extends Thread {

	SynchronizationBlockDisplay sdisplay;
	String name;
	
	public SynchronizationBlockDemo1(SynchronizationBlockDisplay sdisplay , String name) {
		
		this.name = name;
		this.sdisplay = sdisplay;
	}
	
	public void run(){
		
		sdisplay.wish(name);
	}
}
