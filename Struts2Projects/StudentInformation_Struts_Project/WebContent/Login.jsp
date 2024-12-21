<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="My.css">  
<title>Student Login Page</title>
</head>
<body class="cc">
<s:form action="mylogin">
	<s:textfield cssClass="txtcolor" label="User Name" name="user" size="50" required="true"></s:textfield>
	<br><br><br>
	<s:password cssClass="txtcolor"  label="Enter Password" name="pwd" required="true" size="50"></s:password>
	<s:submit></s:submit>
	<s:reset></s:reset>
</s:form>
</body>
</html>