<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users Added using Ajax</title>
</head>
<body>
	<center>
		<h1>The following are the users added in the list :</h1><br>
		
		<table border="1" bgcolor="pink">
			<thead>
				<th>Name</th>
				<th>Education</th>
			</thead>
			
			<tbody>
			<c:forEach items="${Users}" var="user">
				<tr>
					<td>${user.name}</td>
					<td>${user.education}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
	</center>
</body>
</html>
