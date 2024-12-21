package com.hospital;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class Enquiryfetch extends ActionSupport implements Myconnection {

	static Connection con;
	
	ArrayList<Enquirygetter> list2 = new ArrayList<Enquirygetter>();
	
	public ArrayList<Enquirygetter> getList2() {
		return list2;
	}

	public void setList2(ArrayList<Enquirygetter> list2) {
		this.list2 = list2;
	}

	@Override
	public String execute() throws Exception {
		Statement stmt;
		stmt=con.createStatement();
		String sql="select * from enquiry1";
		 ResultSet rs=stmt.executeQuery(sql);
		 while(rs.next())
		 {
			 Enquirygetter ed = new Enquirygetter();
			 ed.setPid(rs.getInt(1));
			 ed.setPname(rs.getString(2));
			 ed.setPemail(rs.getString(3));
			 ed.setPadd(rs.getString(4));
			 ed.setPno(rs.getInt(5));
			 ed.setPgender(rs.getString(6));
			 ed.setPcity(rs.getString(7));
			
			 ed.setPques(rs.getString(8));
			 
			 list2.add(ed);
		 }
		 
		return SUCCESS;
	}

	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
