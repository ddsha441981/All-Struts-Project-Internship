package com.expcaptions.throwNthorws;

public class ThrowsExample {

	public static void main(String[] args) throws InterruptedException  {
		
		doStuff();
	}
	public  static  void doStuff() throws InterruptedException{
	
		doMoreStuff();
	}
	
	public  static  void doMoreStuff() throws InterruptedException{
		
		doNoStuff();
	}

	public  static  void doNoStuff() throws InterruptedException{
	
		Thread.sleep(2000);
	}

}
