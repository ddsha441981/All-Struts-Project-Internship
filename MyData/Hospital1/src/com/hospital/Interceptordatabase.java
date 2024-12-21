package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class Interceptordatabase implements Interceptor {
	public static Connection con;
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Successfully Closed");
		
	}

	public void init() {
		System.out.println("Database Interceptor Started");
		
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		Object obj = arg0.getAction();
		if(obj instanceof Myconnection)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			String url="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
			con=DriverManager.getConnection(url,"HR","password");
			((Myconnection )obj).getconnection(con);
			System.out.println("Connection established successfully");
		}
		System.out.println("Before Processing");
		String str = arg0.invoke();
		System.out.println("After Processing");
		return str;
	}
	

}
