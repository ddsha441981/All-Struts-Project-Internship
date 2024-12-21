package com.org.list.arraylist.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
	
	/**Hierarchy of ArrayList 
	 * Iterable -->> collection -->> List -->> AbstractList -->> ArrayList */
	
	/**
	 * 1 ArrayList is a class and it's implements List interface and List interface is
	 *  child interface of collection interface List interface internally extends
	 *  collection interface.
	 *2 ArrayList allowed duplicate values.
	 *3 ArrayList is contain null values.
	 *4 ArrayList maintains insertion order.
	 *5 ArrayList Not synchronized.
	 *6 ArrayList sizable,dynamic(grow and shrink) and heterogeneous(non primitive data type) object allowed.
	 *7 ArrayList random access because array works with index.
	 *8 ArrayList Manipulation is slower than array because a lot of shifting.
	 */
	
	public static void main(String[] args) {

		List<String> arr = new ArrayList<>();
		arr.add("Deendayal");
		arr.add("kumawat");
		arr.add("Nitin");
		arr.add("Deendayal");
		arr.add("Khutemate");
		// arr.clear();//clear all array element
		// arr.add(3, "Avantika");//Add new element in index given position
		// System.out.println(arr.contains(arr));//to check obj exist or not
		// return boolean value
		// System.out.println(arr.isEmpty());//check it arraylist is empty or
		// not
		// System.out.println(arr.size());to check list size

		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

