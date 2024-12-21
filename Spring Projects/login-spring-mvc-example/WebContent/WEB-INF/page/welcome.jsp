<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome user</h1>
${sessionScope.userId}
<a href="view">View Login</a><br><br>
<a href="department">Department</a>


<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Password</th>
		<th>Action</th>
		<th>Action</th>
		<th>Action</th>
	</tr>
	<c:forEach items="${K1}" var="k">
	<tr>
		<td>${k.id}</td>
		<td>${k.username}</td>
		<td>${k.password}</td>
		<td><a href="fetchbyId/${k.id}">Retrive By Id</a></td>
		<td><a href="deletedata/${k.id}">Delete</a></td>
		<td><a href="editdata/${k.id}">Edit</a></td>
	</tr>
	</c:forEach>
</table>
<h1>Data Fetch By Id</h1>
<table border="1">
	<tr>
		<th>Id</th>
		<th>UserName</th>
		<th>Password</th>
	</tr>
	<tr>
		<td>${byId.id}</td>
		<td>${byId.username}</td>
		<td>${byId.password}</td>
	</tr>
</table>





</body>
</html>