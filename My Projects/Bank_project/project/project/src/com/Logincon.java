package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Logincon
{
	static String type="error";
	public static String db(LoginAction g)
	{
		@SuppressWarnings("unused")
		boolean status=false;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11","java","java");
				System.out.println(conn);
				PreparedStatement ps=conn.prepareStatement("select * from reg where uname=? and pass=?");
				ps.setString(1,g.getUname());
				ps.setString(2,g.getUpass());
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					
					
					type=rs.getString("category");
					System.out.println(type);
				}
				
			}
		
			catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				return type;
			}	
			} 
			catch (SQLException e) 
			{
			
				e.printStackTrace();
				return type;
			}
		return type;
	

	}
}
