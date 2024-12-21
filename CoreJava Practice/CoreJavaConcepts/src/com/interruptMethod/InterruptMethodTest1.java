package com.interruptMethod;

public class InterruptMethodTest1 {

	public static void main(String[] args) {
		
		InterruptMethodDemo1 tm = new InterruptMethodDemo1();
		tm.start();
		tm.interrupt();
		System.out.println("End of main Thread");
	}
}
