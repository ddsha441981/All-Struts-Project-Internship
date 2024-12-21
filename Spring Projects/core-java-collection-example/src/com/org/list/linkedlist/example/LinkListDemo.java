package com.org.list.linkedlist.example;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();// Empty LinkedList
													
		linkedList.add(10);
		linkedList.add("Z");
		linkedList.add("Y");
		linkedList.add(20);
		linkedList.add("A");
		linkedList.add(null);
		linkedList.add("Z");
		linkedList.add(null);
		System.out.println(linkedList);//[10,Z,Y,20,A,null,Z,null] order preserved
		linkedList.addFirst("Deendayal");
		linkedList.addLast("Java");
		System.out.println(linkedList);//["Deendayal,0,Z,Y,20,A,null,Z,null,Java] order preserved
		linkedList.removeFirst();
		System.out.println(linkedList);//[10,Z,Y,20,A,null,Z,null,java] order preserved
		linkedList.removeLast();
		System.out.println(linkedList);//[10,Z,Y,20,A,null,Z,null] order preserved
		
	}
}
