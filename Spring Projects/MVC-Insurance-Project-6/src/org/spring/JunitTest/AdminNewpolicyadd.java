package org.spring.JunitTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdminNewpolicyadd {

	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
	
	@Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
	
	/*@Test  
    public void testFindMax(){  
        System.out.println("test case Admin Add New Policy");  
        assertEquals(getallpolicyofAdmin);  
        assertEquals();  
    }  */
}
