package ArraySortingByCollection;

import java.util.ArrayList;

public class ArrayListofcol {
	public static void main(String[] args) {
		// create array list
		ArrayList<String> ar = new ArrayList<String>();
		// how many size
		System.out.println("Initial size of Array 1  :" + ar.size());
		// Add element to the array list
		ar.add("C");
		ar.add("B");
		ar.add("A");
		ar.add("X");
		ar.add("M");
		ar.add("E");
		System.out.println("After Addition in Array List Element :" + ar.size());

		// display Array list
		System.out.println(ar);
		
		// Another Array
		ArrayList<String> ar1 = new ArrayList<String>();
		// how many size
		System.out.println("Initial size of Array 2  :" + ar1.size());
		ar1.add("Y2");
		ar1.add("Z2");
		ar1.add("N2");
		ar1.add("A2");
		ar1.add("C2");
		System.out.println("After Addition in Array List Element :" + ar1.size());
		//display Array
		System.out.println(ar1);
	
		//Both Add Array 1 and Array 2
		ar.addAll(ar1);
		//After adding Array
		System.out.println("After Both Array Adding :" +ar);
		
		//Any Element Contain (Available) in array
		if(ar.contains("N2"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		//Any Element Remove in Array
		ar.remove(6);
		ar.remove("C");
		System.out.println(ar);
		System.out.println("After Element Remove in Array :" + ar.size());
		//All Remove Element
		ar.removeAll(ar1);
		System.out.println(ar);
		System.out.println("After Element Remove in Array 2 :" + ar.size());
		//To check both array are equal or not
		if(ar.equals(ar)==ar1.equals(ar1))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		//to receive element 
		ar.get(4);
		System.out.println(ar);
		//Add new Element
		ar.add(5, "Deendayal");
		System.out.println(ar);
		//All Element are Clear
		ar.clear();
		System.out.println(ar);
		System.out.println("After All Element Remove in Array  :" + ar.size());
		
	///	//////////////////////////////////////////////////////////////////////////////////////
		
	}

}
