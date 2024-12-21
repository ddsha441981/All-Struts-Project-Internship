package com.collection;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
		
		Hashtable hash = new Hashtable();
		hash.put(new HashTableDemo1Test(5), "H");
		hash.put(new HashTableDemo1Test(9), "O");
		hash.put(new HashTableDemo1Test(6), "A");
		hash.put(new HashTableDemo1Test(7), "B");
		hash.put(new HashTableDemo1Test(4), "Z");
		hash.put(new HashTableDemo1Test(2), "F");
		hash.put(new HashTableDemo1Test(3), "T");
		hash.put(new HashTableDemo1Test(1), "X");
		hash.put(new HashTableDemo1Test(15), "P");
		System.out.println(hash);
	}
}
