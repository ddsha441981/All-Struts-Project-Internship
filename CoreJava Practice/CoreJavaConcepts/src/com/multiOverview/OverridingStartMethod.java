package com.multiOverview;

public class OverridingStartMethod extends Thread {

	public void start(){								//start() method overriding here
		System.out.println("Start Method");
	}
	
	public void run(){
		
		
			System.out.println("Run Method");
		
	}
	
}

