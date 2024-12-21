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
<h1>View All Group Leader</h1>
<table align=center border="8" bordercolor=black style="background-color:lightblue">
<tr>
<th>Batch ID</th>
<th>Intern ID</th>
<th>Group ID</th>
<th>Username</th>
<th>Password</th> 
</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="batch_id"/></td>
<td><s:property value="intern_id"/></td>
<td><s:property value="group_id"/></td>
<td><s:property value="username"/></td>
<td><s:property value="password"/></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>