package org.spring.utility;

import java.util.Random;

public class AutoGerneratedPassword {

	public static  String GeneratedPassword()
	{
			Random random = new Random();
		
		//begin method with return string and you may or may not give input
		char[] values1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','y','z'};
		char[] values2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','W','X','Y','Z'};
		    char[] values3 = {'@','&','$','#','%','*'};
		    char[] values4 = {'1','2','3','4','5','6','7','8','9','0'};
		    String out1="";
		    String out2="";
		    String out3="";
		    String out4="";
		 
		         for (int i=0;i<6;i++)
		            {
		             int idx=random.nextInt(values1.length);
		            out1+= values1[idx];
		            }
		 
		    for (int i=0;i<3;i++)
		            {
		            int idx=random.nextInt(values3.length);
		             out2+= values3[idx];
		            }
		 
		    for (int i=0;i<1;i++)
		            {
		            int idx=random.nextInt(values2.length);
		             out3+= values2[idx];
		            }
		    
		    for (int i=0;i<2;i++)
            {
            int idx=random.nextInt(values4.length);
             out4+= values4[idx];
            }
		 
		   String  out= out1.concat(out2).concat(out3).concat(out4);
		    return out;
		 
		//end of method returning String 'OUT' as a random password
	}
	

}
