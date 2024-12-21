<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accident Form</title>
</head>
<body>
	<center>
	<h1>Accident Form</h1>

<form action="saveAccidentdetails" method="get">


	 <!-- Name :<input type="text" name="name"><br><br>
	Email Id<input type="text" name="emailId"><br><br>
	mobile no<input type="text" name="mobNo"><br><br>
	 -->
	 Driver Name <select name="driverId">
		<option>Select  Driver Name</option>
		<c:forEach items="${driverList }" var="list1">
		<option value="${list1.driverId}">${list1.name}</option>
		</c:forEach>
	</select><br><br>
	
	Vehicle No <select name="vehicleNo">
		<option>Select  Vehicle No</option>
		<c:forEach items="${vehicleNoList}" var="list2">
		<option value="${list2.vehicleNo}">${list2.vehicleNo}</option>
		</c:forEach>
	</select><br><br>
	
	
	Driver Insurance <select name="insuranceDId">
		<option>Driver Insurance</option>
		<c:forEach items="${driverInsuranceList }" var="list3">
		<option value="${list3.insuranceDId}">${list3.name}</option>
		</c:forEach>
	</select><br><br>
	
	Select Driver Insured<select name="insuredDriver">
		<option>Select Driver Insured</option>
		<option>Yes</option>
		<option>No</option>
		<option>Processing</option>
	</select>
	<br><br>
	
	Vehicle Insurance <select name="vehicleInsuranceId">
		<option>Vehicle Insurance</option>
		<c:forEach items="${vehicleInsuranceList }" var="list4">
		<option value="${list4.vehicleInsuranceId}">${list4.name}</option>
		</c:forEach>
	</select><br><br>
	Select Vehicle Insured<select name="insuredVehicle">
		<option>Select Vehicle Insured</option>
		<option>Yes</option>
		<option>No</option>
		<option>Processing</option>
	</select>
	<br><br>
	
	Accident Date<input type="text" name="accidentDate"><br><br>
	Accident Place<input type="text" name="place"><br><br>
	 Price<input type="text" name="price"><br><br>
	Reason:<textarea rows="10" cols="25" name="reason"></textarea><br><br>
	<input type="submit">
</form>

</center>
</body>
</html>