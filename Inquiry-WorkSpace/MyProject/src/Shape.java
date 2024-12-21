abstract class Shape {
double dim1;
double dim2;
	 Shape(double d1,double d2) {
		
d1=dim1;
d2=dim2;
	}
	abstract double area();
}
class AbstractClass{
	public static void main(String args[]){
		Shape c1 = new Circle(1,2);//object created
		c1.area();
	}
}
