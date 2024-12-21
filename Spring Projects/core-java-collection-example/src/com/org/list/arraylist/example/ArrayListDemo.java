package com.org.list.arraylist.example;

import java.util.ArrayList;

public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList l = new ArrayList(); // Empty ArrayList
										// Default size is 10 (Predefines)
										// formula is
										/*** formula        ------------------------------------------							 
        													|new capacity = (current capacity 3/2) + 1|
        													------------------------------------------- */
		l.add("A");
		l.add("D");
		l.add(10);
		l.add(null);
		l.add("A");
		System.out.println(l);// [A,D,10,null,A] order is preserved

		l.remove(2);
		System.out.println(l);// [A,D,null,A] order is preserved

		l.add(2, "Deendayal");
		l.add("Nitin");
		System.out.println(l);// [A,D,Deendayal,null,A,Nitin]
	}
}
