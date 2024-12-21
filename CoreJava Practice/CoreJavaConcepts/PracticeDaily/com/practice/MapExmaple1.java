package com.practice;

import java.util.HashMap;

public class MapExmaple1 {

	int id;
	String name;
	
	/*public MapExmaple1(int id,String name){
		
		this.id = id;
		this.name = name;
	}*/
	
	public void display(int id,String name) {
		
		System.out.println("Method Call id = " + id + " name = " + name);
		
		HashMap hash =  new HashMap();
		hash.put(id, name);
		
		System.out.println(hash.keySet());
		System.out.println(hash.values());
		
		
	}
}
