<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Forgot Password</title>
</head>
<body>
<center>
	<h1>Select Forgot Password User</h1>
	<form:form modelAttribute="selectBeans" action="selectedforgotPassword" method="get">
	<form:label path="forgotPasswordSelect">Select Users :</form:label>
			 <form:select path="forgotPasswordSelect">
			<form:option value="#">Select Users</form:option>
			
			<form:option value="agent">Agent</form:option>
			<form:option value="client">Client</form:option>
			</form:select>
			<br><br>
			
			<input type="submit">
			
	</form:form>
	
	<br><br>
</center>
</body>
</html>