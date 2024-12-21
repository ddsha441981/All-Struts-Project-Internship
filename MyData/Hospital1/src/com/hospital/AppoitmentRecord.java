package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class AppoitmentRecord extends ActionSupport implements Myconnection{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Connection con;
	String Aname;
	String doctors;
	int mob;
	String pcity;
	String pgender;
	String qry;
	
public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public String getDoctors() {
		return doctors;
	}

	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public String getPgender() {
		return pgender;
	}

	public void setPgender(String pgender) {
		this.pgender = pgender;
	}

	public String getQry() {
		return qry;
	}

	public void setQry(String qry) {
		this.qry = qry;
	}

ArrayList<Appoitment_records> appoit = new ArrayList<Appoitment_records>();
	


public ArrayList<Appoitment_records> getAppoit() {
		return appoit;
	}

	public void setAppoit(ArrayList<Appoitment_records> appoit) {
		this.appoit = appoit;
	}

@Override
public String execute() throws Exception {
	PreparedStatement pstmt;
	pstmt=con.prepareStatement("select * from Appoitment0121 where Aname like '%"+Aname+"%'");
	//pstmt.setString(1, "%"+skill+"%");
	ResultSet rs = pstmt.executeQuery();
	
	while(rs.next())
	{
		Appoitment_records s1 = new Appoitment_records();
		s1.setAname(rs.getString("Aname"));
		s1.setDoctors(rs.getString("doctors"));
		s1.setMob(rs.getInt("mob"));
		s1.setPcity(rs.getString("pcity"));
		s1.setPgender(rs.getString("pgender"));
		s1.setQry(rs.getString("qry"));
		appoit.add(s1);
		
		System.out.println(" Found"+Aname);
	System.out.println(" Found"+doctors);
	System.out.println(" Found"+mob);
	System.out.println(" Found"+qry);
		
	}
	
	return SUCCESS;
}

	public void getconnection(Connection con) {
		this.con=con;
		
	}


	

}
