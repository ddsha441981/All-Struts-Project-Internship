package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCon 
{
	public static boolean db(Login g)
	{
		boolean status=false;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11","java","java");
				PreparedStatement ps=conn.prepareStatement("select * from Register01 where user1=? and pass=?");
				ps.setString(1,g.getUsername());
				ps.setString(2,g.getPass());
				ResultSet rs=ps.executeQuery();
				status=rs.next();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return status;
}
}
