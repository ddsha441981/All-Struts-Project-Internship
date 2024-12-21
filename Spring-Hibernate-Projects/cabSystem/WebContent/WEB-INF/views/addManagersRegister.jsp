<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mangaer Register</title>
</head>
<body>
<center>
	<h1>Manager Register</h1>
	
	<!-- <a href="addOfficialManagerDetails">Add Manager Official Details </a><br><br> -->
	
	<form action="saveManagersData">
	Select Department:
	<select name="dptId">
	
		<option>Select Department</option>
		<c:forEach items="${dptlist}" var="list">
		<option value="${list.dptId }">${list.dptname }</option>
		</c:forEach>
		
	</select><br><br>
		 Name :<input type="text" name="name"><br><br>
		<!-- Last Name :<input type="text" name="lname"><br><br> -->
		Gender  :<input type="radio" name="gender" value="male">Male
		<input type="radio" name="gender" value="female">Female<br><br>
		Dob :<input type="text" name="dob"><br><br>
		doj :<input type="text" name="doj"><br><br>
		Mobile No :<input type="text" name="mobNo"><br><br>
		Email :<input type="text" name="emailId"><br><br>
		<!-- Driving No :<input type="text" name="drivingNoDate"><br><br>
		Driving Exp Date :<input type="text" name="drivingExDate"><br><br>
		 -->
		<!-- Contact No :<input type="text" name="contNo"><br><br> -->
		Address :<textarea rows="5" cols="25" name="address"></textarea>
		<input type="submit">
	</form>
</center>
</body>
</html>