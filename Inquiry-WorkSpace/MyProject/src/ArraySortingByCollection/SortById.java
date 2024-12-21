package ArraySortingByCollection;

public class SortById implements Comparable<Student> {

	

	@Override
	public int compareTo(Student I) {
		
		if(I.getId()>I.id)
			return 1;
	else if(I.getId()<I.id)
		return -1;
	else
		return 0;
	}

}
