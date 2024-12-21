<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback Details</title>
</head>
<body>
<center>
	<h1>Feedback Details </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Accident Id</th>
			<th>Driver Id</th>
			
			<th>Vehicle No</th>
			<th>Insurance Driver Id</th>
			<th>Insurance Driver</th>
			<th>Vehicle InsuranceId</th>
			<th>Vehicle Insurance</th>
			<th>Accident Date</th>
			<th>Place</th>
			<th>Price</th>
			<th>Reason</th>
			<th>Action Taken</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${accidentList}" var="list">
		<tr>
			<td>${list.accidentId}</td>
			<td>${list.driverId}</td>
			<td>${list.vehicleNo}</td>
			<td>${list.insuranceDId}</td>
			<td>${list.insuredDriver}</td>
			<td>${list.vehicleInsuranceId}</td>
			<td>${list.insuredVehicle}</td>
			<td>${list.accidentDate}</td>
			<td>${list.place}</td>
			<td>${list.price}</td>
			<td>${list.reason}</td>
			<td>${list.query}</td>
			<td>
				||<a href="#">Remove</a>||
				||<a href="feedbackActionTakenByAssuredMangerForAccident/${list.accidentId}">Take Action</a>||
				<!-- ||<a href="#">View Acn</a>|| -->
			</td>
			
			
		</tr>
		</c:forEach>
	</table>
</center>

</body>
</html>