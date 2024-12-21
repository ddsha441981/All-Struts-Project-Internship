package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Search extends ActionSupport implements Myconnection {

	Connection con;
	String first_name;
	

	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Override
	public String execute() throws Exception {
		Statement stmt = con.createStatement();
		String sql="select first_name from employee where employee_id=101";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		 {
			rs.getString(1);
		 }
		return SUCCESS;
	}

	public void getconnection(Connection con) {
		this.con=con;
		
	}
}
