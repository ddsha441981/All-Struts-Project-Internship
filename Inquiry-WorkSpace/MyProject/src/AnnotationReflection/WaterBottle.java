package AnnotationReflection;

public class WaterBottle extends Bottle {
	
	String  company;
	
	@ClassInfo(Owner="Deendayal",Comapany="Bislery",price=100)
	
	public WaterBottle(float price, String name, String brand) {
		super(price, name, brand);
		
	}


	public static void main(String[] args) {
		
		Bottle b1 = new Bottle(100, "Beslery", "Bes");
		System.out.println(b1);
	}

}
