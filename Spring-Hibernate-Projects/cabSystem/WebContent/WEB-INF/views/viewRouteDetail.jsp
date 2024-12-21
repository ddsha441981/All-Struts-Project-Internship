<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Details</title>
</head>
<body>
<center>
	<h1>Details of Stock Details </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Route Id</th>
			<th>Source</th>
			<th>Destination</th>
			<th>Description</th>
			<th>Manager Id</th>
			<th>Driver Id</th>
			<th>Mobile No</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${routeList}" var="list">
		<tr>
			<td>${list.routeId}</td>
			<td>${list.source}</td>
			<td>${list.destination}</td>
			<td>${list.description}</td>
			<td>${list.mId}</td>
			<td>${list.driverId}</td>
			<td>${list.mobNo}</td>
			
				<td>
				||<a href="#">Edit</a>||
				||<a href="#">Remove</a>||
				||<a href="#">More</a>||
			</td>
			
			
		</tr>
		</c:forEach>
	</table>
</center>

</body>
</html>