<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test OTP Here</title>
</head>
<body>
<h1> OTP </h1>
<h3>Don't Refresh Page</h3>

<form:form modelAttribute="testBean" action="accpetsOTP">
		<form:label path="loginOtp"> Enter Your OTP </form:label>
		<form:input path="loginOtp" />
		<br><br>
		<input type="submit">
</form:form>
</body>
</html>