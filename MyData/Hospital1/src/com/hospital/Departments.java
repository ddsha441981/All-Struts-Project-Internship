package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;



public class Departments extends ActionSupport implements Myconnection {

	
static Connection con;
Statement stmt;

ArrayList<Dep> list = new ArrayList<Dep>();	 
public ArrayList<Dep> getList() {
		return list;
	}


	public void setList(ArrayList<Dep> list) {
		this.list = list;
	}
	
	
	
	public String execute() throws Exception {
		
		//stmt=con.createStatement();
		PreparedStatement ps=con.prepareStatement("select sname from hello");
		//String sql="select sname from hello";
		ResultSet rs=ps.executeQuery();
		 while(rs.next())
		 {
			 Dep hi = new Dep();
			hi.setSname(rs.getString(1));
			list.add(hi);
		 }
		return SUCCESS;
	}
	{
		
	}
	public void getconnection(Connection con) {
		this.con=con;
		
	}
	
}
