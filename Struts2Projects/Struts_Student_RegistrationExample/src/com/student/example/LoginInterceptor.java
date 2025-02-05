package com.student.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	static Connection con;
	@Override
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation a1) throws Exception {
		Object obj = a1.getAction();//getAction tell us that what is obj and action available
		if(obj instanceof EstablishConnection)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
			System.out.println("Driver Loaded SuccessFully......");
			Properties p = new Properties();
			p.put("user", "HR");
			p.put("password","password");
		
			con=DriverManager.getConnection(url,p);
			System.out.println("Connection Successfully..........");
			((EstablishConnection) obj).getconnection(con);//here typcasting obj return con's object
		}
		System.out.println("Before Processing");
		String t1 = a1.invoke();//invoke method return Strings object
		System.out.println("Afetr Processing");
		return t1;
	}

	
}
