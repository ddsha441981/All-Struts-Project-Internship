package com.student.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Retrivedata extends ActionSupport implements EstablishConnection,SessionAware {

	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	Registerdata rd = new Registerdata();
Map m;
@Override
public String execute() throws Exception {
	pstmt=con.prepareStatement("select * from register");
	rs=pstmt.executeQuery();
String sna,pw,gen,em,ci,ad;
int ii;
int i = 0;
	while(rs.next())
	{
		
		/*rs.getInt(sid);
		rs.getString(sname);
		rs.getString(pwd);
		rs.getString(gender);
		rs.getString(email);
		rs.getString(city);
		rs.getString("address");*/
		ii=rs.getInt("sid");
		m.put("id"+i, ii);
		sna=rs.getString("sname");
		m.put("name"+i,sna);
		pw=rs.getString("pwd");
		m.put("password"+i, pw);
		gen=rs.getString("gender");
		m.put("genders"+i, gen);
		em=rs.getString("email");
		m.put("emailid"+i, em);
		ci=rs.getString("email");
		m.put("cityname"+i, ci);
		ad=rs.getString("address");
		m.put("addressname"+i, ad);
		i++;
		/*rd.setSid(rs.getInt(1));
		rd.setSname(rs.getString(2));
		rd.setPwd(rs.getString(3));
		rd.setEmail(rs.getString(5));
		rd.setGender(rs.getString(6));
		rd.setCity(rs.getString(7));
		rd.setAdd(rs.getString(8));
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));*/
	}
	System.out.println("Successfully Data Retrive");
	return  SUCCESS;
}
	@Override
	public void getconnection(Connection con) {
		this.con=con;
		
	}
	@Override
	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		m=arg0;
	}
}
