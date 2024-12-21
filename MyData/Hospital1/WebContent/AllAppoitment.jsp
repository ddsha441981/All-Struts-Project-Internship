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
	<th>Id</th>
		<th>Doctors</th>
		<th>Days</th>
		<th>Name</th>
		<th>Person Rel</th>
		<th>Relation</th>
		<th>Mob</th>
		<th>Email</th>
		<th>Gender</th>
		<th>City</th>
		<th>Query</th>
		<th>Terms</th>
		
		
	</tr>

<s:iterator value="app">
	<tr>
		<td><s:property value="id"/></td>
		<td><s:property value="doctors"/></td>
		<td> <s:property value="day"/></td>
		<td><s:property value="Aname"/></td>
		<td> <s:property value="person"/></td>
		<td> <s:property value="relation"/></td>
		<td><s:property value="mob"/></td>
		<td><s:property value="Aemail"/></td>
		<td><s:property value="pgender"/></td>
		<td><s:property value="pcity"/></td>
		<td><s:property value="qry"/></td>
		<td><s:property value="terms"/></td>
	</tr>
	</s:iterator>
</table> 
</body>
</html>