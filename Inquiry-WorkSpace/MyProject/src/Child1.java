
abstract class Abstract_Method {

	 abstract void  New_Method();
	
	void Simple(){
		System.out.println("Hello Galaxy");
	}
}
 class Child extends Abstract_Method  {
	 
	  void  New_Method(){
		 
		 System.out.println("Hi.......Galaxy");
	 }
	 

 }
 class Child2 extends Abstract_Method{
	 void New_Method(){
		  System.out.println("Hi");
	  }
 }
public  class Child1 {
	  
	 public static void main(String args[]){
		 
		 Abstract_Method ch =new Child();
		 Abstract_Method ch1 = new Child2();
		 ch.Simple();
		 ch.New_Method();
		 
		 ch1.Simple();
		 ch1.New_Method();
	 }
 }
