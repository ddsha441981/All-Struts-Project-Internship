package com.practice;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		
		Hashtable hash = new Hashtable();
		hash.put(new TempClass(15), "hello");
		hash.put(new TempClass(2), "Hii");
		hash.put(new TempClass(4), "Good");
		hash.put(new TempClass(3), "Bye");
		hash.put(new TempClass(5), "Deendayal");
		
		System.out.println(hash);
	}
}
