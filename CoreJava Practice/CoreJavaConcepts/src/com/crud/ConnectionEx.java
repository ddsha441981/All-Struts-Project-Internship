package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEx {

	static Connection con = null;
	
	public static Connection myConnection(){
		
		if(con != null){
			
			return con;
		}else{
			try{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Connection Driver Loaded");
				String url="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
				con = DriverManager.getConnection(url, "HR", "password");
				System.out.println("Connection Established Successfully");
			}catch (ClassNotFoundException c) {
				// TODO: handle exception
			}catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
		return con;
		
	}
}
