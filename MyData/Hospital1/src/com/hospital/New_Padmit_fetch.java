package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class New_Padmit_fetch extends ActionSupport implements Myconnection {

	static Connection con;
	ArrayList<New_Padmit_set> Padmit = new ArrayList<New_Padmit_set>();
	

	public ArrayList<New_Padmit_set> getPadmit() {
		return Padmit;
	}


	public void setPadmit(ArrayList<New_Padmit_set> padmit) {
		Padmit = padmit;
	}

	@Override
	public String execute() throws Exception {
	
		PreparedStatement pstmt;
		pstmt=con.prepareStatement("select * from AdmitPatient0001");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			New_Padmit_set pati = new New_Padmit_set();
			pati.setNpid(rs.getInt(1));
			pati.setNpname(rs.getString(2));
			pati.setNpemail(rs.getString(3));
			pati.setNpadd(rs.getString(4));
			pati.setNpno(rs.getInt(5));
			pati.setNpgender(rs.getString(6));
			pati.setNpcity(rs.getString(7));
			pati.setNadmit(rs.getString(8));
			pati.setNdischarge(rs.getString(9));
			Padmit.add(pati);
		}
		
		return SUCCESS;
	}

	public void getconnection(Connection con) {
		this.con=con;
		
		
	}
}
