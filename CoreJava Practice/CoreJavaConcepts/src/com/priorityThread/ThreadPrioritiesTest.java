package com.priorityThread;

public class ThreadPrioritiesTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());//main thread priority is 5
		
		//Thread.currentThread().setPriority(15);//java.lang.IllegalArgumentException
		
		//System.out.println(Thread.currentThread().getPriority());//java.lang.IllegalArgumentException
		
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());//Now main thread priority is 7
		
		ThreadPrioritiesDemo1 t1 = new ThreadPrioritiesDemo1();
		
		System.out.println(Thread.currentThread().getPriority());//main thread priority is 7
		
		System.out.println();
	}
}
