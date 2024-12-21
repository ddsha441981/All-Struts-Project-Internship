package ExcaptionHandling;

public class AcctExPrintData extends Exception {
	String msg="Low Balance.............";
	
	public String getMessage(){
		return msg;
		
	}

}
