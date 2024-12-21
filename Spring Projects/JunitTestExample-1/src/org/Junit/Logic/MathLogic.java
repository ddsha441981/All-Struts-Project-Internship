package org.Junit.Logic;

// TODO: Auto-generated Javadoc
/**
 * The Class MathLogic.
 *
 * @author Deendayal
 * @version 1.1.2
 * The Class MathLogic.
 * @since 2017
 */
public class MathLogic {
	
	/**
	 * Find max.
	 * @param arr the arr
	 * @return the int
	 */
	 public static int findMax(int arr[]){  
	        int max=arr[0];//arr[0] instead of 0  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
	    }  
	
}
