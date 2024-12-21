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
<h1>This is My Home Page</h1>
<table border="1" bgcolor="pink">
<tr>
	<th>Name</th>
	<th>Company</th>
	<th>Massage</th>

</tr>

<tr>
	<td><s:property value="#request.name" default="not set"/></td>
	<td><s:property value="#request.company" default="not set"/></td>
	<td><s:property value="massage" default="not set"/></td>
</tr>

</table>


</body>
</html>