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
<h1 align="center"> Your Registration Successfully </h1>
<table bgcolor="pink" border="1">
	<tr>
		<th>Your User Name</th>
		<th>Your Password</th>
	</tr>

	<tr>
		<td><s:property value="d1.user"/></td>
		<td><s:property value="d1.pwd"/></td>
	</tr>
	<a href="Login.jsp"> To Login Now Click Here........... </a>
</table>
<table>
<tr>
	<th>||<a href="Home.jsp">Home||</a></th>
	<th>||<a href="Home.jsp">Back||</a></th>
	<th>||<a href="addmore.jsp">Add More||</a></th>
</tr>
</table>
</body>
</html>