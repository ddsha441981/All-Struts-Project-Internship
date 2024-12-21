package ArraySortingByCollection;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student n1, Student n2) {
	
		return n1.getName().compareTo(n2.getName());
	}
	

}
