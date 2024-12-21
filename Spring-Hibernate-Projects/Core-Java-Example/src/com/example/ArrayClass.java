package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayClass {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("A");
		arr.add("O");
		arr.add("Y");
		arr.add("P");
		arr.add("Z");
		arr.add("H");
		arr.add("Z");
		System.out.println("Before Sorting\n"+arr);
		Collections.sort(arr);
		System.out.println("After Sorting\n"+arr);
		Collections.reverse(arr);
		System.out.println("After Reverse of ArrayList\n" +arr);
		
		System.out.println(Collections.binarySearch(arr, "Z"));
		
		
	}
}
