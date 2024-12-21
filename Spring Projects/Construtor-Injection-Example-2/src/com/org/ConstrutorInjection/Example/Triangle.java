package com.org.ConstrutorInjection.Example;

public class Triangle { //consrutor Injection

	private int size;

	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public void draw() {
		
		System.out.println(getSize()+ "  Triangle Class");
		
	}
}
