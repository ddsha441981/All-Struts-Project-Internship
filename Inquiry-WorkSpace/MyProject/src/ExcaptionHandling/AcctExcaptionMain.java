package ExcaptionHandling;

public class AcctExcaptionMain {
	int no;
	float balance=5000;
	
	public void widtdraw(float amt) throws AcctExPrintData
	{
		
		if(balance<amt)
			throw new AcctExPrintData();
		balance-=amt;
		System.out.println("Successfully Widthdraw  :"  +amt);
		System.out.println("Balance Left :"  +balance);
		
	}

}
