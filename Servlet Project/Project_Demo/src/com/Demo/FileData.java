package com.Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public FileData() {
    	
        super();
      System.out.println("Constructor call ");
    }
    

	
	public void init(ServletConfig config) throws ServletException {
		super.init();
		 System.out.println("init call ");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("Service call ");
		PrintWriter out = response.getWriter();
		out.println("<h1> My Page </h1> <br> <br> <br>");
		out.println("<h1> Constructor call first and only one time call </h1>");
		out.println(request.getLocale() +"\n");
		out.println(request.getDateHeader(getServletInfo()));
	}

	@Override
	public void destroy() {
		
		 System.out.println("destroy call ");
	}
}
