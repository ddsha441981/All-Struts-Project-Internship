package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		 Connection con ;
		 
		
		// for statement
		 
		//Student st = new Student(50, "pp", "cdc", 300000);
		//Student st = new Student(80, "ii", "dec", 200000);
		//Student st = new Student(90, "dddd", "efc", 700000);
		//Student st = new Student(40, "aaa", "fgc", 400000);
		//Student st = new Student(30, "ee", "ghc", 900000);
		//Student st = new Student(70, "rrr", "hic", 200000);
		
		//for PreparedStatement
		
		 Student st = new Student(1, "Pawan", "wsdfds", 88880000);
		 
		 con = ConnectionEx.myConnection();
		
		 /*java.sql.Statement stmt =  con.createStatement();
		 ((java.sql.Statement) stmt).executeUpdate("insert into std values('"+st.getId()+"' , '"+st.getName()+"' ,'"+st.getPassword()+"' ,'"+st.getSalary()+"')");
		 */
		 PreparedStatement pstmt = con.prepareStatement("insert into std values ( ?,?,?,?)");
		 pstmt.setInt(1, 101);
		 pstmt.setString(2, "dddddddddddddddddddd");
		 pstmt.setString(3, "hhhhhhhhhhhhhhhhhhhh");
		 pstmt.setString(4, "200000");
		 pstmt.execute();
		 
		 System.out.println("Record affected");
		 con.close();
	}

}
