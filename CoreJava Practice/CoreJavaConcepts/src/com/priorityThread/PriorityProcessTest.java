package com.priorityThread;

public class PriorityProcessTest {

	public static void main(String[] args) {
		
		PriorityProcessDemo2 t1 = new PriorityProcessDemo2();
		System.out.println(Thread.currentThread().getPriority());
		
		t1.start();
		//Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
