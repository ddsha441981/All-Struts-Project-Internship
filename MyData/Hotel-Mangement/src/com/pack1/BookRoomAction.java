package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;

public class BookRoomAction extends ActionSupport implements EstablishedConnection {
	 
 Connection con;
	
String userName;
int text2;
int text3;
int text4;
String chkin,chkout;





public Connection getCon() {
	return con;
}
public void setCon(Connection con) {
	this.con = con;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getText2() {
	return text2;
}
public void setText2(int text2) {
	this.text2 = text2;
}
public int getText3() {
	return text3;
}
public void setText3(int text3) {
	this.text3 = text3;
}
public int getText4() {
	return text4;
}
public void setText4(int text4) {
	this.text4 = text4;
}
public String getChkin() {
	return chkin;
}
public void setChkin(String chkin) {
	this.chkin = chkin;
}
public String getChkout() {
	return chkout;
}
public void setChkout(String chkout) {
	this.chkout = chkout;
}
public String execute()
{
 
	PreparedStatement pst;
	try
	{
		
	System.out.println("Hello in try block");
	pst=con.prepareStatement("insert into bookroom1 values(?,?,?,?,?,?)");
	pst.setString(1,userName);
	pst.setInt(2,text2);
	pst.setInt(3,text3);
	pst.setInt(4,text4);
	pst.setString(5,chkin);
	pst.setString(6,chkout);
	int res=pst.executeUpdate();
	pst.clearParameters();
	System.out.println("user registered:"+res);
	System.out.println("inserted successfully to the database");
	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return SUCCESS;
}
public void setConnection(Connection con)
{
	this.con=con;
}
}
