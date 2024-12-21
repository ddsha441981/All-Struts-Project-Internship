package com.simpleJava;

public class Second {
	int id;
	String name;
	static String company="Seed Infotch Pvt Ltd";
	/*static String company="";*/ /*here not value assign so compiler set default value 0 set there*/
	
	public Second(){
		
	}
	
	public Second(int i,String n){
		this.id=i;
		this.name=n;
	}

	public void display(int id , String name){
		System.out.println("Here Data is \n" +"Id "  +id + "\n Name "  + name +  "\nCompany  "  + company);
		
	}
	public static void main(String[] args) {
		Second s1 = new Second();
		s1.display(1, "Deendayal");
		
	}
}
