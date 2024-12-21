package ExcaptionHandling;

import java.util.Scanner;

public class ExcaptionHandle {

	float n1, n2, res;

	 ExcaptionHandle() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two No....");

		this.n1 = sc.nextFloat();
		this.n2 = sc.nextFloat();

	}

	public static void main(String[] args) {

		ExcaptionHandle ex = new ExcaptionHandle();
		try {

			if (ex.n2 == 0)

				throw new ArithmeticException();
			if(ex.n2<0)
				throw new NumberFormatException();
			ex.res = ex.n1 / ex.n2;
			
			System.out.println("Now Division is :" + ex.res);
		} catch (ArithmeticException e) {

			System.err.println("Number cannot be divided by Zero");
		}
		catch(NumberFormatException n){
			System.err.println("Negative Number cannot be Divided");
		}
	}
}
