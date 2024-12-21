package com.org.list.stack.example;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {					
		/***
		 * 
		  |				|offset
		  |______stack__|
		  |				|1
		  |______C______|
		  |				|	
		  |_______B_____|2
		  |				|
		  |_______A_____|3	
		 */
		 
		
		Stack  stack = new Stack();//empty stack its based on FIFO(First In First Out)
		stack.push("A");											
		stack.push("B");
		stack.push("C");
		System.out.println(stack);//[A,B,C]
		System.out.println(stack.search("A"));//return 3
		System.out.println(stack.search("z"));// return -1
		
	}
}
