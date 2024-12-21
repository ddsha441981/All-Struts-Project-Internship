<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Driver Insurance Register Form</title>
</head>
<body>
<center>
	<h1>Driver Insurance Register Form</h1>
	<form action="insuranceSaveForDriver">
	Insurance For:
		<select name="driverId">
			<option>Select Driver Name</option>
			<c:forEach items="${driverList}" var="list">
			<option value="${list.driverId }">${list.name}</option>
			</c:forEach>
		</select><br><br>
		Name:<input type="text" name="name"><br><br>
		Nominee Name:<input type="text" name="nomineeName"><br><br>
		Relations:<input type="text" name="relation"><br><br>
		Address:<textarea rows="3" cols="25" name="address"></textarea><br><br>
		Pin code:<input type="text" name="pincode"><br><br>
		Gender:<input type="radio" name="gender" value="male">Male
		<input type="radio" name="gender" value="female">FeMale<br><br>
		Mobile No:<input type="text" name="mobNo"><br><br>
		Email Id:<input type="text" name="emailId"><br><br>
		Dob:<input type="text" name="dob"><br><br>
		Age:<input type="text" name="age"><br><br>
		From :<input type="text" name="from"><br><br>
		To :<input type="text" name="to"><br><br>
		
		Year Type:
		<select name="yearType">
			<option>Select Year Type</option>
			<option>Half Yearly</option>
			<option>Yearly</option>
		</select><br><br>
		Pay Type:
		<select name="payType">
			<option>Select Payment Method</option>
			<option>Cash</option>
			<option>Card</option>
			<option>Cheque</option>
		</select><br><br>
		Interest:<input type="text" name="inserest"><br><br>
		<input type="submit">
		
	</form>
</center>
</body>
</html>