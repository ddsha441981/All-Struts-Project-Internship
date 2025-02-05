package org.Junit.TestCases;

import static org.junit.Assert.*;

import org.Junit.Logic.MathLogic;
import org.junit.Test;

/**
 * The Class TestLogic.
 * @author Deendayal
 * @version 1.1.2
 * The Class TestLogic.
 * @since 2017
 */

public class TestLogic {
	
	 /**
 	 * Test find max.
 	 */
 	@Test  
	    public void testFindMax(){  
	        assertEquals(4,MathLogic.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,MathLogic.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  
}
