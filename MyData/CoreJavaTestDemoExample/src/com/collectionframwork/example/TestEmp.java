package com.collectionframwork.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class TestEmp {
	
	public static void main(String[] args) {
		
		HashSet<String> skill1 = new HashSet<String>();
		skill1.add("C");
		skill1.add("C++");
		skill1.add("Java");
		skill1.add("Sql");
		
		HashSet<String> skill2 = new HashSet<String>();
		skill2.add("Sql");
		skill2.add(".Net");
		skill2.add("Rubby");
		skill2.add("Pythan");
		
		HashSet<String> skill3 = new HashSet<String>();
		skill3.add("visual basic");
		skill3.add("C#");
		skill3.add("Struct");
		skill3.add("JSP");
		
		HashSet<String> skill4 = new HashSet<String>();
		skill4.add("Oracle");
		skill4.add("java");
		skill4.add("Pl Sql");
		skill4.add("PHP");
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(new Employee(11, "Deendayal", skill1));
		a1.add(new Employee(16, "Ratan", skill2));
		a1.add(new Employee(122, "Nitin", skill3));
		a1.add(new Employee(7, "Sumit", skill4));
		a1.add(new Employee(7, "Sumit", skill4));
		//System.out.println(a1);//All Data Print
		//Searchutil.Searchutil(a1, 11);//Record found line
		
		System.out.println(a1);//All Data Print(Before Data Sort)
		Collections.sort(a1);//After Sort Data only id
		System.out.println(a1);//All Data Print(After Data Sort)
		
		System.out.println(a1);//All Data Print(Before Data Sort)
		Collections.sort(a1, new SortByName());//After Sort Name
		System.out.println(a1);//All Data Print(After Data Sort)
		
		
		
	}
	
}
