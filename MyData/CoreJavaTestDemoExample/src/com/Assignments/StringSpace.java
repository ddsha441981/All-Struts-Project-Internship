package com.Assignments;

import java.util.*;
public class StringSpace
{

 public static void main(String args[])
 {

 // Create Scanner object to take input from command prompt
 Scanner s=new Scanner(System.in); 

 // Take input from the user and store it in st
 String st=s.nextLine();

 // Initialize the variable count to 0
 int count=0;

 // Convert String st to char array
 char[] c=st.toCharArray();

  // Loop till end of string
  for(int i=0;i<st.length();i++)

  // If character at index 'i' is not a space, then increment count
  if(c[i]!=' ') count++;

 // Print no.of chars other than spcaes
 System.out.println("No.of chars other than spaces are "+count);

 // Print no.of spaces
 System.out.println("No.of spaces are "+(st.length()-count));

 // Simply,
 String words[]=st.split(" ");
 
 // Print no.of spaces
 System.out.println("No.of spaces, simply "+(words.length-1));

  }

}