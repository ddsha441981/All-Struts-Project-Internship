package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class AddNewEmp_Fetch extends ActionSupport implements Myconnection {

	Connection con;
	ArrayList<AddEmployeeGetter> emp = new ArrayList<AddEmployeeGetter>();
	

	public ArrayList<AddEmployeeGetter> getEmp() {
		return emp;
	}


	public void setEmp(ArrayList<AddEmployeeGetter> emp) {
		this.emp = emp;
	}
	
	@Override
	public String execute() throws Exception {
		PreparedStatement pstmt=con.prepareStatement("select * from Employees0111");
		ResultSet rs =pstmt.executeQuery();
		while(rs.next())
		{
			AddEmployeeGetter e1 = new AddEmployeeGetter();
			e1.setEid(rs.getInt(1));
			e1.setEname(rs.getString(2));
			e1.setPass(rs.getString(3));
			e1.setEemail(rs.getString(4));
			e1.setEno(rs.getInt(5));
			e1.setEgender(rs.getString(6));
			e1.setEcriteria(rs.getString(7));
			e1.setEcity(rs.getString(8));
			e1.setEsalary(rs.getInt(9));
			e1.setEadd(rs.getString(10));
			e1.setAboutE(rs.getString(11));
			emp.add(e1);
		}
		return SUCCESS;
	}


	public void getconnection(Connection con) {
		this.con=con;
		
	}
	
}
