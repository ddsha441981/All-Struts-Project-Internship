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
			<th>Feedback Id</th>
			<th>Name</th>
			
			<th>Email Id</th>
			<th>Mobile No</th>
			<th>vehicle No</th>
			<th>Cab Arrived</th>
			<th>Cab Condition</th>
			<th>Driver Skill</th>
			<th>Driver Behavior</th>
			<th>Cab Experience</th>
			<th>Complaint</th>
			<th>Action Taken</th>
			<th>Details</th>
		</tr>
		<c:forEach items="${feedbackList}" var="list">
		<tr>
			<td>${list.feedbackId}</td>
			<td>${list.name}</td>
			<td>${list.emailId}</td>
			<td>${list.mobNo}</td>
			<td>${list.vehicleNo}</td>
			<td>${list.cabArrived}</td>
			<td>${list.cabCondition}</td>
			<td>${list.driverSkills}</td>
			<td>${list.driverBehavior}</td>
			<td>${list.cabExperience}</td>
			<td>${list.complaint}</td>
			<td>${list.query}</td>
			<td>
				||<a href="#">Remove</a>||
				||<a href="feedbackActionTakenByAssuredManger/${list.feedbackId}">Take Action</a>||
				<!-- ||<a href="#">View Acn</a>|| -->
			</td>
			
			
		</tr>
		</c:forEach>
	</table>
</center>

</body>
</html>