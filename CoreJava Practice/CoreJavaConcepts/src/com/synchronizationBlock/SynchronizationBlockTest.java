package com.synchronizationBlock;

public class SynchronizationBlockTest {

	public static void main(String[] args) {
		
		SynchronizationBlockDisplay sdiDisplay = new SynchronizationBlockDisplay();
		SynchronizationBlockDemo1 sb1 = new SynchronizationBlockDemo1(sdiDisplay, "Deendayal");
		SynchronizationBlockDemo1 sb2 = new SynchronizationBlockDemo1(sdiDisplay, "Kumawat");
		sb1.start();
		sb2.start();
		
	}
}
