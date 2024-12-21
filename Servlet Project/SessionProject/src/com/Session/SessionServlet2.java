package com.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {
	
   @Override
public void init() throws ServletException {
	
	super.init();
}
   @Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
	PrintWriter out = res.getWriter();
	HttpSession session = req.getSession(false);
	String hhh = (String) session.getAttribute("uname");
	out.print("Hello Servlet 2 "+hhh);
		
	}
}
