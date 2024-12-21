<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cab Service</title>
<%@taglib uri="/struts-tags" prefix="s"  %>
<style type='text/css'>
.ito-image {
	display: block;
	position: relative;
	top: 0;
	width: 61%;
	z-index: 1;
	margin-left: 17%;
}

</style>


</head>
<body>

<h2 align="left">Keyzz Resorts</h2>



	<img src="img/Travel.jpg"
		alt="Link to JW Marriott Los Cabos Beach Resort &amp; Spa"
		class="ito-image">
<h1 align="center">Book Your Cab Now...!!!</h1>


<div align="center">
<label>Type Of Cab</label>
<s:select list="{'Mini','Sedan','Suv','Auto'}"></s:select><br>
<s:textfield label="Your Location"></s:textfield><br>
<s:textfield label="Destination"></s:textfield><br>
</div>

</body>
</html>