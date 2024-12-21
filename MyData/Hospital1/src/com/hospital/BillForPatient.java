package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class BillForPatient extends ActionSupport implements Myconnection {
	Connection con;
	int Bid;
	String Bname;
	String treatment;
	String Rdoc;
	int mdc;
	int price;
	int qunt;
	String Bgender;
	String Bcity;
	String Badmit;
	String Bdischarge;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getRdoc() {
		return Rdoc;
	}
	public void setRdoc(String rdoc) {
		Rdoc = rdoc;
	}
	public int getMdc() {
		return mdc;
	}
	public void setMdc(int mdc) {
		this.mdc = mdc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQunt() {
		return qunt;
	}
	public void setQunt(int qunt) {
		this.qunt = qunt;
	}
	public String getBgender() {
		return Bgender;
	}
	public void setBgender(String bgender) {
		Bgender = bgender;
	}
	public String getBcity() {
		return Bcity;
	}
	public void setBcity(String bcity) {
		Bcity = bcity;
	}
	public String getBadmit() {
		return Badmit;
	}
	public void setBadmit(String badmit) {
		Badmit = badmit;
	}
	public String getBdischarge() {
		return Bdischarge;
	}
	public void setBdischarge(String bdischarge) {
		Bdischarge = bdischarge;
	}
	
	
	@Override
	public String execute() throws Exception {
		PreparedStatement pstmt=con.prepareStatement("insert into BillforPatient values(?,?,?,?,?,?,?,?,?,?,?)");
		pstmt.setInt(1,Bid);
		pstmt.setString(2, Bname);
		pstmt.setString(3, treatment);
		pstmt.setString(4,Rdoc);
		pstmt.setInt(5, mdc);
		pstmt.setInt(6, price);
		pstmt.setInt(7, qunt);
		pstmt.setString(8, Bgender);
		pstmt.setString(9, Bcity);
		pstmt.setString(10, Badmit);
		pstmt.setString(11, Bdischarge);
		int dd=pstmt.executeUpdate();
		System.out.println("Data Inserted Successfully"+dd);
		
		return SUCCESS;
	}
	
	@Override
	public String toString() {
		return "BillForPatient_G_S [Bid=" + Bid + ", Bname=" + Bname + ", treatment=" + treatment + ", Rdoc=" + Rdoc
				+ ", mdc=" + mdc + ", price=" + price + ", qunt=" + qunt + ", Bgender=" + Bgender + ", Bcity=" + Bcity
				+ ", Badmit=" + Badmit + ", Bdischarge=" + Bdischarge + "]";
	}
	public void getconnection(Connection con) {
		this.con=con;
		
	}

	
	
	
	
}
