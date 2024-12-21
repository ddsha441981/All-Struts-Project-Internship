<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Details Manager</title>
</head>
<body>
<center>
	<h1>Details of Drivers </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Driver Id</th>
			<th>Name</th>
			
			<th>Address</th>
			<th>Mobile No</th>
			<th>Date Of Birth</th>
			<th>Date of Joining</th>
			<th>Lience No</th>
			<th>Exry  Date</th>
			<th>Experience</th>
			<th>Emaild</th>
			<th>Employee Type</th>
			<th>ManagerId</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${driverList}" var="list">
		<tr>
			<td>${list.driverId}</td>
			<td>${list.name}</td>
			<td>${list.address}</td>
			<td>${list.mobNo}</td>
			<td>${list.dob}</td>
			<td>${list.doj}</td>
			<td>${list.licenceNo}</td>
			<td>${list.exryDate}</td>
			<td>${list.experience}</td>
			<td>${list.emailId}</td>
			<td>${list.employeeType}</td>
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