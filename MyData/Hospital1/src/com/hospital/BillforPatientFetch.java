package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class BillforPatientFetch extends ActionSupport implements Myconnection {
	Connection con;
	ArrayList<BillforpatientGetter> bill = new ArrayList<BillforpatientGetter>() ;
	
	public ArrayList<BillforpatientGetter> getBill() {
		return bill;
	}

	public void setBill(ArrayList<BillforpatientGetter> bill) {
		this.bill = bill;
	}

	@Override
	public String execute() throws Exception {
		
		PreparedStatement pstmt =con.prepareStatement("select * from BillforPatient");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			BillforpatientGetter billinfo = new BillforpatientGetter();
			billinfo.setBid(rs.getInt(1));
			billinfo.setBname(rs.getString(2));
			billinfo.setTreatment(rs.getString(3));
			billinfo.setRdoc(rs.getString(4));
			billinfo.setMdc(rs.getInt(5));
			billinfo.setPrice(rs.getInt(6));
			billinfo.setQunt(rs.getInt(7));
			billinfo.setBgender(rs.getString(8));
			billinfo.setBcity(rs.getString(9));
			billinfo.setBadmit(rs.getString(10));
			billinfo.setBdischarge(rs.getString(11));
			
			bill.add(billinfo);
		}
		
		return SUCCESS;
	}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}
}
