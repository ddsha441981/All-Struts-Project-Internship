<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Route</title>
</head>
<body>
<center>
	<h1>Add Route</h1>
	<form action="saveMyRouteDatils" method="get">
	Select Driver :<select name="driverId">
	<option>Select Driver</option>
	<c:forEach items="${driverList}" var="list">
		<option value="${list.driverId }">${list.name }</option>
		</c:forEach>
	</select><br><br>
		Source : <input type="text" name="source"><br><br>
		Destination : <input type="text" name="destination"><br><br>
		Mobile : <input type="text" name="mobNo"><br><br>
		Route Description:<textarea rows="15" cols="25" name="description"></textarea>
		<input type="submit">
		
	</form>
</center>
</body>
</html>