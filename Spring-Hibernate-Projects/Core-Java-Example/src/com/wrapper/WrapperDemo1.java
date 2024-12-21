package com.wrapper;
//this code is Primitive  to Wrapper object
// method is valueof()
public class WrapperDemo1 {

	public static void main(String[] args) {
		
		int a = 20;
		
		Integer i = Integer.valueOf(a);//Here int convert into Integer
		
		Integer j = a;//Automatically AutoBoxing
		System.out.println("A = " + a + " i =" + i + " j = " + j);
	}
}
