public class Calculator {

	double firstN;
	double secondN;
	double resulT;
	Calculator(double fN,double sN){
		
		this.firstN=fN;
		this.secondN=sN;
	}
//	public String toString(){
//		return "Add"+firstN+" "+secondN;
//	}
	public static void main(String[] args) {
		Calculator obj1 = new Calculator(10,14);
		//System.out.println(obj1);
	
	//String operation = "Add";
	//String operation = "Sub";
	//String operation = "Div";
	String operation = "Multi";
	
	switch(operation){
	case "Add":
		obj1.resulT = obj1.firstN + obj1.secondN;
		System.out.println("Addition is "+obj1.resulT);
		break;
	
	case "Sub":
		obj1.resulT = obj1.firstN -obj1.secondN;
		System.out.println("Sub is "+obj1.resulT);
		break;
		
	case "Multi":
		obj1.resulT = obj1.firstN * obj1.secondN;
		System.out.println("Multi is "+obj1.resulT);
		break;
	case "Div":
		obj1.resulT = obj1.firstN / obj1.secondN;
		System.out.println("Div is "+obj1.resulT);
		break;
		
	case "Mod":
		obj1.resulT = obj1.firstN % obj1.secondN;
		System.out.println("Mod is "+obj1.resulT);
		break;
		
		default:
			System.out.println("No ");
		
	}
	
	}
	
}