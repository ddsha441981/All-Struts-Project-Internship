package ExcaptionHandling;
import java.util.Scanner;
public class ExcaptionHand {

	float n1,n2,res;
	
	void ExcaptionHand(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number........");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		
		if(n2==0)
		
		throw new ArithmeticException();
		
		if(n2<0)
			throw new NumberFormatException();
		res=n1/n2;
		
		System.out.println("Now DIvision is :" +res);
	}
	public static void main(String[] args) {
		ExcaptionHand ex = new ExcaptionHand();
		
		try{
		ex.ExcaptionHand();
		}
		
		catch(ArithmeticException e){
			System.err.println("Number cann't divided by Zero");
			
		}
		catch(NumberFormatException n){
			System.err.println("Nagative Number cann't allowed ");
		}
	}
}
