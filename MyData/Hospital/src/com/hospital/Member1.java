package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class Member1 extends ActionSupport implements Myconnection {
	static Connection con;
ArrayList<Mem1> list1 = new ArrayList<Mem1>();
	public ArrayList<Mem1> getList1() {
	return list1;
}

public void setList1(ArrayList<Mem1> list1) {
	this.list1 = list1;
}

	public String execute() throws Exception {
		Statement stmt;
		ResultSet rs;
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from doctors");
		rs.next();
		System.out.println("data is"+rs.getRow());
		
		return SUCCESS;
	}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
