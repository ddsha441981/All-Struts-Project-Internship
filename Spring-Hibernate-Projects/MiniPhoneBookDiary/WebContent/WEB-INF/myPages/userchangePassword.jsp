<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> User Change Password</title>
</head>
<body>
<center>
<h1> User Change Password </h1>
<form:form modelAttribute="changePasswordUserBeans" action="userPasswordChangeUsingLogin">
		<form:label path="email">Email Id</form:label>
		<form:input path="email" type="text" placeholder="Enter Email"/>
		<form:errors path="email" id="emailError"></form:errors> <br><br>
		
		<form:label path="autoPassword">New Password</form:label>
		<form:input path="autoPassword" type="password" placeholder="Enter password"/>
		<form:errors path="autoPassword" id="newPasswordError"></form:errors><br><br>
		
		
		<form:label path="cfPassword">Confirm Pssword</form:label>
		<form:input path="cfPassword" type="password" placeholder="Enter Confirm Password"/>
		<form:errors path="cfPassword" id="cfPasswordError"></form:errors><br><br>
		
		<input type="submit">
		
</form:form>
</center>
</body>
</html>