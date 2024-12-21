package ExcaptionHandling;

public class AcctExMainMethod {

	public static void main(String[] args) {
		AcctExcaptionMain at = new AcctExcaptionMain();
		try {
			at.widtdraw(5100);
		} catch (AcctExPrintData e) {
			System.err.println(e.getMessage());
		}
	}
}
