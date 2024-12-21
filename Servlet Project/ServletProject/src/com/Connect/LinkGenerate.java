package com.Connect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Time;

public class LinkGenerate extends HttpServlet {
	
@Override
public void init() throws ServletException {
	
	super.init();
	System.out.println("Init Method statred");
}
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		out.print("Service Started");	
		Date d1 = new Date(0);
		Time t1 = new Time();
		out.print("<h1>Today date is :</h1>" +d1.toGMTString());
		out.print("<h1>Today Time is :</h1>" +t1.toString());
		out.println("<h1>Hello Servlet Welocome</h1>");
		
	}
	

}
