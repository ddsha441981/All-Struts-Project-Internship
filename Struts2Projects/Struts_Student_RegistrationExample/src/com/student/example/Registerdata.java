package com.student.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Registerdata extends ActionSupport implements EstablishConnection {

Connection con;
PreparedStatement pstmt;
Statement stmt;
ResultSet rs;
int sid;
String sname;
String pwd;
String cpwd;
String gender;
String email;
String city;
String add;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getCpwd() {
	return cpwd;
}
public void setCpwd(String cpwd) {
	this.cpwd = cpwd;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}

@Override
	public String execute() throws Exception {
	System.out.println("In execute Methods");
	pstmt=con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?)");
	pstmt.setInt(1, sid);
	pstmt.setString(2, sname);
	pstmt.setString(3, pwd);
	pstmt.setString(4, cpwd);
	pstmt.setString(5, gender);
	pstmt.setString(6, email);
	pstmt.setString(7, city);
	pstmt.setString(8, add);
	
	int r1 = pstmt.executeUpdate();
	System.out.println("Row Successfully Inserted"+r1);
	
/*####################################################################################################################################*/	
	
	return SUCCESS;
	}
@Override
public void getconnection(Connection con) {
	this.con=con;
	
}

}
