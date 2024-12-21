<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Allocation</title>
</head>
<body>

<center>
	<h1>Vehicle Allocation </h1>
	
	<form action="saveVehicleAllocationDetails">
		Select Vehicle:
		<select name="vehicleNo">
			<option>Select Vehicle</option>
			<c:forEach items="${vehicleList }" var="vehicle">
			<option value="${vehicle.vehicleNo }">${vehicle.name }</option>
			</c:forEach>
		</select><br><br>
		
		Select Employees:
		<select name="empId">
			<option>Select Employees</option>
			<c:forEach items="${empList }" var="emp">
			<option value="${emp.empId }">${emp.name }</option>
			</c:forEach>
		</select><br><br>
		
		Select Driver:
		<select name="driverId">
			<option>Select Driver</option>
			<c:forEach items="${driverList }" var="driver">
			<option value="${ driver.driverId}">${ driver.name}</option>
			</c:forEach>
		</select><br><br>
		
		Select Route:
		<select name="routeId">
			<option>Select Route</option>
			<c:forEach items="${routeList}" var="route">
			<option value="${route.routeId}">${route.source}</option>
			</c:forEach>
		</select><br><br>
		
		Pick Up Point<input type="text" name="pickPoint"><br><br>
		Drop Point<input type="text" name="dropPoint"><br><br>
		Date<input type="text" name="allocatedDate"><br><br>
		Time<input type="text" name="allocatedTime"><br><br>
		<input type="submit">
	</form>
</center>

</body>
</html>