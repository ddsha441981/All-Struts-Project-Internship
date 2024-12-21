package com.StringData;

public class StringBufferExample {

	public static void main(String[] args) {
		String str1 = "Hello";//normal String 
		str1.concat("Java");
		System.out.println("Before Creating String Buffer\t"  +str1);//output is Hello
		
		StringBuffer str2 = new StringBuffer("Hello");//After String Buffer is created output is
		str2.append("Java");
		System.out.println("After Creating String Buffer\t " +str2);//output is Hello Java
		
	}
}
