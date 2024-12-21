package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class Member1 extends ActionSupport implements Myconnection {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	static Connection con;
ArrayList<Mem1> arr = new ArrayList<Mem1>();
	public ArrayList<Mem1> getarr() {
	return arr;
}

public void setarr(ArrayList<Mem1> arr) {
	this.arr = arr;
}

	public String execute() throws Exception {
		System.out.println("Doctor Id : "+id);
		PreparedStatement pstmt;
		ResultSetMetaData rsmd;
		pstmt=con.prepareStatement("select * from Doctors where id=?");
		pstmt.setInt(1, id);
		System.out.println(" Here Doctor Id : "+id);
		ResultSet rs=pstmt.executeQuery();
		 /*rsmd=rs.getMetaData();
		 System.out.println("Coloum Name" +rsmd.getColumnName(1)+" " +rsmd.getColumnName(2)+ " "+ rsmd.getColumnName(3));*/
		
		while(rs.next())
		{
			System.out.println(" Here Doctor Id : "+id);
			Mem1 m1 = new Mem1();
			
			m1.setId(rs.getInt(1));
			m1.setName(rs.getString(2));
			m1.setSkill(rs.getString(3));
			m1.setDay(rs.getString(4));
			m1.setAvailability(rs.getString(5));
			m1.setTime(rs.getString(6));
			m1.setAboutus(rs.getString(7));
			arr.add(m1);
			System.out.println("Hello Deendayal");
		}
		
		
		return SUCCESS;
	}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}