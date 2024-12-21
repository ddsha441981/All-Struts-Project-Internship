package com.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.swing.JFrame;


public class Filter1  implements Filter  {

	public void destroy() {
	
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		out.print("<h1>This Is First Filter Before</h1><br>");
		String user = request.getParameter("username");
		String pass = request.getParameter("pwd");
		
		if(user.equals("seed") && pass.equals("123"))
		{
			chain.doFilter(request, response);//send request next resourse
		}
		else
		{
			out.print("Invaild User name And Password");
			
			RequestDispatcher disp = request.getRequestDispatcher("FilterStatic.html");
			disp.include(request, response);
		}
		out.print("<h1>This is First Filter After Excute Request</h1>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
