package com.Example;

/*public class Test
{
	
	//char c2 = 'face';
	
	 public static void main(String[] args)
	 {
	  int j = 5;
	  for (int i = 0; i< j; i++)
	  {
	    if ( i < j-- )
	       System.out.print(  (i*j)  + " ");
	  }
	 }
	}*/

/*public class Test {
	  public static void main(String[] args)
	  {
	    double d = 100.04;  
	    float f = d;	
	    System.out.println("Float value "+f);
	  }
	}*/

/*class Test
{
 int x = 10; 
 public void assign(int x)
 {
   x = x;  
   System.out.println(this.x);
 }
 public static void main(String[] args)
 {
   new Test().assign(100);	
  
 }
 }*/

/*class Test
{
  static int count = 100;
  public void increment()
  {
     count++;
  }
  public static void main(String []args)
  {
	  Test b1 = new Test();
     b1.increment();
     Test b2 = new Test();
     System.out.println(b2.count);   // line 13
  }
}*/
/*class Test
{
  static int x = 100;              // line 3
  int y = 200;                     // line 4 
  public static void main(String []args)
  {
     final int z;                  // line 7
     z = x + y;                    // line 8
     System.out.println(z);
  }
}*/

/*class Test extends A {
	
	public static void main(String[] args) {
		Test t1 =new Test();
		Test t2 = new A();
		A a = new A();
		A a2 = new Test();
		
		
	}
}*/
/*public class Test 
{
  public static void main(String[] args) 
  {
   B b = new C();
   A a = b;
   if (a instanceof A) System.out.println("A");
   if (a instanceof B) System.out.println("B");
   if (a instanceof C) System.out.println("C");
   if (a instanceof D) System.out.println("D");
  }
}
 
class A {}
class B extends A {}
class C extends B {}
class D extends C {}*/

/*class Animal
{
  String name = "animal";
  String makeNoise()  { return "generic noise"; }
}
class Dog extends Animal 
{
  String name = "dog";
  String makeNoise() {  return "bark"; }
}
public class Test 
{
  public static void main(String[] args)
  { 
   Animal an = new Dog();
   System.out.println(an.name+" "+an.makeNoise());
  }
}*/

/*class A
{
  public void m1()
  { System.out.println("A"); }
}
public class B extends A
{
  void m1()
  { System.out.println("B"); }
 
 public static void main(String []args)
 {
   A a = new B();
   a.m1();
 }
}*/

/*public class Test
{ 
   public static void main(String argv[])
   { 
	   String str = "Java";
	   String str1 = new String("Java");
	     
	   System.out.println(str.equals(str1));
	   System.out.println(str == str1);
	   System.out.println( str.compareTo(str1) );
   }
}*/

public class Test
{ 
   public static void main(String argv[])
   { 
	   String str = "StudyTonight";
	   str.concat(".com");
	   str = str.toUpperCase();
	   str.replace("TONIGHT","today");
	   System.out.println(str);
   }
}