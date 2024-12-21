package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Finddoc extends ActionSupport implements Myconnection{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static Connection con;
	String name;
	String skill;
	String day;
	String aboutus;
	
	
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

	public String getAboutus() {
		return aboutus;
	}

	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}
	
	

	ArrayList<SearchDoc> searchdoc = new ArrayList<SearchDoc>();
	
public ArrayList<SearchDoc> getSearchdoc() {
		return searchdoc;
	}

	public void setSearchdoc(ArrayList<SearchDoc> searchdoc) {
		this.searchdoc = searchdoc;
	}

@Override
public String execute() throws Exception {
	PreparedStatement pstmt;
	pstmt=con.prepareStatement("select * from doctors where skill like '%"+skill+"%'");
	//pstmt.setString(1, "%"+skill+"%");
	ResultSet rs = pstmt.executeQuery();
	
	while(rs.next())
	{
		SearchDoc sd = new SearchDoc();
		sd.setName(rs.getString("name"));
		sd.setSkill(rs.getString("skill"));	/*or skill=rs.getString("skill");*/
		sd.setDay(rs.getString("day"));
		sd.setAboutus(rs.getString("aboutus"));
		searchdoc.add(sd);
		
		System.out.println(" Found"+name);
	System.out.println(" Found"+skill);
	System.out.println(" Found"+day);
	System.out.println(" Found"+aboutus);
		
	}
	
	return SUCCESS;
}

	public void getconnection(Connection con) {
		this.con=con;
		
	}


	

}
