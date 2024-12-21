package com.synchronization;

public class SynchronizationDemo1 extends Thread {

	SynchronizationDisplay sd;
	String name;
	
	public SynchronizationDemo1(SynchronizationDisplay sd , String name) { //Constructor
		
		this.sd = sd;
		this.name = name;
	}
	
	public void run(){
		
		
		sd.wish(name);//call method of SynchronizationDisplay class
	}
}
