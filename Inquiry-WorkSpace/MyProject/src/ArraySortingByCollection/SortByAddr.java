package ArraySortingByCollection;

import java.util.Comparator;

public class SortByAddr implements Comparator<Student> {

	@Override
	public int compare(Student a1, Student a2) {
		
		return a1.getAddres().compareTo(a2.getAddres());
	}

}
