<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="/struts-tags" prefix="s" %>
</head>
<body>
<s:select name="src" label="Source" list="{'Pune','Kolhapur','Mumbai','Belgaon','Banglore','Panjim','Hyderabad','Indore','Ahemadabad','Nagpur'}" value="Select"></s:select><br>
<s:select name="dst" label="Destination" list="{'Pune','Kolhapur','Mumbai','Belgaon','Banglore','Panjim','Hyderabad','Indore','Ahemadabad','Nagpur'}" value="Select"></s:select><br>
<s:radio name="tatkal" label="Tatkal" list="{'General','Ladies','3 Tier AC','2 Tier AC','1st Class AC','2nd Class Sleeper'}" value="General"></s:radio><br>
<s:textfield label="Date Of Journey" name="jrney date"></s:textfield><br>
<input type="button" value="Search Trains">

</body>
</html>