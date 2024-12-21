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
<h1><center>View All Batches</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th>Batch Id</th>
<th>Batch Name</th>
<th>Start Date</th>
<th>End Date</th>
<th>Technology</th> 
</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="batch_id"/></td>
<td><s:property value="batch_name"/></td>
<td><s:property value="start_date"/></td>
<td><s:property value="end_date"/></td>
<td><s:property value="technology"/></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>