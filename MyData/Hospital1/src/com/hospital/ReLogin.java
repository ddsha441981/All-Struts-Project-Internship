package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class ReLogin extends ActionSupport implements Myconnection {

	static Connection con;
	String ename;
	String pass;
	String eemial;
	
	public String getEemial() {
		return eemial;
	}

	public void setEemial(String eemial) {
		this.eemial = eemial;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
public String execute() throws Exception {
	String ret =ERROR;
	PreparedStatement pstmt = con.prepareStatement("select ename from Employees0111 where eemail=? and pass=?");
	pstmt.setNString(1, "eemail");
	pstmt.setString(2, pass);
	ResultSet rs = pstmt.executeQuery();
	while(rs.next())
	{
		ename=rs.getString(1);
		System.out.println("Data is "+ename);
		
	}
	return SUCCESS;
}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
