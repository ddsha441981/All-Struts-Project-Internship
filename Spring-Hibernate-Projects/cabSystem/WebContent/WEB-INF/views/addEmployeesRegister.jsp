<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Employee</title>
</head>
<body>


<center>
<h1>Add New Employee</h1>
	<!-- <a href="addOfficialEmployeeRegister">Add Employee Official Details </a><br><br> -->
	
	<form action="employeeRegisterByHR">
		 Name :<input type="text" name="name"><br><br>
		<!-- Last Name :<input type="text" name="lname"><br><br> -->
		Gender  :<input type="radio" name="gender" value="male">Male
		<input type="radio" name="gender" value="female">Female<br><br>
		Dob :<input type="text" name="dob"><br><br>
		Mobile No :<input type="text" name="mobNo"><br><br>
		Email :<input type="text" name="emailId"><br><br>
		<!-- Driving No :<input type="text" name="drivingNoDate"><br><br>
		Driving Exp Date :<input type="text" name="drivingExDate"><br><br>
 -->		<!-- Contact No :<input type="text" name="contNo"><br><br> -->
		Address :<textarea rows="5" cols="25" name="address"></textarea>
		
		<br><br>
		Select Department:
	<select name="dptname">
	
		<option>Select Department</option>
		<option>Java Doveloper</option>
		<option>Net Doveloper</option>
		<option>PHP Dovloper</option>
		
	</select><br><br>
		<!-- Work EmailId :<input type="text" name="emailId"><br><br>
		Age :<input type="text" name="age"><br><br> -->
		Date Of Joining :<input type="text" name="doj"><br><br>
		Designation :<input type="text" name="designation"><br><br>
		
		<!-- <center>
		<h3>Earnings</h3>
		Basic & DA :<input type="text" name="basic"><br><br>
		HRA :<input type="text" name="hra"><br><br>
		Conveny :<input type="text" name="convy"><br><br>
		Total Addition :<input type="text" name="totalAdd"><br><br>
		</center>
		
		<center>
		<h3>Deduction</h3>
		Provident Fund :<input type="text" name="provident"><br><br>
		ESI :<input type="text" name="esi"><br><br>
		Total Deduction :<input type="text" name="totalDeduction"><br><br>
		Net Salary :<input type="text" name="netSalary"><br><br> -->
		<input type="submit">

</form>
</center>
</body>
</html>