<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    buffer="8kb" session="true" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>ldglihr</p>
 <% 
String name = request.getParameter("user");
String pw = request.getParameter("pwd");
String em = request.getParameter("email");
 
out.print("Wel Come User  \t");
out.print("\nYour User Name :"+name);
out.print("\nYour Password :"+pw);
out.print("\nYour Email Id :"+em);
 out.print("Hello EveryOne");
//response.sendRedirect("Response.jsp");

%> 
<a href="Response.jsp">Link</a>
</body>
</html>