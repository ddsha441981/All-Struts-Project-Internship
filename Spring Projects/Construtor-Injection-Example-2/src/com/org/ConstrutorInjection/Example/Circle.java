package com.org.ConstrutorInjection.Example;

public class Circle {
	/*
	 * consrutor Injection when you create constructor injection no need setter
	 * method
	 */
	private String name;
	private int height;

	public Circle(String name) { // This is constructor Injection
		this.name = name;
	}

	public Circle(String name, int size) { // Here constructor overload
		this.name = name;
		this.height = size;

	}
	
	public Circle(int height){
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public void draw() {

		System.out.println(getName() + "  Circle Class  " + getHeight());

	}
}
