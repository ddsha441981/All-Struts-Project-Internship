<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TripSheet Details</title>
</head>
<body>
<center>
	<h1>Vehicle Allocation Details </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Trip Id</th>
			<th>Vehicle No</th>
			<th>Allocated Id</th>
			<th>Rate/Km</th>
			<th>Total Km</th>
			<th>Total Amount</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${tripList}" var="list">
		<tr>
			<td>${list.tripsheetId}</td>
			<td>${list.vehicleNo}</td>
			<td>${list.allocateId}</td>
			<td>${list.rateKm}</td>
			<td>${list.totalKm}</td>
			<td>${list.totalAmt}</td>
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