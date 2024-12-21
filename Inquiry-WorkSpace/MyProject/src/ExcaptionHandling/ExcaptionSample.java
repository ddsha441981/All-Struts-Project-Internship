package ExcaptionHandling;//see later

public class ExcaptionSample {
	float n1=20;
	float n2=5;
	float res;
	//String msg="Sorry You cannt divided by Zero";
	
	
	 public void ExcaptionSample(){
		
		simple();
	}
	
	void simple()
	{
		display();
	}
	void display() throws ArithmeticException
	{
		if(n2==0)
			 throw new ArithmeticException();
			
		res=n1/n2;
		//System.out.println(msg);
		System.out.println("res  :"+res);	
	}
//	public String getMessage(){
//		return msg;
//		
//	}
	
	
	public static void main(String[] args) {
		
		ExcaptionSample es = new ExcaptionSample();
		try
		{
			es.ExcaptionSample();
			
		}
		catch(ArithmeticException e1){
			//System.out.println(e1.getMessage());
			System.err.println("Sorry You cannt divided by Zero");
		}
	}

}
