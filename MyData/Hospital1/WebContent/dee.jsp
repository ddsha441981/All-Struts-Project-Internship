<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Doctors</h1>

<table border="1">
	<tr>
		<th>Name</th>
		<th>Skill</th>
		<th>Aboutus<th>
	</tr>
	<s:iterator value="All">
	<tr>
		
		<td><s:property value="name"/></td>
		<td><s:property value="skill"/></td>
		<td><s:property value="aboutus"/></td>
		<td><a href="showprofile.action?id=<s:property value="id"/>">View More</a></td>
		
	</tr>
	</s:iterator>
</table>


</body>
</html>