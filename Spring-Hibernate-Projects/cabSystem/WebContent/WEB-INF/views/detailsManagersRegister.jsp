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
	<h1>Details Managers Of Register</h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>Manager Id</th>
			<th> Name</th>
			
			<th>Gender</th>
			<th>Date Of Birth</th>
			<th>Date of Joining</th>
			<th>Mobile No</th>
			<th>Email Id</th>
			<th>Password</th>
			<th>Dpt Id</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${managerList}" var="list">
		<tr>
			<td>${list.mId}</td>
			<td>${list.name}</td>
			<td>${list.gender}</td>
			<td>${list.dob}</td>
			<td>${list.doj}</td>
			<td>${list.mobNo}</td>
			<td>${list.emailId}</td>
			<td>${list.password}</td>
			<td>${list.dptId}</td>
			<td>
				<a href="#">Edit</a>
				<a href="#">Remove</a>
				<a href="#">More</a>
			</td>
			
			
		</tr>
		</c:forEach>
	</table>
</center>






<center>
	<h1>Details Managers Of Official</h1>
	
	<table border="1" bordercolor="pink">
		<tr>
			<th>DepartMent</th>
			<th>Work EmailId</th>
			<th>Age</th>
			<th>Qualification</th>
			<th>DOJ</th>
			<th>Designation</th>
			<th>Experience</th>
			<th>Details</th>
		</tr>
		
		<tr>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			
		</tr>
	</table>
</center>
</body>
</html>