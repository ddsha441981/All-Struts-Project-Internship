package GenericCLassesNmethoD;

  class Example<T> {
	
	T id;
	
	public void show(T d){
		
		id=d;
		
	}
	public T get(){
		return id;
		
	}
 }
	public class Student {
		public static void main(String[] args) {
			Example<Integer> st = new Example<Integer>();
			Example<String> st1 = new Example<String>();
			Integer ke = new Integer(5);
			st.show(ke);
			st1.show("Deendayal");
			System.out.println("Student Id  :"+st.get()+   "\nName of Student :"  + st1.get());
		}
	}
	

