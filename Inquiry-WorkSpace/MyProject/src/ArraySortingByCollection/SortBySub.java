package ArraySortingByCollection;

import java.util.Comparator;

public class SortBySub implements Comparator<Student>{

	@Override
	public int compare(Student su1, Student su2) {
		
		return su1.getSub().compareTo(su2.getSub());
	}

}
