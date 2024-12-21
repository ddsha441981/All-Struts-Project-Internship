<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<%@taglib uri="/struts-tags" prefix="s"%>
<title>Welcome HomePage</title>
</head>
<body>
<table><tr><td><img alt="logo" src="images/Logo.gif" height="100" width="200"></td>
<td><h1>Welcome to E-Medical and Medicated Services</h1></td></tr>

<tr>
<td>
<ul>
<li><a href="HomePage.jsp">Home</a></li>
<li><a href="AboutUs.jsp">About Us</a></li>
<li><a href="ContactUs.jsp">Contact Us</a></li>
<li><a href="Help.jsp">help</a></li>
<li><a href="feedback.jsp">FeedBack</a></li>
</ul></td>
<td>
<div align="right">

<s:form action="mylogin" method="post">
<s:textfield name="uname" label="Enter Name"></s:textfield>
<s:password name="upass" label="Enter Password"></s:password>
<s:submit value="submit"></s:submit>
<s:a href="Registration.jsp"><b>New User</b></s:a>
</s:form>
</div>
</td></tr>
</table>
<div align="center">
<img alt="" src="images/download1.jpg" width="200" height="200">
<img alt="" src="images/download2.jpg" width="200" height="200">
<img alt="" src="images/download3.jpg" width="200" height="200">
<img alt="" src="images/download4.jpg" width="200" height="200">
<img alt="" src="images/download5.jpg" width="200" height="200">
</div>
</body>
</html>