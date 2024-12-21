package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registercon 
{
	public static int db(RegisterAction r) throws ClassNotFoundException
	{
		int status=0;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11","java","java");
			PreparedStatement ps=conn.prepareStatement("insert into reg values(?,?,?,?,?,?,?)");
			System.out.println(conn);
			ps.setString(1, r.getId());
			ps.setString(2, r.getUname());
			ps.setString(3, r.getPass());
			ps.setString(4, r.getCpass());
			ps.setString(5, r.getMono());
			ps.setString(6, r.getEmail());
			ps.setString(7, r.getCategory());
			
			status=ps.executeUpdate();
			System.out.println(status);
		} 
		
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return status;
	}
}
