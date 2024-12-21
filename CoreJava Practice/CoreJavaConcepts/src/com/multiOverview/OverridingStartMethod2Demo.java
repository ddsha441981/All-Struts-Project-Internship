package com.multiOverview;

public class OverridingStartMethod2Demo extends Thread {

	public void start(){ 
		
		super.start();// its not recommended to override start() otherwise don't go for multithreading concepts
		System.out.println("start method call");
	}
	
	public void run(){
		
		
		System.out.println("run method call");
	}
}

