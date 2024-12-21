package com.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterDemo1 extends HttpServlet{
@Override
public void init() throws ServletException {
	
	super.init();
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
	
	PrintWriter out = res.getWriter();
	out.print("<h1>WelCome User</h1><br>");
	
	
	}
}
