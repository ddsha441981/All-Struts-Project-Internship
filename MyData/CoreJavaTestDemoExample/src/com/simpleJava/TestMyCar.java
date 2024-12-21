package com.simpleJava;

abstract class TestMyCar {
abstract void car(int speed ,int price , String color);
	
}

class Maruti extends TestMyCar{
	
	int speed;
	int price;
	String color;
	
	 void car(int speed , int price , String color){
		System.out.println("Maruti is\n"+"Top Seed" +speed+ "price "+price+ "color" +color);
		
	}
	 public static void main(String[] args) {
			
			Maruti m1 = new Maruti();
			
			m1.car(200, 100000, "white");
		}
}	
	/*class Hero extends TestMyCar{
		
		int speed;
		int price;
		String color;
		
		public void car(int speed , int price , String color){
			System.out.println("Hero is\n"+"Top Seed" +speed+ "price "+price+ "color" +color);
			
		}
		
		public static void main(String[] args) {
			
			
			Hero h1 = new Hero();
			
			
			h1.car(180, 400000, "Black");
			
		}
	}
		
		class Honda extends TestMyCar{
			
			int speed;
			int price;
			String color;
			
			public void car(int speed , int price , String color){
				System.out.println("Honda is\n"+"Top Seed" +speed+ "price "+price+ "color" +color);
				
			}
			
			public static void main(String[] args) {
				
				
				Honda ho = new Honda();
				
				
				ho.car(200, 50000, "Gray");
				
			}
		}
			
			class Suzuki extends TestMyCar{
				
				int speed;
				int price;
				String color;
				
				public void car(int speed , int price , String color){
					System.out.println("Suzuki is\n"+"Top Seed" +speed+ "price "+price+ "color" +color);
					
				}
				
				
					public static void main(String[] args) {
						
						
						Suzuki s1 = new Suzuki();
						
						s1.car(220, 1000000, "Red");
					}
					
				}*/
		

