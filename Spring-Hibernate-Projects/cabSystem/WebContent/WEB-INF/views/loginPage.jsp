<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<center>
	<h1>Login Page</h1>
	
<form:form modelAttribute="adminLoginBeans" action="selectedLoginUsingRoleId" method="get">
Select Role :	<form:select path="role">
		
		<form:option value="#">select Role</form:option>
		
		<form:option value="admin">Admin</form:option>
		<form:option value="employee">Employee</form:option>
		<form:option value="maintainmanager">Maintain Manger</form:option>
		<form:option value="hrmanager">HR</form:option>
		<form:option value="movementmanager">Movement Manger</form:option>
		<form:option value="insurancemanager">Insurance Manger</form:option>
		<form:option value="assurencemanager">Quality Assurence</form:option>
		<form:option value="financemanager">finance Mangager</form:option>
	</form:select>
	<br><br>
	
	Email Id :-<form:input type="text" path="emailId"></form:input><br><br>
	Password :-<form:input type="password" path="password"></form:input><br><br>
	<input type="submit">
	
	</form:form>
</center>
</body>
</html>