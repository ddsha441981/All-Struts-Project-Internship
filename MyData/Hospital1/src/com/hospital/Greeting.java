package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class Greeting extends ActionSupport implements Myconnection {

	Connection con;
	PreparedStatement pstmt;
	int gid;
	String gname;
	String groom;
	String gsend;
	String msg;
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGroom() {
		return groom;
	}
	public void setGroom(String groom) {
		this.groom = groom;
	}
	public String getGsend() {
		return gsend;
	}
	public void setGsend(String gsend) {
		this.gsend = gsend;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	@Override
	public String execute() throws Exception {
		pstmt=con.prepareStatement("insert into review values(?,?,?,?,?)");
		pstmt.setInt(1, gid);
		pstmt.setString(2, gname);
		pstmt.setString(3, groom);
		pstmt.setString(4, gsend);
		pstmt.setString(5, msg);
		int d1 = pstmt.executeUpdate();
		System.out.println("Data Successfully submited" +d1);
		
		return SUCCESS;
	}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}


