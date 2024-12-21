package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class AllDoctors extends ActionSupport implements Myconnection {

	static Connection con;
	ArrayList<AllDoctors_Getter> All = new ArrayList<AllDoctors_Getter>();
	
	
	public ArrayList<AllDoctors_Getter> getAll() {
		return All;
	}

	public void setAll(ArrayList<AllDoctors_Getter> all) {
		All = all;
	}

	@Override
	public String execute() throws Exception {
	PreparedStatement pstmt = con.prepareStatement("select * from doctors");
	ResultSet rs = pstmt.executeQuery();
	while(rs.next())
	{
		AllDoctors_Getter gett = new AllDoctors_Getter();
		gett.setId(rs.getInt("id"));
		gett.setName(rs.getString("name"));
		gett.setSkill(rs.getString("skill"));
		gett.setAboutus(rs.getString("aboutus"));
		All.add(gett);
		System.out.println("Data");
	}
		return SUCCESS;
	}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
