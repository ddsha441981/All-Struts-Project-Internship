package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class Penquiry extends ActionSupport implements Myconnection {
static Connection con;
PreparedStatement pstmt;
int pid;
String pname;
String pemail;
String padd;
int pno;
String pgender;
String pcity;
String pques;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPemail() {
	return pemail;
}
public void setPemail(String pemail) {
	this.pemail = pemail;
}
public String getPadd() {
	return padd;
}
public void setPadd(String padd) {
	this.padd = padd;
}
public int getPno() {
	return pno;
}
public void setPno(int pno) {
	this.pno = pno;
}
public String getPgender() {
	return pgender;
}
public void setPgender(String pgender) {
	this.pgender = pgender;
}
public String getPcity() {
	return pcity;
}
public void setPcity(String pcity) {
	this.pcity = pcity;
}
public String getPques() {
	return pques;
}
public void setPques(String pques) {
	this.pques = pques;
}


@Override
	public String execute() throws Exception {
		pstmt=con.prepareStatement("insert into enquiry1 values(?,?,?,?,?,?,?,?)");//same table available enquiry1
		pstmt.setInt(1, pid);
		pstmt.setString(2, pname);
		pstmt.setString(3, pemail);
		pstmt.setString(4, padd);
		pstmt.setInt(5, pno);
		pstmt.setString(6, pgender);
		pstmt.setString(7, pcity);
		pstmt.setString(8, pques);
		int r1= pstmt.executeUpdate();
		System.out.println("Data Successfully Inserted"+r1);
		
		return SUCCESS;
	}
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
