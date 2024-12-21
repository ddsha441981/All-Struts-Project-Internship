package com.example;

public class SwapNumbers {
	
	
	public void display(){
		
		int x = 25;
		int y = 10;
		int temp = 0;
		System.out.println("Without Swaping Number  : X = " +x+ " Y = " +y);
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swaping Number  : X = " + x + " Y = " + y);
	}
	
	public void disp(){
		
		int x = 25;
		int y = 10;
		int temp = 0;
		System.out.println("Without Swaping Number  : X ="+x+ "Y = " +y);
		
		x = x + y;//35
		y = x - y;//25
		x = y - x;//10
		System.out.println("After Swaping Number  : X = " + x + "Y = " + y);
	
	}

	public static void main(String[] args) {
		SwapNumbers t = new SwapNumbers();
		t.display();
		t.disp();
		
		/*MyFinalClass m= new MyFinalClass(25, "Deendayal");
		System.out.println(m.getAge());*/
	}
}
