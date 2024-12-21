package com.ReDirection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void init(ServletConfig config) throws ServletException {
		super.init();
		System.out.println("Method started");
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.sendRedirect("");
	}

}
