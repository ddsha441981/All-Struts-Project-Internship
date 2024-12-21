package MVC;

public class Client {

	public static void main(String[] args) {
		ViewGui vg = new ViewGui();
		Controller_Listener cl = new Controller_Listener(vg);
		ModelLink m1 = new ModelLink(vg, cl);
		
	}
}
