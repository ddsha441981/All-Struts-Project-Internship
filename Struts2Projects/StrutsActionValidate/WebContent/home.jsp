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
<h1 align="center">!!!!!!!!Welcome!!!!!!!!</h1>
<h2 align="center"><s:property value="user"/></h2>
<table border="1" bgcolor="pink">
	<tr>
		<th>User Name</th>
		<th>Password</th>
	</tr>
	<tr><s:property value="/*"/>
		<td><s:property value="user"/></td>
		<td><s:property value="pwd"/></td>
	</tr>

</table>
</body>
</html>