package com.multiOverviewRunnable;

public class ThreadDemoTest {

	public static void main(String[] args) {
		
		ThreadDemo1 td1 = new ThreadDemo1();
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td1);
		//t1.start();
		
		//t1.run();//New thread will not create run() method treat just like normal method
		
		//t2.start();//new thread will create here
		
		//t2.run();//New thread will not create run() method treat just like normal method
		
		//td1.start();//we will get compile time error
		
		//td1.run();//new thread will not be create here and run() method treat just like normal method
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Main Thread");
		}
	}
}
