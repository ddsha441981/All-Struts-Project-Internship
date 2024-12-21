public class ArrFirst {
	int day;
	int month;
	int year;

	ArrFirst(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	public static void swap(ArrFirst dArr[]) {

		ArrFirst temp;
		temp = dArr[0];
		dArr[0] = dArr[1];
		dArr[1] = temp;
	}
	public String toString(){
		
		return day + " " + month + " " + year;
		
	}

	public static void main(String args[]) {
		ArrFirst dt[] = new ArrFirst[2];
		dt[0] = new ArrFirst(15, 05, 2010);
		dt[1] = new ArrFirst(20, 10, 2000);
		System.out.println("Before Swaping :" + dt[0] + "<><>" + dt[1]);
		swap(dt);
		System.out.println("After Swaping :" + dt[0] + "<><>" + dt[1]);
	}
}
