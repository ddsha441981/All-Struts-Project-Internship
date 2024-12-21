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
			<th>Driver Insurance Id</th>
			<th>Driver Id</th>
			<th>Driver Name</th>
			
			<th>Nominee Name</th>
			<th>Relation</th>
			<th>Address</th>
			<th>PinCode</th>
			<th>Gender</th>
			<th>Mobile No</th>
			
			<th>Email Id</th>
			<th>Dob</th>
			<th>Age</th>
			<th>From </th>
			<th>To </th>
			<th>Year Type</th>
			<th>Payment Method</th>
			<th>Interest</th>
			<th>Details</th>
			
		</tr>
		<c:forEach items="${insuraceList}" var="list">
		<tr>
			<td>${list.insuranceDId}</td>
			<td>${list.driverId}</td>
			<td>${list.name}</td>
			<td>${list.nomineeName}</td>
			<td>${list.relation}</td>
			<td>${list.address}</td>
			<td>${list.pincode}</td>
			<td>${list.gender}</td>
			<td>${list.mobNo}</td>
			<td>${list.emailId}</td>
			<td>${list.dob}</td>
			<td>${list.age}</td>
			<td>${list.from}</td>
			<td>${list.to}</td>
			<td>${list.yearType}</td>
			<td>${list.payType}</td>
			<td>${list.inserest}</td>
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