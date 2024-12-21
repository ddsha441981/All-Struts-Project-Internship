<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Register</title>
</head>
<body>
	<center>
		<h1>User Register Page</h1>

		<form:form modelAttribute="userRegisterBeans" action="registerUsers" method="get">

			<form:label path="username">UserName :</form:label>
			<form:input path="username" type="text" placeholder="UserName" />
			<form:errors path="username"></form:errors> <br><br>
			
			<form:label path="email">Email Id :</form:label>
			<form:input path="email" type="text" placeholder="email" />
			<form:errors path="email"></form:errors> <br><br>
			<%-- 
			<form:label path="dob">Date of Birth :</form:label>
			<form:input path="dob" type="date" placeholder="dob" />
			<form:errors path="dob"></form:errors> <br><br>
 --%>			
			<form:label path="contactNo">Contact No :</form:label>
			<form:input path="contactNo" type="text" placeholder="+91xxx0000xxx" />
			<form:errors path="contactNo"></form:errors> <br><br>
			
			<form:label path="address">Address :</form:label>
			<form:textarea path="address" cols="35" rows="5"/>
			<form:errors path="address"></form:errors> <br><br>
			
			<input type="submit">		

		</form:form>
	</center>
</body>
</html>