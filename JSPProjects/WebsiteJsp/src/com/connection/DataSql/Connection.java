package com.connection.DataSql;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class Connection {
	Connection con;
	Statement stmt;
	//ResultSet rs;
	//PreparedStatement pstmt;
	

	try 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
	String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
	Properties p = new Properties();
	p.put("user", "HR");
	p.put("password","password");
	con=DriverManager.getConnection(url,p);
	stmt=con.createStatement();
	} 
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Connection Successfully..........");
}
