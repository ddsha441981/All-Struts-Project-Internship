package com.phonebook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOUserProfileSource {
		static Connection con;
		public static int saveUserProfile(UserProfileSourceMain P1){
			con=ConnectionProvider.getConnection();
			int status=0;
			try{
				PreparedStatement pstmt1 = con.prepareStatement("insert into phonebookuser values(seq.nextval,?,?,?,?,?,?)");
				
				pstmt1.setString(1, P1.getUsername());
				pstmt1.setString(2, P1.getFirstname());
				pstmt1.setString(3, P1.getLastname());
				pstmt1.setString(4, P1.getEmail());
				pstmt1.setString(5, P1.getPassword());
				pstmt1.setString(6, P1.getCfpassword());
				status=pstmt1.executeUpdate();
				System.out.println("User Records Inserted "+status);
			
			}catch(SQLException e){
				e.printStackTrace();	
			}
			return status;
		}
		
		public static UserProfileSourceMain contactfetch(int id){
			con = ConnectionProvider.getConnection();
			int status=0;
			UserProfileSourceMain P1 = new UserProfileSourceMain();
			try{
				PreparedStatement pstmt = con.prepareStatement("select * from phonebookuser where id =?");
				pstmt.setInt(1, id);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next())
				{
					
					P1.setUserid(rs.getInt(1));
					P1.setUsername(rs.getString(2));
					P1.setFirstname(rs.getString(3));
					P1.setLastname(rs.getString(4));
					P1.setEmail(rs.getString(5));
					P1.setPassword(rs.getString(6));
					P1.setCfpassword(rs.getString(7));
					
				
				}
				System.out.println("Record Fetch ByUsingId"+P1);
				
			}catch(SQLException e){
				e.printStackTrace();	
			}
			return P1;
			
		}
}
