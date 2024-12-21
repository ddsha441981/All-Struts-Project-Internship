package com.Ajax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOGroup {
	static Connection con;
	public static ArrayList<AjaxCall> viewdataOfGroup(String Bid){
		
		ArrayList<AjaxCall> view = new ArrayList<AjaxCall>();
		con = ConnectionProvider.getConnection();
		try{

			
			PreparedStatement pstmt = con.prepareStatement("select * from group111 where Bid=?");
			pstmt.setString(1, Bid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				AjaxCall vi = new AjaxCall();
				vi.setGroupId(rs.getInt(1));
				vi.setGroup_name(rs.getString(2));
				vi.setBid(rs.getString(3));
				view.add(vi);
				
				System.out.println("After Selected Group Id From Database :    " +rs.getInt(1));
				System.out.println("After Selected record  of Group Name From DB : "  +rs.getString(2));
				
				System.out.println("Batch Id is "+rs.getString(3));
				
				//System.out.println("All recorded Fetch of Group Show in To String :- "+view.toString());
			
			}
			
			
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		
		return view;
		
	}
}
