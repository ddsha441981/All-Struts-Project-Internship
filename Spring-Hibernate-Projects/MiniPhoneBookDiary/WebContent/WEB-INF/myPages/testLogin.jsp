<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page Using OTP</title>
</head>
<body>
<h1>OTP Login Page</h1>

<form:form modelAttribute="testBean" action="testForOTP">
		<form:input path="name" placeholder="Enter Name"/><br><br>
		<form:input path="password" placeholder="Enter Password"/><br><br>
		<input type="submit">
</form:form>
</body>
</html>