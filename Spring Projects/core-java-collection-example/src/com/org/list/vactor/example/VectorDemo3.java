package com.org.list.vactor.example;

import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		Vector vector = new Vector(10,5);//Default capacity 10 // Vector vector = new Vector(int initial capacity,int incremental capacity)
									//some given capacity Vector 
		                           /*** formula        ------------------------------------							 
									                   |new capacity = 2 * current capacity|
									                   ------------------------------------- */
		
		System.out.println(vector.capacity());//10 default capacity
		for(int i =1; i<=10;i++){
			vector.addElement(i);
		}
		System.out.println(vector.capacity());// //10
		
		vector.addElement("D");
		System.out.println(vector.capacity());  //10 
		
		System.out.println(vector);//15 //[1,2,3,4,5,6,7,8,9,10,D] because memory  just double and elements are 11 there 
	}
}
