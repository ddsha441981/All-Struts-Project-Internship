<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><td><img alt="logo" src="images/Logo.gif" height="100" width="200"></td>
<td><h1>Welcome to E-Medical and Medicated Services</h1></td></tr>

<tr><td>
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
<s:submit value="Submit"></s:submit>
<s:a href="Registration.jsp"><b>New User</b></s:a>
</s:form>
</div></td></tr>
</table>

<center><h2>Contact E-Medical Services</h2></center>
<p>For any concerns that you have relating to requirements 
for medication not currently listed, or suggestions as to how we may improve our service, 
please contact us.</p>

<p>Our telephone line is available Monday to Friday
from 9am to 5pm (AEST) - <b>1800 200 736</b> </p>

<p>Our fax number is <b>(03) 9331 6748</b></p> 

<p>Email should be addressed to <b>admin@medical.com.au</b></p>

<p>Our mailing address is: Free Post: Reply Paid 80  KEILOR VIC  3036</p>
</body>
</html>