<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<title>Profile Details</title>
<%
	request.getSession();
	String n = (String) session.getAttribute("uname");
	System.out.println(n);
%>
</head>

<body>
	<table align="center">
		<tr>
			<td><img alt="logo" src="images/Logo.gif" height="100"
				width="200"></td>
			<td><h1>Profile Details</h1></td>

			<td><input type="button" value="Logout"
				onclick="location.href='HomePage.jsp'"></td>
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
	<s:form action="update">
		<% Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@aquarius.parth.com:1521:oracle11",
			"java", "java");
	PreparedStatement ps = conn
			.prepareStatement("select * from reg where uname='" + n
					+ "'");
	ResultSet rs = ps.executeQuery();
					while (rs.next()) {
		
%>
					
		UserName:<input  name="uname" type="text" value="<%=rs.getString("uname")%>" />
		Mobile No:<input  name="mono" type="text" value="<%=rs.getString("mono")%>" />
		E-mail:<input name="email" type="text" value="<%=rs.getString("email")%>" />
		<%
		}
	
	%>	<button type="submit" id="mybtn"> save</button>
	</s:form>
	
		
			
	

	
</body>
<script type="text/javascript" scr="assets/js/jquery.js"></script>
</html>