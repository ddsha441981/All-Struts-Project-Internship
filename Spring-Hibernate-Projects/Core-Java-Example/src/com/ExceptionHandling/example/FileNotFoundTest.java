package com.ExceptionHandling.example;

import java.io.*;

public class FileNotFoundTest {

	public static void main(String[] args) {
		
		try 
		{
			PrintWriter p = new PrintWriter("abc.txt");
			p.println("Hello");
			
		} 
		
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
	}
}
