package com.collection;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al  = new ArrayList(20);//Initial capacity of an ArrayList
		al.add("Hello");
		al.add("How");
		al.add("are");
		al.add("you");
		al.add("Deendayal");
		al.add("I'M");
		al.add("Fine");
		al.add("Thank");
		al.add("you");
		al.add("And");
		al.add("You");
		al.add("I'M");
		al.add("Fine");
		al.add("Too");
		al.add("Deendayal");
		al.remove(14);
		System.out.println(al);
		
		System.out.println("Size of ArrayList is " +al.size());
		al.set(4, "Darling");
		System.out.println("After Replacing some Data in ArrayList \n" +al);
		System.out.println("After Create clone of an ArrayList \n" + al.clone());
		al.removeAll(al);
		
		System.out.println("All Remove Elements " + al);
		
	}
}
