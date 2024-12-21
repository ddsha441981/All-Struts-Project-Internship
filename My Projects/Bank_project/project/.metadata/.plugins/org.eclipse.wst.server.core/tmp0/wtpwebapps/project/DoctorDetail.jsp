<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<%@taglib uri="/struts-tags" prefix="s"%>
<title>Doctor Detail</title>
<%request.getSession();
String n=(String)session.getAttribute("uname");
	System.out.println(n);%>
</head>
<body><table><tr><td><img alt="logo" src="images/Logo.gif" height="100" width="200"></td>
<td><h1>Doctors Details</h1></td>
<td><a href="HomePage.jsp"><button class="btn-logout">logout</button></a></td>
</tr></table>
<div>
		<ul>
			<li><a href="Forum.jsp">Forum</a></li>
			<li><a href="ChangePassword.jsp">Change Password</a></li>
			<li><a href="ProfileDetails.jsp">Profile Details</a></li>
			
		</ul>
	</div>
<div>
		<s:form action="adddrdetails">
	
			<table align="center">
				<tr>
					<td><s:textfield name="fname" label="FastName"></s:textfield></td>
				</tr>
				<tr>
					<td><s:textfield name="lname" label="LastName"></s:textfield></td>
				</tr>
				<tr>
					<td><s:textfield name="CertificateNo" label="Certificate No"></s:textfield></td>
				</tr>
				<tr>
					<td><s:textfield name="specilist" label="Specilist"></s:textfield></td>
				</tr>
				<tr>
					<td><s:select label="country" list="{'India','America','China','Canada','Brazil'}"></s:select></td>
				</tr>
				
				<tr>
					<td><s:submit value="Submit"></s:submit></td>
				</tr>
				<tr>
					<td><s:reset value="Reset"></s:reset></td>
				</tr>
				<tr>
				
				</tr>
			</table>
		</s:form>

	</div>

</body>
</html>