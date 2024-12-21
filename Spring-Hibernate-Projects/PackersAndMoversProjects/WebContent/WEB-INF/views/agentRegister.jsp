<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agent Register</title>
</head>
<body>
<center>

<h1>Agent Register</h1>

<form:form modelAttribute="agentBeans" method="get" action="${pageContext.request.contextPath}/agentRegisterDataSubmitingForm">
		<form:label path="name">Agent Name</form:label>
		<form:input path="name" placeholder="Agent Name" /> <br><br>
		
		<form:label path="emailId">Email Id</form:label>
		<form:input path="emailId" placeholder="Email Id"/> <br><br>
		
		<form:label path="phone">Phone</form:label>
		<form:input path="phone" placeholder="Phone"/> <br><br>
		
		<form:label path="mobNo">Mobile Number</form:label>
		<form:input path="mobNo" placeholder="Mobile No" value="+91"/> <br><br>
		
		<form:label path="name_org">Name Of Org</form:label>
		<form:input path="name_org" placeholder="name_org"/> <br><br>
		
		
		<form:label path="pincode">PinCode</form:label>
		<form:input path="pincode" placeholder="pincode"/> <br><br>
		
		
		<form:label path="state">State</form:label>
		<form:input path="state" placeholder="state"/> <br><br>
		
		<form:label path="city">City</form:label>
		<form:input path="city" placeholder="city"/> <br><br>
		
		<form:label path="address">Address</form:label>
		<form:textarea path="address" cols="25" rows="5"/> <br><br>
		
		<form:label path="service_Id">Select Service :</form:label>
			 <form:select path="service_Id">
			<form:option value="0">Select Service</form:option>
			<form:option value="1">A</form:option>
			<form:option value="2">B</form:option>
			<form:option value="3">C</form:option>
			</form:select>
			<br><br>
		<input type="submit">
		
</form:form>
</center>



</body>
</html>