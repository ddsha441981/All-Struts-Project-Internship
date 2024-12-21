<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.colll
{
background-color: pink;
width: 100%;
border-bottom-style: dashed;
}
</style>
</head>
<body>
<table class="colll" >

	<tr>
		<th>Patient_id</th>
		<th>Patient_Name</th>
		<th>Patient Email</th>
		<th>Mobile</th>
		<th>Address</th>
		<th>Gender</th>
		<th>City</th>
		<th>Query</th>
		
	</tr>

<s:iterator value="list2">
	<tr>
		<td><s:property value="pid"/></td>
		<td> <s:property value="pname"/></td>
		<td><s:property value="pmail"/></td>
		<td> <s:property value="pno"/></td>
		<td> <s:property value="padd"/></td>
		<td><s:property value="pgender"/></td>
		<td><s:property value="pcity"/></td>
		<td><s:property value="pques"/></td>
	</tr>
	</s:iterator>
</table> 
</body>
</html>