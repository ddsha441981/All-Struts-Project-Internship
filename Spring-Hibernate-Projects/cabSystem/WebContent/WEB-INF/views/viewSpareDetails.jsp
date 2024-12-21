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
			<th>Spare Id</th>
			<th>Spare Type</th>
			<th>Quantity</th>
			<th>Spare Name</th>
			<th>Date</th>
			<th>Vehicle No</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${spareList}" var="list">
		<tr>
			<td>${list.spareId}</td>
			<td>${list.sparetype}</td>
			<td>${list.quantity}</td>
			<td>${list.name}</td>
			<td>${list.date}</td>
			<td>${list.vehicleNo}</td>
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