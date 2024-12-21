<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Oil Expenses Details</title>
</head>
<body>
<center>
	<h1>View Oil Expenses Details </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Oil Expense Id</th>
			<th>Driver Id</th>
			<th>Vehicle No</th>
			<th>Total KilloMeter</th>
			<th>OilLtr</th>
			<th>price</th>
			<th>Total Price</th>
			<th>Oil Fill Date</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${oilList}" var="list">
		<tr>
			<td>${list.oilexId}</td>
			<td>${list.driverId}</td>
			<td>${list.vehicleNo}</td>
			<td>${list.totalKM}</td>
			<td>${list.oilLtr}</td>
			<td>${list.price}</td>
			<td>${list.totalPrice}</td>
			<td>${list.oilFillDate}</td>
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