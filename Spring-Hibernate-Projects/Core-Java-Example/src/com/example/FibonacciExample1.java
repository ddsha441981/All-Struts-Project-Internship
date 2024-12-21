package com.example;

public class FibonacciExample1 {

	public static void main(String[] args) {
		
		int n1 =0;
		int n2 =1;
		int n3;
		int i;
		int count =10;
		System.out.println(n1 +" "+n2);//printing 0 1
		
		for(i=2;i<count;++i){
			
			n3 = n1+n2;
			System.out.println(" "+n3);
			n1 = n2;
			n2 =n3;
		}
	}
}
