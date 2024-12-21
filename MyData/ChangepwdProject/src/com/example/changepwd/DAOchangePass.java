package com.example.changepwd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOchangePass {
	
	
static Connection con;
public static int mypwdchange(ChangePassword CP){
	con = ConnectionProvider.getConnection();
	int count = 0;
	try{
		PreparedStatement pstmt = con.prepareStatement("select pwd1 from  changepassword where pwd1=?");
		
		pstmt.setString(2, CP.getPwd1());
		
		count = pstmt.executeUpdate();
		System.out.println("Record found");
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return count;
}

}
