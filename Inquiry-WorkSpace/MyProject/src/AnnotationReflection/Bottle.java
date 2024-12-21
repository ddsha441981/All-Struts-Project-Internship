package AnnotationReflection;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

@Inherited
@Documented
@interface ClassInfo
{
	String Owner();
	String Comapany();
	float price();
}

@ClassInfo(Owner="Deendayal",Comapany="Bislery",price=100)
public class Bottle {
	
	float price;
	String name;
	@Deprecated
	String brand;
	public Bottle(float price, String name, String brand) {
		
		this.price = price;
		this.name = name;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Bottle [price=" + price + ", name=" + name + ", brand=" + brand
				+ "]";
	}
	
	

}
