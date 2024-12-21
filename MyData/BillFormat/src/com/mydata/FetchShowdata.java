package com.mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FetchShowdata {

	ArrayList<Show> arr1 = new ArrayList<Show>();

	public ArrayList<Show> getArr1() {
		return arr1;
	}

	public void setArr1(ArrayList<Show> arr1) {
		this.arr1 = arr1;
	}
	
	public String execute() throws ClassNotFoundException, SQLException{
		Connection con;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		String url="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
		con=DriverManager.getConnection(url,"HR","password");
		PreparedStatement pstmt = con.prepareStatement("select * from employees");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			
			Show dd= new Show();
			dd.setEmployee_id(rs.getInt(1));
			dd.setSalary(rs.getInt(2));
			dd.setFirst_name(rs.getString(3));
			dd.setLast_name(rs.getString(4));
			arr1.add(dd);
		}
		con.close();
		return "success";
		
		
	}
}
