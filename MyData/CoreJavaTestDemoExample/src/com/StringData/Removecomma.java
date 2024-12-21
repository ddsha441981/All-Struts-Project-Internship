package com.StringData;

public class Removecomma {
	
	 
	public static String removeDot(String input){
		String output = "";
		System.out.println("inside method");
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i)==','){
				output = input.substring(0,i)+input.substring(i+1,input.length());
				break; // this statement should be eliminated in case of multiple dots checking.
			}
		}
		return output;
	}
	
public static void main(String[] args) {
    String ns=removeDot(",Hello,This,Is,My,Example");
	System.out.println(ns);
	
}
}
