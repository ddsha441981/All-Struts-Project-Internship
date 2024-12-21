<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
</head>
<body>
<center>
<h1> Forget Password </h1>

<form:form modelAttribute="forgotPasswordBeans" action="forgotpasswordOfUsers" method="get">
		<form:label path="email"></form:label>
		<form:input path="email" type="text" placeholder="Enter Email"/>
		<form:errors path="email" id="emailErrors"></form:errors>
		
		<input type="submit">
</form:form>
</center>

</body>
</html>