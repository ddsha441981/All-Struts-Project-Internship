package com.hibernate.example;

public class Customer {

	int cid;
	String cname;
	Date dat;
	
	
	public Customer() {
		super();
	}

	public Customer(int cid, String cname, Date dat) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.dat = dat;
	}

	public Date getDat() {
		return dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
}
