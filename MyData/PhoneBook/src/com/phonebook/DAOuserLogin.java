package com.phonebook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOuserLogin {

	static Connection con;
	
	public static int loginuser(UserLoginMain C1){
		con = ConnectionProvider.getConnection();
		int status = 0;
		try{
		PreparedStatement pstmt = con.prepareStatement("select * from phonebookuser where username=? and password=?");
		pstmt.setString(1,C1.getUsername());
		pstmt.setString(2, C1.getPassword());
		ResultSet rs =pstmt.executeQuery();
		System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ"+rs);
		if(rs.next())
		status=rs.getInt("userid");
		
		System.out.println("Here Status is :-"+status);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return status;
		
		}
}