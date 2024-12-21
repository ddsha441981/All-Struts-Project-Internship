package com.Dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

public class VaildServletDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responce)
			throws ServletException, IOException {
		
		PrintWriter out = responce.getWriter();
		out.print("Hello"+request.getParameter("txtname"));
		responce.sendRedirect("");
	}

}
