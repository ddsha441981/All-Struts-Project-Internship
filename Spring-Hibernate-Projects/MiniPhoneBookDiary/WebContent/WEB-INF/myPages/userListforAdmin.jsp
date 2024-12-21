<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List For Admin</title>
</head>
<body>


<center>

	<h1>All User List</h1>
<table bgcolor="pink" border="1">
	<tr>
		<th>User Id</th>
		<th>User Name</th>
		<th>Email Id</th>
		<th>Auto Password</th>
		<th>Mobile No</th>
		<th>Address</th>
		<th>Role</th>
		<th>View Contacts</th>
	</tr>
	
	<c:forEach  items="${userList}" var="listUser">
	<tr>
	
		<td>${listUser.userId}</td>
		<td>${listUser.username}</td>
		<td>${listUser.email}</td>
		<td>${listUser.autoPassword}</td>
		<td>${listUser.contactNo}</td>
		<td>${listUser.address}</td>
		<td>${listUser.userRole}</td>
		<td><a href="ViewContactsById/${listUser.userId}">View</a></td>
		
		
	</tr>
	</c:forEach>
</table>
</center>
</body>
</html>