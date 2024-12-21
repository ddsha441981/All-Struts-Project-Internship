<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Index Page</h1>
	<s:a href="register.jsp">Register</s:a>
	<br><br>
	<s:form action="viewrecords"><s:a href="viewrecords">All Records View</s:a>
	<s:submit></s:submit>
	</s:form>
	
	<br><br>
	<s:a href="login.jsp">Login</s:a>
</body>
</html>