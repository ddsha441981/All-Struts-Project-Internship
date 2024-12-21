package com.synchronization;

public class ThreadTest {

	public static void main(String[] args) {
		
		Display2 d2 = new Display2();
		Thread1 t1 = new Thread1(d2);
		Thread2 t2 = new Thread2(d2);
		t1.start();
		t2.start();
	}
}
