package com.ReDirection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SendReDirctionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	public void init(ServletConfig config) throws ServletException {
		super.init();
		System.out.println("Started");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello Servelt 1</h1>");
		String user = request.getParameter("username");
		response.sendRedirect("http://localhost:8081/SendReDirectionProject/ServletDemo2.java"+user);
		
	}

}
