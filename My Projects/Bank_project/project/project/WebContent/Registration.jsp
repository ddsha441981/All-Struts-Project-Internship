<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<%@taglib uri="/struts-tags" prefix="s"%>

<title>Registration</title>
</head>
<body >
<table align="center"><tr><td><img alt="logo" src="images/Logo.gif" height="100" width="200"></td>
<td><h1>REGISTRATION FORM</h1></td></tr>
<tr><td>
<ul>
<li><a href="HomePage.jsp">Home</a></li>
</ul></td>
<div align="center">
<img alt="" src="images/download1.jpg" width="200" height="200">
<img alt="" src="images/download2.jpg" width="200" height="200">
<img alt="" src="images/download3.jpg" width="200" height="200">
<img alt="" src="images/download4.jpg" width="200" height="200">
<img alt="" src="images/download5.jpg" width="200" height="200">
</div>
<tr><td><s:form action="register">
<s:textfield name="id" label="Id"></s:textfield>
<s:textfield name="uname" label="Username"></s:textfield>
<s:password name="pass" label="Password"></s:password>
<s:password name="cpass" label="Confirm Password"></s:password>
<s:textfield name="mono" label="Mobile Number"></s:textfield>
<s:textfield name="email" label="Email-Id"></s:textfield>      
<s:select  name="category" label="Category" id="category"  list="{'--Select--','Doctor','Pharmacist','Patient'}"/>
<s:submit value="Register" ></s:submit>
<s:reset value="Reset"></s:reset>
</s:form></td></tr>
</table>

</body>
</html>