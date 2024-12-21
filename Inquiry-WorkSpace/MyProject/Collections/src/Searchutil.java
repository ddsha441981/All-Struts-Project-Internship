import java.util.ArrayList;
import java.util.Iterator;

public class Searchutil {
	
	public static void main(String[] args) {
		
	}

	public static void  Searchutil(ArrayList<Employee> a1,int id) {
		Iterator<Employee> li = a1.iterator();
		{
			Employee e;
			int flag =0;
			while(li.hasNext()){
				e=li.next();
				if(e.getId()==id){
					flag=1;
					System.out.println("Record found......."+ e);
					
				}
			}
			if(flag==0)
			{
			System.out.println("Record not found.........");
			}
		}
	}

}
