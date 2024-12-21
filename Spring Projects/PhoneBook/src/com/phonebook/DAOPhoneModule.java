package com.phonebook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DAOPhoneModule {

	static Connection con;
	public static int contactSave(PhoneModule A1){
		con=ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("select mobile from phonebook where mobile=?");
			pstmt.setString(1, A1.getMobile());
		
			ResultSet rs=pstmt.executeQuery();
			
			boolean recordFound = rs.next();
			
			if(recordFound)
			{
				System.out.println("Found");
				System.out.println("Record Existing Another Number Save"+recordFound);
				/* msg="<div class='alert alert-success'><strong>Success!</strong> successful Contact Save.</div>";*/
			}
		
		else{
			System.out.println("Not Found");
			PreparedStatement pstmt1 = con.prepareStatement("insert into phonebook values(seq.nextval,?,?,?)");
			
			pstmt1.setString(1, A1.getName());
			pstmt1.setString(2, A1.getMobile());
			pstmt1.setString(3, A1.getEmail());
			status=pstmt1.executeUpdate();
			System.out.println("Records Inserted "+status);
		
		}
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
		
	}
			
	
	
	
	public static ArrayList<PhoneModule> contactsAll(PhoneModule CA1){
		ArrayList<PhoneModule> list = new ArrayList<PhoneModule>();
		con = ConnectionProvider.getConnection();
		int status=0;
		try{

			
			PreparedStatement pstmt = con.prepareStatement("select * from phonebook");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				PhoneModule pm = new PhoneModule();
				pm.setId(rs.getInt(1));
				pm.setName(rs.getString(2));
				pm.setMobile(rs.getString(3));
				pm.setEmail(rs.getString(4));
				list.add(pm);
			}
			System.out.println("All recorded Fetch"+list);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		System.out.println("Status is "+status);
		return list;
		
		
	}
	
	public static int contactdelete(int id){
		con=ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("delete from phonebook where id =?");
			pstmt.setInt(1, id);
			
			status=pstmt.executeUpdate();
			System.out.println("Records deleted "+status);
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return status;
	}
	
	
	public static ArrayList<PhoneModule> searchByMobile(String searchBy ,String selectoption){
		ArrayList<PhoneModule> list = new ArrayList<PhoneModule>();
		con = ConnectionProvider.getConnection();
		int status=0;
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from phonebook where "+selectoption+" like '%"+searchBy+"%' ");
			System.out.println("Here search is :---"+searchBy);
			System.out.println("select * from phonebook where "+selectoption+" like '%"+searchBy+"%'");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				PhoneModule pm = new PhoneModule();
				pm.setId(rs.getInt(1));
				pm.setName(rs.getString(2));
				pm.setMobile(rs.getString(3));
				pm.setEmail(rs.getString(4));
				list.add(pm);
			}
			System.out.println("All recorded Fetch"+list);
			
		}catch(SQLException e){
			e.printStackTrace();	
		}
		System.out.println("Status is "+status);
		return list;
		
		
	}
	public static PhoneModule UpdatefetchbyId(int id){
		
		
		con=ConnectionProvider.getConnection();
		int status=0;
	
		PhoneModule phone = new PhoneModule();
		try{
			PreparedStatement pstmt = con.prepareStatement("select * from phonebook where id =?");
			pstmt.setInt(1, id);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				phone.setId(rs.getInt(1));
				phone.setName(rs.getString(2));
				phone.setMobile(rs.getString(3));
				phone.setEmail(rs.getString(4));
			System.out.println("Records fetch "+phone);
			}
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return phone;
	}
	
	
	/*public static int updatemyContact(int id){
	con = ConnectionProvider.getConnection();
	int status=0;
	PhoneModule S1 = new PhoneModule();
	try{
		PreparedStatement pstmt = con.prepareStatement("update phonebook set Name=?,Mobile=?,Email=? where id =?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			
			S1.setId(rs.getInt(1));
			S1.setName(rs.getString(2));
			S1.setMobile(rs.getString(3));
			S1.setEmail(rs.getString(4));
			
		
		}
		System.out.println("Record Updated ByUsingId"+S1);
		
	}catch(SQLException e){
		e.printStackTrace();	
	}
	return status;
	
}*/
}
