package com.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList  al = new ArrayList();//empty ArrayList
		al.add("Deendayal");
		al.add("kumawat");
		al.add("Pawan");
		al.add("kumawat");
		al.add("Ishika");
		al.add("Sweety");
		al.add("Neha");
		al.add("Deendayal");
		System.out.println("After Adding some Element for ArrayList \n " + al);
		al.add(4, "wedding");
		System.out.println("After replace  some Element for ArrayList \n " + al);
		al.contains("kumawat");
		
	}
}
