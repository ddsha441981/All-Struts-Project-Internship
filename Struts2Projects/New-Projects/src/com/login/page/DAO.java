package com.login.page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO implements GConnection{
	
	//;Login obj;
	 Connection con;
	
	static int fireQuery(Login obj1) throws SQLException
	{
		Connection con=null;
		PreparedStatement pstmt;
		Statement stmt;
		ResultSet rs;
		System.out.println("In execute Methods+++++++++++++++++++");
		pstmt=con.prepareStatement("insert into tryout value(?)");
		pstmt.setString(1,obj1.getUser());
		int r1 = pstmt.executeUpdate();
		System.out.println("Row Successfully Inserted"+r1);
		return r1;
		
	}

	@Override
	public void getconnection(Connection con) {
		this.con=con;
		
	}
}
