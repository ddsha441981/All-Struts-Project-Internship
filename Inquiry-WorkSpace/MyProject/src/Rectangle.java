
public class Rectangle extends Shape {
	
	Rectangle(double d1,double d2){
		super(d1,d2);
	}
	double area(){
		System.out.println("Rectangle is.......");
		return dim1*dim2;
	}

}
