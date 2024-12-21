<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Oil Expenses</title>
</head>
<body>
<center>
	<h1>Oil Expenses</h1>
		<form action="storeDataForOilExpenses">
				Select Vehicle<select name="vehicleNo">
				<option>Select Vehicle</option>
				<c:forEach items="${vehicleList }" var="list">
				<option value="${list.vehicleNo}">${list.name}</option>
				</c:forEach>
				</select><br><br>
				
				Select Driver<select name="driverId">
				<option>Select Driver</option>
				<c:forEach items="${driverList }" var="driver">
				<option value="${driver.driverId}">${driver.name}</option>
				</c:forEach>
				</select><br><br>
			Total KM :<input type="text" name="totalKM"><br><br>
			Oil/Ltr :<input type="text" name="oilLtr"><br><br>
			Price :<input type="text" name="price"><br><br>
			Total Price :<input type="text" name="totalPrice"><br><br>
			Date :<input type="text" name="oilFillDate"><br><br>
			<input type="submit">
		</form>
</center>
</body>
</html>