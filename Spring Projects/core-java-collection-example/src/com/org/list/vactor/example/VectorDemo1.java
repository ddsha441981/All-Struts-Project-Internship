package com.org.list.vactor.example;

import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		Vector vector = new Vector();//Default capacity 10
									//empty Vector 
		                           /*** formula        ------------------------------------							 
									                   |new capacity = 2 * current capacity|
									                   ------------------------------------- */
		
		System.out.println(vector.capacity());//10 default capacity
		for(int i =1; i<=10;i++){
			vector.addElement(i);
		}
		System.out.println(vector.capacity());// //10
		
		vector.addElement("D");
		System.out.println(vector.capacity());  //10 now 11th element added then memory increase just double 
		
		System.out.println(vector);//20 //[1,2,3,4,5,6,7,8,9,10,Deendayal]
	}
}
