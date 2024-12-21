<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insurance Register Form</title>
</head>
<body>
<center>
	<h1>Insurance Register Form</h1>
	<form action="dataofVehicleInsuranceSave"> 
	Insurance For Vehicle:
		<select name="vehicleNo">
			<option>Select Vehicles </option>
			<c:forEach items="${vehicleList }" var="list">
			<option value="${list.vehicleNo }">${list.name}</option>
			</c:forEach>
		</select><br><br>
		 Name:<input type="text" name="name"><br><br>
		Model:<input type="text" name="model"><br><br>
		chassis No:<input type="text" name="chassisNo"><br><br>
		Purchase Date:<input type="text" name="purchaseDate"><br><br>
		Engine No:<input type="text" name="engineNo"><br><br>
		service tax:<input type="text" name="serviceTax"><br><br>
		From :<input type="text" name="from"><br><br>
		To :<input type="text" name="to"><br><br>
		
		Year Type:
		<select name="yearType">
			<option>Year Type</option>
			<option>Half Yearly</option>
			<option>Yearly</option>
		</select><br><br>
		Pay Type:
		<select name="payType">
			<option>Pay Type</option>
			<option>Cash</option>
			<option>Card</option>
			<option>Cheque</option>
		</select><br><br>
		
		<input type="submit">
		
	</form>
</center>
</body>
</html>