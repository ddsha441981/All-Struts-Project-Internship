package ArraySortingByCollection;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> s1 = new ArrayList<Student>();
		s1.add(new Student(105, "Deendayal", 18, "Java", "Pune", 01/06/1993));
		s1.add(new Student(102, "Ratan", 20, "C" ,"ChatishGargh", 06/04/1990));
		s1.add(new Student(101, "Sumit", 6, "PHP" ,"Nagpur", 06/04/1990));
		s1.add(new Student(109, "Nitin", 7, "C++" ,"Chakan", 06/04/1990));
		s1.add(new Student(114, "Bala", 2, "Visual" ,"Mumbai", 06/04/1990));
		
		for (Student st : s1) {
			
			
			Collections.sort(s1, new SortByName());
		}
		System.out.println("Sort By Name");
		System.out.println(s1);
		System.out.println("Sort By Address");
		Collections.sort(s1, new SortByAddr());
		System.out.println(s1);
//		for (Student st : s1) {
//			
//			
//		}
		
		//Collections.sort(s1,new SortById());
		//Collections.sort(s1, new SortByName());
		//Collections.sort(s1, new SortByAddr());
		//Collections.sort(s1, new SortByRoll());
		//Collections.sort(s1, new SortBySub());
		
		
	}


}
