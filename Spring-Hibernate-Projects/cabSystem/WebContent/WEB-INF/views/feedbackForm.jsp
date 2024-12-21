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

<form action="savefeedbackdetails" method="get">


	 Name :<input type="text" name="name"><br><br>
	Email Id<input type="text" name="emailId"><br><br>
	mobile no<input type="text" name="mobNo"><br><br>
	
	 Cab No <select name="vehicleNo">
		<option>Select  Cab No</option>
		<c:forEach items="${vehicleNoList }" var="list">
		<option value="${list.vehicleNo}">${list.vehicleNo}</option>
		</c:forEach>
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
	<input type="submit">
</form>

</center>
</body>
</html>