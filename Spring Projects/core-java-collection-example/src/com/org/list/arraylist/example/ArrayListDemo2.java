package com.org.list.arraylist.example;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList(20); // ArrayList l = new ArrayList(int initial capacity)
		l.add("G");
		l.add("A");
		l.add(20);
		l.add(null);
		l.add(20);
		System.out.println(l);// [G,A,20,null,20]
		l.remove(1);
		System.out.println(l);// [G,20,null,20]
		l.add(1, "Deendayal");
		System.out.println(l);// [G,Deendayal,20,null,20]
	}

}
