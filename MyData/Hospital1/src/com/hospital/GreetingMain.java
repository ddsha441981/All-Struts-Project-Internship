package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class GreetingMain extends ActionSupport implements Myconnection {

	Connection con;
	ArrayList<Greeting_getter> ag = new ArrayList<Greeting_getter>();
	
	public ArrayList<Greeting_getter> getAg() {
		return ag;
	}
	public void setAg(ArrayList<Greeting_getter> ag) {
		this.ag = ag;
	}
	

	@Override
	public String execute() throws Exception {
		
		PreparedStatement pstmt =con.prepareStatement("select * from review");
		ResultSet rs =pstmt.executeQuery();
		while(rs.next())
		{
			Greeting_getter greet = new Greeting_getter();
			greet.setGid(rs.getInt(1));
			greet.setGname(rs.getString(2));
			greet.setGroom(rs.getString(3));
			greet.setGsend(rs.getString(4));
			greet.setMsg(rs.getString(5));
			ag.add(greet);
		}
		return SUCCESS;
	}
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
