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
		<th>Emp_id</th>
		<th>Employee_Name</th>
		<th>Password</th>
		<th>Email</th>
		<th>Mobile No</th>
		<th>Gender</th>
		<th>Criteria</th>
		<th>City</th>
		<th>salary</th>
		<th>Address</th>
		<th>About Employee</th>
		
		
	</tr>

<s:iterator value="emp">
	<tr>
		<td><s:property value="eid"/></td>
		<td> <s:property value="ename"/></td>
			<td> <s:property value="pass"/></td>
		<td><s:property value="eemail"/></td>
		<td> <s:property value="eno"/></td>
		<td> <s:property value="egender"/></td>
		<td><s:property value="ecriteria"/></td>
		<td><s:property value="ecity"/></td>
		<td><s:property value="esalary"/></td>
		<td><s:property value="eadd"/></td>
		<td><s:property value="aboutE"/></td>
	</tr>
	</s:iterator>
</table> 
</body>
</html>