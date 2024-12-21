package com.random.Number;

import java.util.Random;

public class RandomNumberPass {

	public static void main(String[] args) {
		
		RandomNumberPass n = new RandomNumberPass();
		
		System.out.println(n.backrandomNumber());
	}
	public String backrandomNumber()
	{
			Random rand = new Random();
		
		//begin method with return string and you may or may not give input
		char[] values1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','y','z'};
		char[] values4 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','W','X','Y','Z'};
		    char[] values2 = {'@','&','$','#','%','*','<','>','^','+','-','/','*','!'};
		    char[] values3 = {'1','2','3','4','5','6','7','8','9','0'};
		    String out1="";
		    String out2="";
		    String out3="";
		    String out4="";
		 
		         for (int i=0;i<6;i++)
		            {
		             int idx=rand.nextInt(values1.length);
		            out1+= values1[idx];
		            }
		 
		    for (int i=0;i<3;i++)
		            {
		            int idx=rand.nextInt(values3.length);
		             out2+= values3[idx];
		            }
		 
		    for (int i=0;i<1;i++)
		            {
		            int idx=rand.nextInt(values2.length);
		             out3+= values2[idx];
		            }
		    
		    for (int i=0;i<1;i++)
            {
            int idx=rand.nextInt(values4.length);
             out4+= values4[idx];
            }
		 
		   String  out= out3.concat(out1).concat(out2).concat(out3);
		    return out;
		 
		//end of method returning String 'OUT' as a random password
	}
	
}
