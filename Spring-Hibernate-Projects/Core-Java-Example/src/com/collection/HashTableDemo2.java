package com.collection;

import java.util.Hashtable;

public class HashTableDemo2 {

	public static void main(String[] args) {
		Hashtable hash = new Hashtable();
		hash.put(new HashTableDemo2Test(2), "K");
		hash.put(new HashTableDemo2Test(10), "W");
		hash.put(new HashTableDemo2Test(8), "Q");
		hash.put(new HashTableDemo2Test(7), "R");
		hash.put(new HashTableDemo2Test(3), "P");
		hash.put(new HashTableDemo2Test(6), "U");
		hash.put(new HashTableDemo2Test(1), "Y");
		System.out.println(hash);
		//hash.put(null, "Surendra");////Null Pointer Exacption Null key and value Not Allowed in HashTable
		//hash.put("Deendayl", null);//Null Pointer Exacption Null key and value Not Allowed in HashTable
	}
}
