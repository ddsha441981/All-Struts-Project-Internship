public class MyDate {

	int day;
	int month;
	int year;
	public void showDate(){
		day=24;
		month=05;
		year=2016;
	}
	public void displayDate(){
		System.out.println(day+ " / " + month+ " / " +year);
	}
	public static void main(String args[]){
		
		MyDate md1 = new MyDate();
		md1.displayDate();
		md1.showDate();
		md1.displayDate();
	}
}
