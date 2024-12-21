
public class Triangle extends Shape {
	
	Triangle(double d1,double d2){
		super(d1,d2);
	}
	double area(){
		System.out.println("Triangle is.......");
		return dim1*dim2/2;
	}

}
