package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class DocProfile extends ActionSupport implements Myconnection {

	Connection con;
	
	int id;
	String name;
	String skill;
	String day;
	String availability;
	String time;
	String aboutus;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAboutus() {
		return aboutus;
	}

	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}
	
	@Override
	public String execute() throws Exception {
		PreparedStatement pstmt =con.prepareStatement("insert into doctors values(?,?,?,?,?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, skill);
		pstmt.setString(4, day);
		pstmt.setString(5, availability);
		pstmt.setString(6, time);
		pstmt.setString(7, aboutus);
		
		int d2=pstmt.executeUpdate();
		System.out.println("Data SuccessFully Inserted");
		return SUCCESS;
	}
	
	public void getconnection(Connection con) {
		this.con=con;
		
	}

}
