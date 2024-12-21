public class Radius {

	double r = 3, res = 0,res1=0;

	public void init() {

		res=3.14*r*r;
		res1=2*3.14*r*r;
	}
	public void dispaly(){
		System.out.println(" Radius value is : "+res+ " Next is : "  + res1);
	}
	public static void main(String args[]){
		Radius r1 = new Radius();
		r1.dispaly();
		r1.init();
		r1.dispaly();
	}
}
