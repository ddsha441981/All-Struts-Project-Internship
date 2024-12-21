package com.pack1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class BookTableAction extends ActionSupport implements EstablishedConnection{
Connection con;
String text1,select1;
int text2,text3;
String date1;

	public String getText1() {
	return text1;
}

public void setText1(String text1) {
	this.text1 = text1;
}

public String getSelect1() {
	return select1;
}

public void setSelect1(String select1) {
	this.select1 = select1;
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
	pst=con.prepareStatement("insert into BookTable1 values(?,?,?,?,?)");
	pst.setString(1,text1);
	pst.setInt(2,text2);
	pst.setInt(3,text3);
	pst.setString(4,select1);
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
public void setConnection(Connection con)
{
	this.con=con;
}

}
