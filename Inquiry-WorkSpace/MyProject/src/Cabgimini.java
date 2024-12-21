
public class Cabgimini {
	public static void main(String[] args) {
		
		CompanyEmployee cemp1 = new CompanyEmployee("D10A","nitin",50000,"Java");
		cemp1.welcome();
		cemp1.company_data();
		System.out.println(cemp1);
		cemp1.thank();
		
		CompanyManager cmgr1 = new CompanyManager("D10","deendayal",600000,"All Technology","Owner");
		cemp1.welcome();
		cemp1.company_data();
		System.out.println(cmgr1);
		cemp1.thank();
		
		CompanyProgrammer pgr = new CompanyProgrammer("D10","ratan",600000,"Java Technology");
		cemp1.welcome();
		cemp1.company_data();
		System.out.println(pgr);
		cemp1.thank();
		

		CompanyTester tes = new CompanyTester("D10","sunil",600000,"Java Technology");
		cemp1.welcome();
		cemp1.company_data();
		System.out.println(tes);
		cemp1.thank();
		
		CompanyAccountant caco = new CompanyAccountant("D10","mukesh",600000,"Faniance");
		cemp1.welcome();
		cemp1.company_data();
		System.out.println(caco);
		cemp1.thank();
		
		CompanyDatabase dat = new CompanyDatabase("D10","Sanjay",600000,"Oracle");
		cemp1.welcome();
		cemp1.company_data();
		System.out.println(dat);
		cemp1.thank();
		
		
	}

}
