public class BPower {

	float base = 5;
	float power = 3;
	float res = 1;

	public void init() {

		res = res * base;
	}

	public void display() {

		System.out.println(" " + res);
	}
	public static void main(String args[]){
		
		BPower bp1 = new BPower();
		bp1.display();
		bp1.init();
		bp1.display();
	}
}
