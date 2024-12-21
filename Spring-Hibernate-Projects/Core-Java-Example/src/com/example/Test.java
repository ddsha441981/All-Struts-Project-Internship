package com.example;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(2.9f ==2.9);
		System.out.println(2.5f == 2.5);
		
		System.out.println("3.4 = "+ Long.toBinaryString(Double.doubleToRawLongBits(3.4)));
		System.out.println("3.4f = "+ Long.toBinaryString(Float.floatToRawIntBits(3.4f)));
		
		System.out.println("3.5 = "+ Long.toBinaryString(Double.doubleToRawLongBits(3.5)));
		System.out.println("3.5f = "+ Long.toBinaryString(Float.floatToRawIntBits(3.5f)));
	}
}
