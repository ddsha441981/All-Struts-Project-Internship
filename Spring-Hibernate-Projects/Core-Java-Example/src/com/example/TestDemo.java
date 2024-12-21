package com.example;

public class TestDemo{

int id;
String name;
static String collegeName = "VIT College Pune Maharastra";

/*public TestDemo(int id,String name,String collegeName){
  System.out.println("Parameters Constructors");
  this.id=id;
  this.name=name;
  this.collegeName=collegeName;
}*/

public static void dispaly(int id,String name,String collegeName){

  System.out.println("Display Method Call");
  System.out.println( id + "  " +name + " " +collegeName );
}

public static void main(String[] args) {
  TestDemo emp1 = new TestDemo();
 emp1.dispaly(1,"Deendayal",collegeName);

  
  
}
}
