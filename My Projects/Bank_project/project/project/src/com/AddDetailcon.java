   package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDetailcon 
{
	public static int db(AdddetailsAction r) throws SQLException    
	{
		int status=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11","java","java");
			PreparedStatement ps=conn.prepareStatement("insert into drdetails values(?,?,?,?,?)");
			System.out.println(conn);
			ps.setString(1, r.getFname());
			ps.setString(2, r.getLname());
			ps.setString(3, r.getCertificate());
			ps.setString(4, r.getSpecailist());
			ps.setString(5, r.getCountry());
			
			
			status=ps.executeUpdate();
			System.out.println(status);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}

}
