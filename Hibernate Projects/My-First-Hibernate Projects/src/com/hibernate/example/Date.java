package com.hibernate.example;

public class Date {

	int dd,mm,yy;

	
	public Date() {
		super();
	}


	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}


	public int getDd() {
		return dd;
	}


	public void setDd(int dd) {
		this.dd = dd;
	}


	public int getMm() {
		return mm;
	}


	public void setMm(int mm) {
		this.mm = mm;
	}


	public int getYy() {
		return yy;
	}


	public void setYy(int yy) {
		this.yy = yy;
	}
	
	
}
