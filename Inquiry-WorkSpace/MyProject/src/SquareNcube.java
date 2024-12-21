
public class SquareNcube {

	int a=5,res=0;
	public void square(){
		
		res=a*a;
	}
	public void cube(){
		
		res=a*a*a;
	}
	public void squareDis(){
		
		System.out.println("This Valaue Square is :" +res);
	}
	public void cubeDis(){
		
		System.out.println("This Value Cube is: " +res );
	}
	public static void main(String arg[]){
		SquareNcube snc = new SquareNcube();
		snc.square();
		snc.squareDis();
		snc.cube();
		snc.squareDis();
	}
}
