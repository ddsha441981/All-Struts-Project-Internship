package com.multiOverview;

public class Demo1StartMethodTest {

		
		public static void main(String[] args) {
			
			Demo1StartMethod t1 = new Demo1StartMethod();
			t1.start();  //method overriding here of run method and start new Thread
			for (int i = 0; i < 10; i++) {
				System.out.println("Main Thread");//executing main thread
			}
			
		}
	

}
