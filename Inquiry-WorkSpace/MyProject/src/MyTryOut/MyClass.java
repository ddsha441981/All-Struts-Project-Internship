package MyTryOut;
/*		##########################################################################################      
 * 
 * Using cmd  we can create agrs[] like a varriable
 * step 1: args[] is array so we can use it like a varriable
 * 2: i create 
 * 
 * 
 * */
public class MyClass
{
	public static void  main(String args[])
	{
		int i=0;
		int s=0;
		for(i=0;i<args.length;i++)
			s= s+Integer.parseInt(args[i]); 
			System.out.println(args[i]);
		//System.out.println(args[i]);
	}//run in cmd coomand
}