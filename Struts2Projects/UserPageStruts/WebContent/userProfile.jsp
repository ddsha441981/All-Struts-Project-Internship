<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> User Profile </title>
</head>
<body>
<h1 align="center"> WelCome </h1>
<table>
<tr>
	<th>Profile Picture</th>
</tr>
<tr>
<td><img src="<s:property value="d1.img"/>" height="100" width="100"></td>
</tr>
</table>
<table border="1" bgcolor="pink" height="10" width="10">
		<tr>
			<th>User Name</th>
			<th>Password</th>
			<th>Name</th>
			<th>Email Id</th>
			<th>Mob No.</th>
			<th>Address</th>
			
		</tr>
		
		<tr>
			<td><s:property value="d1.user"/></td>
			<td><s:property value="d1.pwd"/></td>
			<td><s:property value="d1.name"/></td>
			<td><s:property value="d1.eid"/></td>
			<td><s:property value="d1.mno"/></td>
			<td><s:property value="d1.addr"/></td>
		</tr>
</table>

<table>
<tr>
	<th>||<a href="Home.jsp">Home||</a></th>
	<th>||<a href="Home.jsp">Back||</a></th>
	<th>||<a href="addmore.jsp">Add More||</a></th>
</tr>
</table>
</body>
</html>