import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee w1, Employee w2) {
		
		
		return w1.getName().compareTo(w2.getName());
	}

}
