package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class AddnewPatient extends ActionSupport implements Myconnection {

	Connection con;
	int npid;
	String npname;
	String npemail;
	String npadd;
	int npno;
	String npgender;
	String npcity;
	String nadmit;
	String ndischarge;
	

	public int getNpid() {
		return npid;
	}


	public void setNpid(int npid) {
		this.npid = npid;
	}


	public String getNpname() {
		return npname;
	}


	public void setNpname(String npname) {
		this.npname = npname;
	}


	public String getNpemail() {
		return npemail;
	}


	public void setNpemail(String npemail) {
		this.npemail = npemail;
	}


	public String getNpadd() {
		return npadd;
	}


	public void setNpadd(String npadd) {
		this.npadd = npadd;
	}


	public int getNpno() {
		return npno;
	}


	public void setNpno(int npno) {
		this.npno = npno;
	}


	public String getNpgender() {
		return npgender;
	}


	public void setNpgender(String npgender) {
		this.npgender = npgender;
	}


	public String getNpcity() {
		return npcity;
	}


	public void setNpcity(String npcity) {
		this.npcity = npcity;
	}


	public String getNadmit() {
		return nadmit;
	}


	public void setNadmit(String nadmit) {
		this.nadmit = nadmit;
	}


	public String getNdischarge() {
		return ndischarge;
	}


	public void setNdischarge(String ndischarge) {
		this.ndischarge = ndischarge;
	}


	@Override
	public String execute() throws Exception {
		PreparedStatement pstmt = con.prepareStatement("insert into AdmitPatient0001 values(?,?,?,?,?,?,?,?,?)");/*AdmitPatient also present AdmitPatient001 also exists using datepicher */
		pstmt.setInt(1, npid);
		pstmt.setString(2, npname);
		pstmt.setString(3, npemail);
		pstmt.setString(4, npadd);
		pstmt.setInt(5, npno);
		pstmt.setString(6, npgender);
		pstmt.setString(7, npcity);
		pstmt.setString(8, nadmit);
		pstmt.setString(9, ndischarge);
		int re = pstmt.executeUpdate();
		System.out.println("Data Successfully inserted" +re);
		
		return SUCCESS;
	}
	

	@Override
	public String toString() {
		return "AddnewPatient [npid=" + npid + ", npname=" + npname + ", npemail=" + npemail + ", npadd=" + npadd
				+ ", npno=" + npno + ", npgender=" + npgender + ", npcity=" + npcity + ", nadmit=" + nadmit
				+ ", ndischarge=" + ndischarge + "]";
	}


	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
