package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class AppoitmentDetails extends ActionSupport implements Myconnection {

	Connection con;
	ArrayList<Appoitment> app = new ArrayList<Appoitment>();
	
	public ArrayList<Appoitment> getApp() {
		return app;
	}

	public void setApp(ArrayList<Appoitment> app) {
		this.app = app;
	}

	@Override
	public String execute() throws Exception {
		int hh;
		PreparedStatement pstmt =con.prepareStatement("select * from Appoitment0121");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			Appoitment a1 = new Appoitment();
			a1.setId(rs.getInt(1));
			a1.setDoctors(rs.getString(2));
			a1.setDay(rs.getString(3));
			a1.setAname(rs.getString(4));
			a1.setPerson(rs.getString(5));
			a1.setRelation(rs.getString(6));
			a1.setMob(rs.getInt(7));
			a1.setAemail(rs.getString(8));
			a1.setPgender(rs.getString(9));
			a1.setPcity(rs.getString(10));
			a1.setQry(rs.getString(11));
			a1.setTerms(rs.getString(12));
			app.add(a1);
			
			
		}
		return SUCCESS;
	}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
