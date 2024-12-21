package com.junitTest.TestClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junit.MathsClass.Calculation;

public class JunitTest extends Calculation {

	
	public void testSetup(){
		System.out.println("Setup Method Call");
	}
	
	public void teardown(){
		System.out.println("teardown Method Call");
	}
	
	
	public void testsum(){
		System.out.println("In Sum Test Method");
		
		Calculation cal = new Calculation();
		
		int actualResult = cal.sum(20, 10);
		assertEquals(44,actualResult);
	}
}
