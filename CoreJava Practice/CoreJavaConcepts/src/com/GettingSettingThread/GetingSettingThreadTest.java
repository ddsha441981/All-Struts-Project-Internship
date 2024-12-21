package com.GettingSettingThread;

public class GetingSettingThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		GetingSettingThreadDemo1 t1 = new GetingSettingThreadDemo1();
		
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		Thread.currentThread().setName("Deendayal");
		System.out.println(Thread.currentThread().getName());
	}
}
