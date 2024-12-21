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
	<h1>Details of Vehicle </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Vehicle No</th>
			<th>Name</th>
			
			<th>purchase Date</th>
			<th>Capacity</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Total Amount</th>
			<th>Vendor Id</th>
			<th>Manager Id</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${vehicleList}" var="list">
		<tr>
			<td>${list.vehicleNo}</td>
			<td>${list.name}</td>
			<td>${list.purchaseDate}</td>
			<td>${list.capacity}</td>
			<td>${list.price}</td>
			<td>${list.quantity}</td>
			<td>${list.totalAmt}</td>
			<td>${list.vendorId}</td>
			<td>${list.mId}</td>
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