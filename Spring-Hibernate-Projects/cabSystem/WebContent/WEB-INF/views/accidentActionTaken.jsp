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
<c:forEach items="${usingId }" var="list1">
<form action="${pageContext.request.contextPath}/takeActionByQualityManger" method="get">


	 <!-- Name :<input type="text" name="name"><br><br>
	Email Id<input type="text" name="emailId"><br><br>
	mobile no<input type="text" name="mobNo"><br><br>
	 -->
	<%--  Driver Name <select name="driverId">
		<option>Select  Driver Name</option>
		
		<option value="${list1.driverId}">${list1.driverId}</option>
		
	</select><br><br>
	
	Vehicle No <select name="vehicleNo">
		<option>Select  Vehicle No</option>
		
		<option value="${list1.vehicleNo}">${list1.vehicleNo}</option>
		
	</select><br><br>
	
	
	Driver Insurance <select name="insuranceDId">
		<option>Driver Insurance</option>
		
		<option value="${list1.insuranceDId}">${list3.name}</option>
		
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
		
		<option value="${list1.vehicleInsuranceId}">${list1.name}</option>
		
	</select><br><br>
	Select Vehicle Insured<select name="insuredVehicle">
		<option>Select Vehicle Insured</option>
		<option>Yes</option>
		<option>No</option>
		<option>Processing</option>
	</select>
	<br><br> --%>
	<input type="hidden" name="accidentId" value="${list1.accidentId }">
	Accident Date<input type="text" name="accidentDate" value="${list1.accidentDate}"><br><br>
	Accident Place<input type="text" name="place" value="${list1.place}"><br><br>
	 Price<input type="text" name="price" value="${list1.price}"><br><br>
	query:<textarea rows="10" cols="25" name="query" ></textarea><br><br>
	<input type="submit">
</form>
</c:forEach>
</center>
</body>
</html>