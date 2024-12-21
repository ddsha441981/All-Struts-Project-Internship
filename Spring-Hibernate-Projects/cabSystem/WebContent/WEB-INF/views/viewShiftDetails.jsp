<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shift Scheduled Details</title>
</head>
<body>
<center>
	<h1>Details of Shift Scheduled Details </h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Shift Id</th>
			<th>Employee Name</th>
			<th>Department name</th>
			<th>Total Employee</th>
			<th>Shift Name</th>
			<th>Starting Point</th>
			<th>Dispatch Time</th>
			<th>Shift Date</th>
			<th>Employee Id</th>
			<th>Route Id</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${shiftList}" var="list">
		<tr>
			<td>${list.shiftId}</td>
			<td>${list.empName}</td>
			<td>${list.departmentName}</td>
			<td>${list.totalEmp}</td>
			<td>${list.shiftName}</td>
			<td>${list.startingPoint}</td>
			<td>${list.dispatchName}</td>
			<td>${list.shiftdate}</td>
			<td>${list.empId}</td>
			<td>${list.routeId}</td>
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