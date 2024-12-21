
abstract class Figure {

	double dim1;
	double dim2;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class Rectangle1 extends Figure{
	Rectangle1(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Rectangle is :");
		return dim1*dim2;
	}
}
class Triangle1 extends Figure{
	Triangle1(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Triangle1 is :");
		return dim1*dim2/2;
	}
	
}

// public String toString(){
//	return "Rectangle is "+dim1+ " "+ dim2;
//}
 class AbstractArea{
	public static  void main(String[] args) {
		
		//Figure f1 = new Figure(10,20);
		Rectangle1 r = new Rectangle1(9,5);
			r.area();
			System.out.println(r);
				Triangle1 t = new Triangle1(25,2);
				t.area();
				System.out.println(t);
				
	}
}

