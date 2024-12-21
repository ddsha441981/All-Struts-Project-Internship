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
	<form:form modelAttribute="adminBeans" action="loginPageRedirctControllers" method="get">
	<form:label path="userRole">Select UserRole :</form:label>
			 <form:select path="userRole">
			<form:option value="select role">Select Role</form:option>
			<form:option value="admin">Admin</form:option>
			<form:option value="agent">Agent</form:option>
			<form:option value="client">Client</form:option>
			</form:select>
			<br><br>
			<form:label path="emailId">Email:</form:label>
			<form:input  path="emailId" placeholder="Enter Email" type="text" id="email"/> <br>
			<form:errors path="emailId" id="emailError"></form:errors>
			
			<br>
			<form:label path="autoPassword">Password:</form:label> 
			<form:input  path="autoPassword" placeholder="Enter Password" type="password" id="password"/> 
			<form:errors path="autoPassword"> </form:errors><br>
			<input type="submit">
			
	</form:form>
	
	<br><br>
	<a href="userRegister">Not Register ?</a>
	<br><br>
	
	<a href="forgetPasswordUser">Forgot Password ?</a>

</center>
</body>
</html>