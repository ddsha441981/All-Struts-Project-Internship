package ExcaptionHandling;

import java.util.Scanner;

public class ExcaptionBankAccount {
	String name;
	float amount;
	float balance = 500;

	void ExcaptionBankAccount() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name Amount");
		name = sc.next();
		amount = sc.nextFloat();
		// balance = sc.nextFloat();
	}

	void deposit() {
			
		if (amount > 50000) 
			
			throw new ArithmeticException();//Excaption Handling
			
			
		 
			System.out.println("Your balance successfully updated");
			balance += amount;
			
		
	}

	

	void widthdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name Amount");
		//name = sc.next();
		amount = sc.nextFloat();
		if (amount <500) 
		
			throw new NumberFormatException();
			
			//System.out.println("your balance is left :"+balance);
		
		
		
			
			System.out.println("You widtdraw :- " +amount  +  "   Collect your amount");
			balance -= amount;

	}
	void balanceprint(){
		System.out.println("Your Balance is :"+balance);
	}
	
	public static void main(String[] args) {
		
		ExcaptionBankAccount eba = new ExcaptionBankAccount();
		eba.ExcaptionBankAccount();
		try{
		eba.deposit();
		eba.balanceprint();
		}
		
		catch(ArithmeticException e){
			System.err.println("You can't deposit above 50000 without Pan No ");
			
		}
		
		try{
			eba.widthdraw();
			eba.balanceprint();
		}
		
		
		catch(NumberFormatException n1){
			System.err.println("You can't withdraw under 500");
			
		}
		
	}
}
