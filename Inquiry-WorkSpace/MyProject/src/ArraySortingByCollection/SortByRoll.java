package ArraySortingByCollection;

public class SortByRoll implements Comparable<Student>{

	
	@Override
	public int compareTo(Student r1) {
		if(r1.getId()>r1.rollN)
			return 1;
	else if(r1.getId()<r1.rollN)
		return -1;
	else
		return 0;
	}

}
