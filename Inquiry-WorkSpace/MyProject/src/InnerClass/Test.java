package InnerClass;

/*class InnerDemo1{  
	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	   
	 void display(){  
	  Inner in=new Inner();  
	  in.msg();  
	 }  
	 public static void main(String args[]){  
		 InnerDemo1 obj=new InnerDemo1();  
	  obj.display();  
	 }  
	}  */
class InnerDemo1
{
	private int data =30;
	
	//inner class start
	class Inner1{
		void msg()
		{
			System.out.println("Hello this method is inner class");
		}
	}
}
 class Test
{
	public static void main(String[] args) {
		
		InnerDemo1 id = new InnerDemo1();
		InnerDemo1.Inner1 in = id.new Inner1();
		in.msg();
	}
}
	
