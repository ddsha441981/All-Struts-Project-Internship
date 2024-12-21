<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New SpareParts</title>
</head>
<body>
<h1>Add New SpareParts</h1>

<form action="saveDetailsOfspareParts" method="get">

	 	SparePart Type :<input type="text" name="sparetype"><br><br>
		SpareParts Name :<input type="text" name="name"><br><br>
		 Quantity <input type="text" name="quantity"><br><br>
		 Date<input type="text" name="date" ><br><br>
		<select name="vehicleNo">
		
			<option>Select Vechicle</option>
			<c:forEach items="${vehicleList}" var="list">
			<option value="${list.vehicleNo }">${list.name }</option>
			</c:forEach>
		</select>
		<br><br>
	
	<input type="submit">
</form>
</body>
</html>