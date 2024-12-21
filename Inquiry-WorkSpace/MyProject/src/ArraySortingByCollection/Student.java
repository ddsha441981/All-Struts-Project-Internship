package ArraySortingByCollection;

public class Student {
	int id;
	String name;
	int rollN;
	String sub;
	String addres;
	double dob;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public int getRollN() {
		return rollN;
	}
	public double getDob() {
		return dob;
	}
	public String getAddres() {
		return addres;
	}
	public String getSub() {
		return sub;
	}
	
	public Student(int id, String name, int rollN, String sub, String addres,
			double dob) {
		
		this.id = id;
		this.name = name;
		this.rollN = rollN;
		this.sub = sub;
		this.addres = addres;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "\n\tStudent [id=" + id + ", name=" + name + ", rollN=" + rollN
				+ ", sub=" + sub + ", addres=" + addres + ", dob=" + dob + "]";
	}
//	@Override
//	public int compareTo(Student I)
//	{
//		
//			if(this.id>I.id)
//				return 1;
//		else if(this.id<I.id)
//			return -1;
//		else
//			return 0;
//		
//	}
	

}
