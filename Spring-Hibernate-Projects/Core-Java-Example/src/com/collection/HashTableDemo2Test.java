package com.collection;

public class HashTableDemo2Test {

 int i;
 	public HashTableDemo2Test(int i){
 		this.i = i;
 	}
 	public int hashcode(){
 		return i;
 	}
 	public String toString(){
 		return i%9 + "";
 	}
}
