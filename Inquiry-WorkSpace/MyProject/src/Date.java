 class Date implements Printable {
	int day,month,year;
	Date(int dd,int mm,int yy){
		
		day=dd;
		month=mm;
		year=yy;
	}
	public void print(){
		System.out.println("Date is :"+day+ "/ " +month+ "/"+year);
	}

}
