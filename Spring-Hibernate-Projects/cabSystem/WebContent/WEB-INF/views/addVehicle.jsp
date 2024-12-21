<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Vehicle</title>
</head>
<body>
<h1>Add New Vehicle</h1>

<form action="addVehiclesDetails" method="get">

	 	Vehicle No :<input type="text" name="vehicleNo"><br><br>
		Vehicle Name :<input type="text" name="name"><br><br>
		Vehicle Purchase Date :<input type="text" name="purchaseDate"><br><br>
		Vehicle Capacity <input type="text" name="capacity"><br><br>
		Vehicle Price <input type="text" name="price"><br><br>
		Vehicle Quantity <input type="text" name="quantity"><br><br>
		Vehicle Total Amt<input type="text" name="totalAmt" ><br><br>
		
		Select Vendor :<select name="vendorId">
			<option>Select Vendor</option>
			<c:forEach items="${vendorList}" var="list">
			<option value="${list.vendorId }">${list.name }</option>
			</c:forEach>
		</select>
		<br><br>
	
	<input type="submit">
</form>
</body>
</html>