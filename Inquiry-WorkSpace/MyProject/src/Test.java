
public class Test {

	int x,y,z;
	public void sum()
	{
		
		x = 5;
		y=4;
		z=x+y;
	}
	public void show(){
		System.out.println("Sum is : "+ z);
		
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.show();
		test.sum();
		test.show();
	}
}
