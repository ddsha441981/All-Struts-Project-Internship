package com.org.list.linkedlist.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		LinkedList linkedList = new LinkedList(arrayList);//LinkedList linkedList = new LinkedList(Collection c);
														//here LinkedList linkedList = new LinkedList(arrayList); 
	}
}
