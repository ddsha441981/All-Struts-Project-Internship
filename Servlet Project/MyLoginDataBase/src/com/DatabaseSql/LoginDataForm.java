package com.DatabaseSql;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDataForm  extends HttpServlet{
	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	public void init() throws ServletException {
	
		super.init();
		System.out.println("Init Method is Started");

		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url ="jdbc:oracle:thin:@Deendayal-PC:1521:XE";
		Properties p = new Properties();
		p.put("user", "HR");
		p.put("password","password");
		con=DriverManager.getConnection(url,p);
		stmt=con.createStatement();
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Successfully..........");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		String use = request.getParameter("user");
		String pass = request.getParameter("pwd");
		out.print("<h1>Service Started</h1>");
		try {
		//String sql ="select username,password from login where username =?";
	
			pstmt=con.prepareStatement("select username,password from login where username=?");
			pstmt.setString(1, use);
			rs = pstmt.executeQuery();
			
			System.out.println("Statement Executed");
			rs.next();
			
			String duse= rs.getString("username");
			out.print(duse);
			String dps = rs.getString("password");
			if(use.equals(duse) && pass.equals(dps))
			{
				out.println("<h1>User Successfully Login</h1>");
			}
			else
			{
				out.println("<h1>InVaild User Name And Password</h1>");
			}
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
