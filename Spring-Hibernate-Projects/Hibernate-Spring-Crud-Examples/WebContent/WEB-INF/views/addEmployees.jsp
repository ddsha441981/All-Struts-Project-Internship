<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Employess</title>
</head>
<body>
<center>
	<h1>Add New Employee</h1>
	<hr>
	<form:form action="saveMyemployees" method="post" modelAttribute="employee">
		<form:label path="empId">EmpId :-</form:label>
		<form:input  path="empId"/><br>
		
		<form:label path="empName">EmpName :-</form:label>
		<form:errors path="empName"/>
		<form:input path="empName"/><br>
		
		<form:label path="empsalary">EmpSalary :-</form:label>
		<form:input path="empsalary"/><br>
		
		<form:label path="empAge">EmpAge :-</form:label>
		<form:input path="empAge"/><br>
		
		<form:label path="empAdd">EmpAddress :-</form:label>
		<form:input path="empAdd"/><br>
		
		<input type="submit">
	</form:form>
	
	<c:forEach items="empList" var="list">
	${list.empId}
	</c:forEach>
</center>
</body>
</html>