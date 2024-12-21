<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback Form</title>
</head>
<body>
	<center>
	<h1>Feedback Form</h1>
<c:forEach items="${feedbackList }" var="list">
<form action="${pageContext.request.contextPath}/saveActionTakenStoreInDatabase" method="get">
	
	<input type="hidden" name="feedbackId" value="${list.feedbackId }">
	 Name :<input type="text" name="name" value="${list.name}"><br><br>
	Email Id<input type="text" name="emailId" value="${list.emailId}"><br><br>
	mobile no<input type="text" name="mobNo" value="${list.mobNo}"><br><br>
	
	 Cab No <select name="vehicleNo">
		<option>Select  Cab No </option>
		
		<option value="${list.vehicleNo}">${list.vehicleNo}</option>
		
	</select><br><br>
	
	 Cab Arrived <select name="cabArrived">
		<option>Select  Cab Arrived</option>
		<option>Timely</option>
		<option>Late</option>
		<option>Not Sure</option>
	</select><br><br>
	
	 Cab Condition <select name="cabCondition">
		<option>Select  Cab Condition</option>
		<option>Good</option>
		<option>Medium</option>
		<option>Worst</option>
	</select><br><br>
	
	 Driver Skills <select name="driverSkills">
		<option>Select  Driver Skills</option>
		<option>Good</option>
		<option>Medium</option>
		<option>Worst</option>
	</select><br><br>
	 Driver Behavior <select name="driverBehavior">
		<option>Select  Driver Behavior</option>
		<option>Friendly</option>
		<option>?</option>
		<option>??</option>
	</select><br><br>
	OverAll Experience <select name="cabExperience">
		<option>Select  Cab No</option>
		<option>Good</option>
		<option>Worst</option>
	</select><br><br>
	
	Complaint:<textarea rows="10" cols="25" name="complaint"></textarea><br><br>
	Query:<textarea rows="10" cols="25" name="query"></textarea><br><br>
	<input type="submit">
</form>
</c:forEach>
</center>
</body>
</html>