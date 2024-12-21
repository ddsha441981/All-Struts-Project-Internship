import java.util.Comparator;
import java.util.HashSet;

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	HashSet<String> skill;
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public Employee(int id, String name, HashSet<String> skill) {
		
		this.id = id;
		this.name = name;
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", skill=" + skill
				+ "]";
	}
	
	public int compareTo(Employee c1) {
		if(this.id>c1.id)
			return 1;
	else if(this.id<c1.id)
		return -1;
	else
		return 0;
	}
	
	
	

}
