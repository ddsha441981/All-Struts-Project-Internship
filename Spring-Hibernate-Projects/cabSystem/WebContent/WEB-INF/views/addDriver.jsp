<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Driver</title>
</head>
<body>
<h1>Add New DriverDriver</h1>

<form action="saveDriversDetails" method="get">


	Driver Name :<input type="text" name="name"><br><br>
	Address<input type="text" name="address"><br><br>
	Date of Birth<input type="text" name="dob"><br><br>
	mobile no<input type="text" name="mobNo"><br><br>
	Date of Joining <input type="text" name="doj"><br><br>
	Licence No<input type="text" name="licenceNo"><br><br>
	Expiry Date <input type="text" name="exryDate"><br><br>
	Experience<input type="text" name="experience"><br><br>
	EmailId<input type="text" name="emailId"><br><br>
	Select EmployeeType <select name="employeeType">
		<option>Select EmployeeType</option>
		<option>Driver</option>
		<option>Vendor</option>
		<option>Other</option>
	</select>
	<input type="submit">
</form>
</body>
</html>