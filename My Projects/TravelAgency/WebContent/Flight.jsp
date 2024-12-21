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
<s:radio name="jrny" label="Journey" list="{'One Way','Round Trip'}" value="One Way"></s:radio><br>
<s:select name="person" label="Persons" list="{'1','2','3','4','5','6','7','8','9'}"></s:select><br>
<input type="button" value="Search Flights">
</body>
</html>