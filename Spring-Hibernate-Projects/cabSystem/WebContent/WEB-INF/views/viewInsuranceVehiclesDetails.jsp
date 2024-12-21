<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Details of Driver Insurance</title>
</head>
<body>
<center>
	<h1>Details of Drivers Insurance </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Vehicle Insurance Id</th>
			<th>Vehicle Id</th>
			<th>Vehicle Name</th>
			
			<th>Model</th>
			<th>Chassis No</th>
			<th>Purchase Date</th>
			<th>Engine No</th>
			<th>Service Tax</th>
			<th>from</th>
			
			<th>To</th>
			<th>Year Type</th>
			<th>Pay Type</th>
			<th>Details</th>
			
		</tr>
		<c:forEach items="${vehicleInsuranceList}" var="list">
		<tr>
			<td>${list.vehicleInsuranceId}</td>
			<td>${list.vehicleNo}</td>
			<td>${list.name}</td>
			<td>${list.model}</td>
			<td>${list.chassisNo}</td>
			<td>${list.purchaseDate}</td>
			<td>${list.engineNo}</td>
			<td>${list.serviceTax}</td>
			<td>${list.from}</td>
			<td>${list.to}</td>
			<td>${list.yearType}</td>
			<td>${list.payType}</td>
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