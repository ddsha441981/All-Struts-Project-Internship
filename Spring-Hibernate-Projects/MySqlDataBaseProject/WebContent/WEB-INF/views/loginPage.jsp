<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Purpose Register  Page </title>
</head>
<body>
<center>
	<form:form modelAttribute="registerBeans" action="nextPageRedirectHTML">
			<form:label path="userName">UserName</form:label>
			<form:input path="userName" /> <br><br>
			
			<form:label path="password">Password</form:label>
			<form:input path="password"/> <br><br>
			
			<form:label path="email">email</form:label>
			<form:input path="email"/> <br><br>
			
			<form:label path="mobNo">Mobile No</form:label>
			<form:input path="mobNo"/> <br><br>
			
			<input type="submit">
			
	</form:form>
</center>
</body>
</html>