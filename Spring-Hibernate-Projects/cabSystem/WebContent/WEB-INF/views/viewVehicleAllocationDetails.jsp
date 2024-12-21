<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Allocation Details</title>
</head>
<body>
<center>
	<h1>Vehicle Allocation Details </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Allocate Id</th>
			<th>Vehicle No</th>
			<th>Employee Id</th>
			<th>Driver Id</th>
			<th>Route Id</th>
			<th>PickUp Point</th>
			<th>Drop Point</th>
			<th>Allocated Date</th>
			<th>Allocated Time</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${allocationList}" var="list">
		<tr>
			<td>${list.allocateId}</td>
			<td>${list.vehicleNo}</td>
			<td>${list.empId}</td>
			<td>${list.driverId}</td>
			<td>${list.routeId}</td>
			<td>${list.pickPoint}</td>
			<td>${list.dropPoint}</td>
			<td>${list.allocatedDate}</td>
			<td>${list.allocatedTime}</td>
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