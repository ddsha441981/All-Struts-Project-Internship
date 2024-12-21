<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Details Employee</title>
</head>
<body>
<center>
	<h1> Register Details Of Employee</h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Emp Id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Date Of Birth</th>
			<th>Mobile No</th>
			<th>Email Id</th>
			<th>Address</th>
			<th>DOJ</th>
			<th>Designation</th>
			<th>Password</th>
			<th>Department</th>
			<th>Manager Id</th>
			<th>Details</th>
		</tr>
		
		<c:forEach items="${empList}" var="list">
		<tr>
		
			<td>${list.empId}</td>
			<td>${list.name}</td>
			<td>${list.gender}</td>
			<td>${list.dob}</td>
			<td>${list.mobNo}</td>
			<td>${list.emailId}</td>
			<td>${list.address}</td>
			<td>${list.doj}</td>
			<td>${list.designation}</td>
			<td>${list.password}</td>
			<td>${list.dptname}</td>
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