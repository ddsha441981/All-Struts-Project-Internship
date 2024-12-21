package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Demo implements Interceptor{
public static Connection con;
	public void destroy() {
	
		
	}

	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init");
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		Object o=arg0.getAction();
		if(o instanceof EstablishedConnection)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			String url="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
			con=DriverManager.getConnection(url,"HR","password");
			((EstablishedConnection )o).setConnection(con);
			System.out.println("Connection established successfully");
		}
		String s=arg0.invoke();
		System.out.println("after processing");
		return s;
	}

}
