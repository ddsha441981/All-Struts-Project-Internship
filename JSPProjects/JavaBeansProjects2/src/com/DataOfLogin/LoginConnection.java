package com.DataOfLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public  class LoginConnection {

	
	public  void connect() 
	{

		Connection con;
		PreparedStatement pstmt;
		Statement stmt;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
		/*String user = "HR";
		String password = "password";*/ //both method
		Properties p = new  Properties();
		p.put("user", "HR");
		p.put("password", "password");
		
			con = DriverManager.getConnection(url, p);
		
		stmt=con.createStatement();
		System.out.println("Connection Established Successfully");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
