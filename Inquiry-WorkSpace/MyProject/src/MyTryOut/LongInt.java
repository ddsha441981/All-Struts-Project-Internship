package MyTryOut;

public class LongInt {

	int i=50;
	 long l=120;
	
	void display()
	{
		
		//c=(int) (a+b);
		
		//System.out.println(i);
		i=(int) l;//typecasting i assign long to integer
		
		System.out.println(i);
	}
	public static void main(String[] args) {
		LongInt li = new LongInt();
		
		li.display();
	}
}
