class Student_Detail extends Seed_Student implements Student, Detail {

	int St_id;
	String name;
	String course_code;

	Student_Detail(int sid, String n, String cc) {
		St_id = sid;
		name = n;
		course_code = cc;
	}
	public String toString(){
		return "Student Id  " +St_id+ "   Student Name  " +name+ "  Course Code   " +course_code; 
	}
public static void main(String[] args) {
	
	Student_Detail obj = new Student_Detail(101,"Deendayal","SPIC");
	System.out.println(obj);
	Seed_Student ob1 = new Seed_Student();
	ob1.data1();
	ob1.data2();
}
}

