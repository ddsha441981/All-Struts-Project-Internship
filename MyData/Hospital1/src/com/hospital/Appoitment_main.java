package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class Appoitment_main extends ActionSupport implements Myconnection {

	static Connection con;
	//Appoitment appoit;
	int id;
	String doctors;
	String day;
	String Aname;
	String person;
	String relation;
	int mob;
	String Aemail;
	String pgender;
	String pcity;
	String qry;
	String terms;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDoctors() {
		return doctors;
	}
	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public String getAemail() {
		return Aemail;
	}
	public void setAemail(String aemail) {
		Aemail = aemail;
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
	public String getQry() {
		return qry;
	}
	public void setQry(String qry) {
		this.qry = qry;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	@Override
	public String execute() throws Exception {
		PreparedStatement pstmt = con.prepareStatement("insert into Appoitment0121 values(?,?,?,?,?,?,?,?,?,?,?,?)");
		/*pstmt.setString(1, appoit.doctors);
		pstmt.setString(2, appoit.day);
		pstmt.setString(3, appoit.Aname);
		pstmt.setString(4, appoit.person);
		pstmt.setString(5, appoit.relation);
		pstmt.setInt(6, appoit.mob);
		pstmt.setString(7, appoit.Aemail);
		pstmt.setString(8, appoit.pgender);
		pstmt.setString(9, appoit.pcity);
		pstmt.setString(10, appoit.qry);
		pstmt.setString(11, appoit.terms);*/
		pstmt.setInt(1, id);
		pstmt.setString(2, doctors);
		pstmt.setString(3, day);
		pstmt.setString(4, Aname);
		pstmt.setString(5, person);
		pstmt.setString(6, relation);
		pstmt.setInt(7, mob);
		pstmt.setString(8, Aemail);
		pstmt.setString(9, pgender);
		pstmt.setString(10, pcity);
		pstmt.setString(11,qry);
		pstmt.setString(12,terms);
		int r1 = pstmt.executeUpdate();
		System.out.println("Successfully Row Inserted"+r1);
		
		
		return SUCCESS;
	}
	
	
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
