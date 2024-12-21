<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TripSheet</title>
</head>
<body>
	<center>
		<h1>TripSheet</h1>
		<form action="storeTripSheet">
			
			Select Vehicle <select name="vehicleNo">
				<option disabled="disabled">Select Vehicle</option>
				<c:forEach items="${vehicleList }" var="list">
					<option value="${list.vehicleNo}">${list.name}</option>
				</c:forEach>
			</select><br><br> 
			
			Select Vehicle Allocation <select name="allocateId">
				<option disabled="disabled">Select Vehicle Allocation</option>
				<c:forEach items="${vehicleAllocatedList }" var="allocated">
					<option value="${allocated.allocateId}">${allocated.allocateId}</option>
					
				</c:forEach>
			</select><br><br> 
			
			Rate/Km :<input type="text" name="rateKm"><br>
			<br> Total Km :<input type="text" name="totalKm"><br>
			<br> Total Amount :<input type="text" name="totalAmt"><br>
			<br> <input type="submit">
		</form>
	</center>
</body>
</html>