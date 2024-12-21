package org.spring.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.spring.repositries.LoginDao;

public class TestCases {

	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
    }  
	
	@Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
	
	@Test  
    public void testFindMax(){  
        System.out.println("test case Admin Add New Policy");  
        assertEquals(5,LoginDao.retriveusingId(6));  
         
    }  
}
