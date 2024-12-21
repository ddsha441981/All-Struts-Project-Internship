package com.ExceptionHandling.example;
class ThrowKeyword{
	
	public void display(){
		throw new IllegalArgumentException();
	}
}

public class Test extends ThrowKeyword {

	public static void main(String[] args) {
		 Test t = new Test();
		try{
			
			t.display();
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
	}
	
}
// o/p
// RE