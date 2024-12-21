package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class AddNewEmployees extends ActionSupport implements Myconnection {
Connection con;
	
int eid;
String ename;
String pass;
String eemail;
int eno;
String egender;
String ecriteria;
String ecity;
int esalary;
String eadd;
String aboutE;

public int getEid() {
	return eid;
}


public void setEid(int eid) {
	this.eid = eid;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public String getPass() {
	return pass;
}


public void setPass(String pass) {
	this.pass = pass;
}


public String getEemail() {
	return eemail;
}


public void setEemail(String eemail) {
	this.eemail = eemail;
}


public int getEno() {
	return eno;
}


public void setEno(int eno) {
	this.eno = eno;
}


public String getEgender() {
	return egender;
}


public void setEgender(String egender) {
	this.egender = egender;
}


public String getEcriteria() {
	return ecriteria;
}


public void setEcriteria(String ecriteria) {
	this.ecriteria = ecriteria;
}


public String getEcity() {
	return ecity;
}


public void setEcity(String ecity) {
	this.ecity = ecity;
}


public int getEsalary() {
	return esalary;
}


public void setEsalary(int esalary) {
	this.esalary = esalary;
}


public String getEadd() {
	return eadd;
}


public void setEadd(String eadd) {
	this.eadd = eadd;
}


public String getAboutE() {
	return aboutE;
}


public void setAboutE(String aboutE) {
	this.aboutE = aboutE;
}


@Override
	public String execute() throws Exception {
		PreparedStatement pstmt=con.prepareStatement("insert into Employees0111 values(?,?,?,?,?,?,?,?,?,?,?)");
		pstmt.setInt(1, eid);
		pstmt.setString(2, ename);
		pstmt.setString(3, pass);
		pstmt.setString(4, eemail);
		pstmt.setInt(5, eno);
		pstmt.setString(6, egender);
		pstmt.setString(7, ecriteria);
		pstmt.setString(8, ecity);
		pstmt.setInt(9, esalary);
		pstmt.setString(10, eadd);
		pstmt.setString(11, aboutE);
		int h1=pstmt.executeUpdate();
		System.out.println("Data Successfully Inserted"+h1);
		
		return SUCCESS;
	}


	@Override
public String toString() {
	return "AddNewEmployees [eid=" + eid + ", ename=" + ename + ", pass=" + pass + ", eemail=" + eemail + ", eno=" + eno
			+ ", egender=" + egender + ", ecriteria=" + ecriteria + ", ecity=" + ecity + ", esalary=" + esalary
			+ ", eadd=" + eadd + ", aboutE=" + aboutE + "]";
}


	public void getconnection(Connection con) {
		this.con=con;
		
	}
	

}
