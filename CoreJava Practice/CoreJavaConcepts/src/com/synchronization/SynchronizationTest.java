package com.synchronization;

public class SynchronizationTest {

	public static void main(String[] args) {
		
		SynchronizationDisplay sd = new SynchronizationDisplay();
		SynchronizationDemo1 t1 = new SynchronizationDemo1(sd,"Deendayal");
		SynchronizationDemo1 t2 = new SynchronizationDemo1(sd,"Pawan");
		t1.start();
		t2.start();
	}
}
