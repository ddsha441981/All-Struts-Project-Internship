package ArraySortingByCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UsingItertor {
	
	//Using Iterator
	public static void main(String[] args) {
		//create array
		ArrayList<String> itr = new ArrayList<String>();
		//Add Element in Array
		itr.add("X");
		itr.add("Z6");
		itr.add("A");
		itr.add("Y");
		itr.add("P");
		//using Iterator display array
		System.out.println(itr);
		//When Using Iterator
		Iterator<String>ap=itr.iterator();//ap is object of Iterator
		while(ap.hasNext())
		{
			String s2 =ap.next();
			System.out.println(s2+"");//s2 is object of String
		}
		System.out.println();
		
		//Modified object being Iterator
		ListIterator<String> p1 = itr.listIterator();//p1 is again object of Iterator
		
		while(p1.hasNext())
		{
			String s2 = p1.next();//s3 is again String object
			System.out.println( s2 +"**");
		}
		System.out.println();
		
	}

}
