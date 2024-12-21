package com.practice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		hash.put(6, "Deendayal");
		hash.put(2, "Pawan");
		hash.put(3, "Mohan");
		hash.put(4, "Sohan");
		System.out.println(hash.values());
		System.out.println(hash.keySet());
		
		System.out.println(hash.put(6, "Chirag"));
		System.out.println(hash.values());
		System.out.println(hash.keySet());
		
		Collection c =  hash.values();
		System.out.println(c);
		
		Set s1 = hash.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		 while(itr.hasNext()){
			 
			Map.Entry m1 = (Entry) itr.next(); 
			System.out.println(m1.getKey() + " " +m1.getValue());
			if(m1.getKey().equals("Pawan")){
				
				m1.setValue("ishika");
			}
			System.out.println(hash);
			
			
		}
	}
}
