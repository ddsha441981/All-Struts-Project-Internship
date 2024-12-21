<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shift Schedule</title>
</head>
<body>
<h1>Add ShiftSchedule</h1>

<form action="addShiftSchedule" method="get">

		Select Route <select name="routeId">
		<option>Select Route</option>
		<c:forEach items="${routeList}" var="list">
		<option value="${list.routeId }">${list.routeId}</option>
		</c:forEach>
		</select>
		<br><br>
		
		Select Employee Name <select name="empId">
		<option>Select Employee Name</option>
		<c:forEach items="${empList }" var="eList">
		<option value="${eList.empId }">${eList.name }</option>
		</c:forEach>
		</select>
		<br><br>
	 	
	 	Enter Employee Name :<input type="text" name="empName"><br><br>
		Department :<input type="text" name="departmentName"><br><br> 
		Total Employee :<input type="text" name="totalEmp"><br><br>
		 Shift Name <input type="text" name="shiftName"><br><br>
		 Starting Point <input type="text" name="startingPoint"><br><br>
		Dispatch Time<input type="text" name="dispatchName" ><br><br>
		Date<input type="text" name="shiftdate" ><br><br>
		
		<br><br>
	
	<input type="submit">
</form>
</body>
</html>