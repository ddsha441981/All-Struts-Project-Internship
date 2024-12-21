package com.servletExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init call");
		// TODO Auto-generated method stub
		
	}
	
	Student(){
		
		System.out.println("Constructor call");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Service call");
		
		PrintWriter pw = response.getWriter();
		pw.print("<h1>Deendayal Login Page Started</h1>");
		String userName = request.getParameter("name");
		String password = request.getParameter("pass");
		
		if(userName.equals("name") && password.equals("pass")){
			
			System.out.println("User Login Successfully");
		}
		else{
			System.out.println("User Login Denied");
		}
		
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy call");
		// TODO Auto-generated method stub
		
	}

}
