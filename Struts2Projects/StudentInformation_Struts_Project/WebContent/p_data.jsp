<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">@@@ Welcome <s:property value="uname"/> @@@ </h1>
<table border="10" bgcolor="pink">

<tr>
	<th>User Name</th>
	<th>Password</th>
	<th>First Name</th>
	<th>Middle Name</th>
	<th>Last Name</th>
	<th>Email Id</th>
	<th>Address</th>
	<th>Preffered Language</th>
	<th>Martial Status</th>
	<th>Select Your Interested</th>
</tr>

<tr>
	<td><s:property value="uname"/></td>
	<td><s:property value="pwd"/></td>
	<td><s:property value="fname"/></td>
	<td><s:property value="mname"/></td>
	<td><s:property value="lname"/></td>
	<td><s:property value="eid"/></td>
	<td><s:property value="addr"/></td>
	<td><s:property value="language"/></td>
	<td><s:property value="status"/></td>
	<td><s:property value="skill"/></td>
</tr>
	
<table>
<tr>
	<th>||<a href="Home.jsp">Home||</a></th>
	<th>||<a href="personal.jsp">Back||</a></th>
	<th>||<a href="addmore.jsp">Add More||</a></th>
</tr>
</table>	

</table>
</body>
</html>