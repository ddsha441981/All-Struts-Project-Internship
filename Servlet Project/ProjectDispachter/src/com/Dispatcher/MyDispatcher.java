package com.Dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyDispatcher extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Method has been started");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Services Started");
		//String use = request.getParameter("user");
		
		//String pass = request.getParameter("pwd");
		//out.print(pass);
		//out.print(use);
	if(request.getParameter("user").equals("seed") && request.getParameter("pwd").equals("infotch"))
		//if(use.equals("user") && pass.equals("pwd"))
		{
			out.print("login");
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/vaild");
			rd.forward(request, response);
			
		}
		else
		{
			out.println("<h1 style ='color:purple;'>Invaild user name and Password</h1>");
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Dispa.html");
			rd.include(request,response);
		}
		
		//getServletContext().getRequestDispatcher("/vaild");
	}
}
