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
<table bgcolor="Pink" border="1">
<tr>
	<th>Select PlateForm</th>
	<th>Select Language</th>
	<th>Select Technology</th>

</tr>

<tr>
	<td><s:property value="plateform"/></td>
	<td><s:property value="language"/></td>
	<td><s:property value="tech"/></td>

</tr>

<table>
<tr>
	<th>||<a href="Home.jsp">Home||</a></th>
	<th>||<a href="general.jsp">Back||</a></th>
	<th>||<a href="addmore.jsp">Add More||</a></th>
</tr>
</table>	

</table>
</body>
</html>