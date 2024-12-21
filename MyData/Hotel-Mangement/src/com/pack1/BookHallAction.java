package com.pack1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class BookHallAction extends ActionSupport implements EstablishedConnection{
String text1,select1,radio;
int text2;
String date1;
Connection con;

public void setText1(String text1) {
	this.text1 = text1;
}

public String getSelect1() {
	return select1;
}

public void setSelect1(String select1) {
	this.select1 = select1;
}



public String getRadio() {
	return radio;
}

public void setRadio(String radio) {
	this.radio = radio;
}

public int getText2() {
	return text2;
}

public void setText2(int text2) {
	this.text2 = text2;
}


public String getDate1() {
	return date1;
}

public void setDate1(String date1) {
	this.date1 = date1;
}

public String execute()
{
 
	PreparedStatement pst;
	try
	{
		
	System.out.println("Hello in try block");
	pst=con.prepareStatement("insert into BookHall2 values(?,?,?,?,?)");
	pst.setString(1,text1);
	pst.setInt(2,text2);
	pst.setString(3,select1);
	pst.setString(4,radio);
	pst.setString(5,date1);


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
	public void setConnection(Connection con) {

		this.con=con;
	}

}
