package com.wrapper;

//this code is Wrapper object to  Primitive 
//method is xxxvalue()

public class WrapperDemo2 {

	public static void main(String[] args) {
		
		/*//converting into integer to int
		Integer a = new Integer(3);
		int i = a.intValue();
		int j = a;// unboxing internally compiler convert into intValue()
		System.out.println("a = " +a+" i = " +i+ " j = " +j);*/
		
		for(int i =1;i<=100;i++){
			System.out.println(i);
			if(i%5==0){
				
				System.out.println("Number 5 = " +i);
			}
			else if(i%7==0){
				System.out.println("Number 7 = " +i);
			}
			
		}
	}
}
