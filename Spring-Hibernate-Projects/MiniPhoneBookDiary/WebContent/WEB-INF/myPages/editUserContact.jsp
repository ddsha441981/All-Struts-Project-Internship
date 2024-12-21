<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>

<center>
<h1>User Contact Update</h1>
<form:form modelAttribute="contactUserBeans" action="${pageContext.request.contextPath}/contactUpdate" method="get">
		<form:hidden path="contactId" value="$obj.contactId"/>
		<form:hidden path="contactId" value="$obj.userId"/>
		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName" type="text" placeholder="Enter First Name" id="firstName" value="${obj.firstName }"/>
		<form:errors path="firstName"></form:errors><br><br>
		
		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName" type="text" placeholder="Enter Last Name" id="lastName" value="${obj.lastName }"/>
		<form:errors path="lastName"></form:errors><br><br>
		
		<form:label path="email">Email Id</form:label>
		<form:input path="email" type="text" placeholder="Enter Email Id" id="email" value="${obj.email }"/>
		<form:errors path="email"></form:errors><br><br>
		
		<form:label path="mobNo">Mobile No.</form:label>
		<form:input path="mobNo" type="text" placeholder="Enter Mobile Number" id="mobNo" value="${obj.mobNo }"/>
		<form:errors path="mobNo"></form:errors><br><br>
		
		<input type="submit">
</form:form>
</center>
</body>
</html>