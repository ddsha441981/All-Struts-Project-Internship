package com.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employees> arr = new ArrayList<Employees>();
		
		arr.add(new Employees(1, "AA", 23));
		arr.add(new Employees(4, "DD", 24));
		arr.add(new Employees(3, "CC", 22));
		arr.add(new Employees(2, "BB", 29));
		arr.add(new Employees(6, "EE", 21));
		arr.add(new Employees(5, "FF", 20));
		arr.add(new Employees(7, "AA", 25));
		System.out.println(arr);
		System.out.println("Size of Array is--------  "+ arr.size());
		
		HashSet<Employees> hset = new HashSet<Employees>();
		hset.add(new Employees(3, "H", 21));
		hset.add(new Employees(5, "D", 227));
		hset.add(new Employees(2, "M", 25));
		hset.add(new Employees(1, "K", 22));
		hset.add(new Employees(4, "H", 28));
		System.out.println(hset);
		hset.contains("k");
		
		
		
	}
}
