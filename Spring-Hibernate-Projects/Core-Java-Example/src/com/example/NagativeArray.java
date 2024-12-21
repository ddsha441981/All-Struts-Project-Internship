package com.example;

public class NagativeArray {

	public static void main(String[] args)
	{
	int[] array = new int[-5]; //No compile time error
	//but you will get java.lang.NegativeArraySizeException at run time
	
	}
	

}
