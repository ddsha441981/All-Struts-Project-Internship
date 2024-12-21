
public class Mydat {

	int day,month,year;
	Mydat(){
		day = month = year = 0;
		
	}
	
	Mydat(int d,int m,int y){
		day=d;
		month=m;
		year=y;	
	}
	public String tostring (){
		return day+ " " +month + " " +year;
	}
	public static void main(String args[]){
	
		Mydat d1 = new Mydat();//No constructor will be called
		System.out.println(d1);
		Mydat d2 = new Mydat(25,05,2016);//Constructor will be called
		System.out.println(d2);
	}
}
