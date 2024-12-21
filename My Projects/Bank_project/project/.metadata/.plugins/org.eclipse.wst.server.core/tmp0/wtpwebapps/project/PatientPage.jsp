<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<title>Profile page</title>
<%@taglib uri="/struts-tags" prefix="s"%>
</head>
<%
	request.getSession();
	String n=(String)session.getAttribute("uname");
	System.out.println(n);
%>
<body>
	<table align="center">
		<tr>
			<td><img alt="logo" src="images/Logo.gif" height="100"
				width="200"></td>
			<td><h1>Profile Details</h1></td>
			</tr>
	</table>
	<div class="loggername">
		
		<s:property value="uname" />
	</div>
	<input type="button" value="Logout" onclick="location.href='HomePage.jsp'">
	<div>
		<ul>
			<li><a href="Forum.jsp">Forum</a></li>
			<li><a href="ChangePassword.jsp">Change Password</a></li>
			<li><a href="ProfileDetails.jsp">Profile Details</a></li>
		</ul>
	</div>
	
	
	
</body>

</html>