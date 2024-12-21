<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Stock</title>
</head>
<body>
<h1>Add New Stock</h1>

<form action="saveDetailsOfStocks" method="get">

	 	Dealer Name :<input type="text" name="dealername"><br><br>
		Stock Type :<input type="text" name="stockType"><br><br>
		SpareParts Name :<input type="text" name="sparePartsName"><br><br>
		Purchase Date :<input type="text" name="purchaseDate"><br><br>
		 Price <input type="text" name="price"><br><br>
		 Quantity <input type="text" name="quantity"><br><br>
		 Total Amt<input type="text" name="totalAmt" ><br><br>
		
		<br><br>
	
	<input type="submit">
</form>
</body>
</html>