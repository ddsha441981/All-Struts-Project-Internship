package com.org.list.vactor.example;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector vector = new Vector(25);//Default capacity 10 // Vector vector = new Vector(int initial capacity)
									//some given capacity Vector 
		                           /*** formula        ------------------------------------							 
									                   |new capacity = 2 * current capacity|
									                   ------------------------------------- */
		
		System.out.println(vector.capacity());//10 default capacity
		for(int i =1; i<=10;i++){
			vector.addElement(i);
		}
		System.out.println(vector.capacity());// //25
		
		vector.addElement("D");
		System.out.println(vector.capacity());  //25 because memory already large just double and elements are 11 there 
		
		System.out.println(vector);//25 //[1,2,3,4,5,6,7,8,9,10,Deendayal]
	}
}
