package com.StringData;

public class StringExample1 {
	// String str1 = "Hello";// String Literal
	// String str2 = new String(str1);//Another String Creating Object
	// String str3 = new String("Hello");//using new Keyword
	// String str4 = str1+str2; or Using Two way
	// String str5 = "Hello"+"world";
	public static void main(String[] args) {

		/**********************************************************************************************************/

		/*
		 * String str1 = "Hello";// using cont method both String add String
		 * str2 = "world"; String s =str1.concat(str2); System.out.println(
		 * "Both String is :"+s);
		 */

		/**********************************************************************************************************/

		/*
		 * String str1 = "Deendayal";//Using Equal Method String str2 =
		 * "Kumawat"; boolean str3 = str1.equals(str2);
		 * System.out.println(str3);//result is false
		 */
		/**********************************************************************************************************/

		/*
		 * String str1 = "Deendayal";//Using Equal Method String str2 =
		 * "Deendayal"; boolean str3 = str1.equals(str2);
		 * System.out.println(str3);//result is True
		 */
		/**********************************************************************************************************/

		/*
		 * String str1 = "Deendayal";// Using Equal Method String str2 =
		 * "Deendayal"; String str3 = "Kumawat";
		 * 
		 * boolean s1 = str1.equals(str2);// true boolean s2 =
		 * str1.equals(str3);// false boolean s3 = str2.equals(str3);// false
		 * 
		 * System.out.println(s1);// result is true System.out.println(s2);//
		 * result is false System.out.println(s3);// result is false
		 */ /**********************************************************************************************************/

		/*
		 * String str1 = "Hello";//Using == operator String str2 = "Hello";
		 * String str3 = new String("Hello"); boolean str4 = str1 == str2;
		 * boolean str5 = str1 == str3; boolean str6 = str2 == str3;
		 * System.out.println(str4);//true System.out.println(str5);//false
		 * System.out.println(str6);//false
		 */ /**********************************************************************************************************/

		/*
		 * String str1 = "Hello";//Using compareTo method String str2 ="Java";
		 * String str3 ="Hello";
		 * System.out.println(str1.compareTo(str2));//return -2 because str1 >
		 * str2 System.out.println(str2.compareTo(str3));//return 2 because str3
		 * > str2 System.out.println(str1.compareTo(str3));// return 0 because
		 * str1 and str3 both are equal(==)
		 */
		/**********************************************************************************************************/

		/*
		 * String str1 = "DeendayalKumawat ";//Using charAt() Method its return
		 * index of character and their Index Start with 0 index
		 * 
		 * System.out.println("Now String is "+str1.charAt(5));
		 */
		/**********************************************************************************************************/

		/*
		 * String str1 = "Hello";//Using equalsIgnoreCase() Method.Its ignore
		 * capital and small character
		 * System.out.println(str1.equalsIgnoreCase("HELLO"));//result is true
		 * 
		 * 
		 */ /**********************************************************************************************************/
		/*
		 * String str1 = "Hello This Is Eclipse Software";//Calculate Length of
		 * String str1.length(); System.out.println(str1.length());
		 */

		/**********************************************************************************************************/
		/*
		 * String str1 = "Hello This Is Eclipse Software";//Calculate Length of
		 * String str1.lastIndexOf(2); str1.lastIndexOf("l");
		 * System.out.println(str1.lastIndexOf(2));//calculate in int value
		 * System.out.println(str1.lastIndexOf("l"));//calculate in String
		 * Format
		 */
		/**********************************************************************************************************/

		/*
		 * String str1 = "Read Java Carefully";//replace str1.replace("fully",
		 * "ful"); System.out.println(str1.replace("fully", "ful"));
		 */

		/**********************************************************************************************************/
		/*
		 * String str1 = "DEENDAYAL";//convert into upperto lower case
		 * System.out.println(str1.toLowerCase());
		 */

		/**********************************************************************************************************/

		/*
		 * String str1 = "DEENDAYAL";//value of method
		 * System.out.println(str1.valueOf("A"));
		 */

		/**********************************************************************************************************/
		/*
		 * String str1 = "   hello  ";//Remove Space
		 * System.out.println(str1.trim());
		 */

		/**********************************************************************************************************/
		/*
		 * String str = "deendayal";//convert lowercase to Uppercase
		 * System.out.println(str.toUpperCase());
		 */

		/**********************************************************************************************************/
	}
}
