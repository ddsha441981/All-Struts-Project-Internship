package com.LoginData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {

	@Override
	public void init() throws ServletException {
		
		super.init();
		System.out.println("Init Method Call");
	}
	
	public LoginForm() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor call");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Service Method Call");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Service Started</h1>");
		String use = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		if(use.equals("user") && pass.equals("pwd"))
		{
			out.println("<h1>User Granted</h1>");
		}
		else
		{
			out.println("<h1>User Denied</h1>");
		}
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destory Method Call");
		
	}
}
