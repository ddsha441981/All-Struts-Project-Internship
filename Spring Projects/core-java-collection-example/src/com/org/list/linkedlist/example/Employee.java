package com.org.list.linkedlist.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	
	/** Hierachy of LinkedList
	 * Itterable -->> collection -->> List -->> Abstractsequentilist -->> LinkedList*/
	/**About LinkedList
	 * 
	 * 1 LinkedList is use to dynamic doubly linkedlist to store element
	 * 2 Its contains null values 
	 * 3 Its not synchronized 
	 * 4 No random access 
	 * 5 Manipulation is faster than arrayList because bno shifting 
	 * 6 Its contains dublicate values
	 * 7 Its can be also use as List Stack and Queqe */
	

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		list.add("Deendayal");
		list.add("Kumawat");
		list.add("Nitin");
		list.add("Khutemate");
		
		//System.out.println(list.hashCode()); //check hashcode
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
