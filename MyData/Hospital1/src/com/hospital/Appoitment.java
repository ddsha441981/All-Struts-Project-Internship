package com.hospital;

public class Appoitment {
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
	public String toString() {
		return "Appoitment [doctors=" + doctors + ", day=" + day + ", Aname=" + Aname + ", person=" + person
				+ ", relation=" + relation + ", mob=" + mob + ", Aemail=" + Aemail + ", pgender=" + pgender + ", pcity="
				+ pcity + ", qry=" + qry + ", terms=" + terms + "]";
	}
	
	

}
