package com.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Session_Servlet1 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		super.init();
		System.out.println("Method Started");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out = res.getWriter();
	
		String name = req.getParameter("user");
		String pass = req.getParameter("pwd");
		
		if(name.equals("seed") && pass.equals("123"))
		{
			out.print("<h1>WelCome User </h1>"+name);
			HttpSession session = req.getSession();
			session.setAttribute("uname",name);
			out.print("<a href='SessionSevlet2'>Visit Now</a>");
		}
		
		else
		{
			out.print("InVaild User Name And  Password");
		}
	}

}
