public class First {

	int a=5,b=10,c;
	public void sum(){
		c=a+b;
	}
	public void display(){
		System.out.println(" "+c);
	}
	public  static void main(String args[]){
		First f1=new First();
		f1.sum();
		f1.display();
	}
}
