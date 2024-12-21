package com.data.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Database {

	Ldata d1 = new Ldata();
	
	public static  int mydatabase(Ldata d1) 
	{
		System.out.println("in method");
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		int status =0;
		
	try {
		System.out.println("in Try catch");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
			Properties p = new Properties();
			p.put("user", "HR");
			p.put("password","password");
			con=DriverManager.getConnection(url,p);
			System.out.println("Connection Successfully");
/*##########################################################################################################################################*/	
			//String sql ="insert into mydata values(??)";
			/*pstmt = con.prepareStatement("insert into login values(?,?)");//This code insert data into data base
			pstmt.setString(1, d1.getUser());
			pstmt.setString(2,d1.getPwd());
			status = pstmt.executeUpdate();
			System.out.println("hello"+status);*/
/*##########################################################################################################################################*/			
			
			pstmt = con.prepareStatement("select * from login ");//Retrive data from Data base
			rs = pstmt.executeQuery();
			System.out.println("Statement Executed");
		while(rs.next())
		{
			d1.setUser(rs.getString(1));
			d1.setPwd(rs.getString(2));
			System.out.println("hello"+d1);
		}
/*##########################################################################################################################################*/				
		
	} 

	catch (Exception e) 
		{
			
			e.printStackTrace();
		} 
		return status;
	}
	
}
