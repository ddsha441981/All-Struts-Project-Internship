<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="/struts-tags" prefix="s"%>
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<title>Change Password</title>
<%request.getSession();
String n=(String)session.getAttribute("uname");
	System.out.println(n);%>
</head>
<body>
	<table align="center">
		<tr>
			<td><img alt="logo" src="images/Logo.gif" height="100"
				width="200"></td>
			<td><h1>Change Password</h1></td>

			<td><input type="button" value="Logout" onclick="location.href='HomePage.jsp'"></td>
		</tr>

	</table>
	<div>
		<ul>
			<li><a href="Forum.jsp">Forum</a></li>
			<li><a href="ChangePassword.jsp">Change Password</a></li>
			<li><a href="ProfileDetails.jsp">Profile Details</a></li>
			
		</ul>
	</div>
	<hr>
	<div align="center">
	
		<s:form action="change">
		<%
			String user=(String)session.getAttribute("uname");
			String ps=(String)session.getAttribute("upass");
			session.setAttribute("aa",session.getAttribute("upass")); 
		%>


	Current PassWord: <input type="password" name="upass" value="<s:property value="#session.upass"/>"/>
	<s:password label="New PassWord" name="chpass"></s:password>
	<s:password label="Re_Enter Password" name="conpass"></s:password>		
			<s:submit value="Change Password" ></s:submit>
			
		</s:form>
	</div>
</body>
</html>