<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User Contacts</title>
</head>
<body>

<center>

	<h1>All User List</h1>
<table bgcolor="pink" border="1">
	<tr>
		<th>Contact Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email Id</th>
		<th>Mobile No</th>
		<th>User Id</th>
	</tr>
	
	<c:forEach  items="${contactList}" var="listContacts">
	<tr>
	
		<td>${listContacts.contactId}</td>
		<td>${listContacts.firstName}</td>
		<td>${listContacts.lastName}</td>
		<td>${listContacts.email}</td>
		<td>${listContacts.mobNo}</td>
		<td>${listContacts.userId}</td>
	</tr>
	</c:forEach>
</table>
</center>
</body>
</html>