package com.practice;

public class TempClass {

	int i = 0;
	
	public TempClass(int i) {
		
		this.i = i;
	}
	
	public int hashcode(){
		
		return i%9;
	}
	
	public String toString(){
		return i +"";
	}
}
