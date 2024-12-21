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
<h1><center>View Leaves Application</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightblue">
<tr>
<th>Intern ID</th>
<th>Intern Name</th>
<th>Task ID</th>
<th>Actual Task</th>
<th>Start Date</th> 
<th>End Date</th>
<th>Status</th>

</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="intern_name"/></td>
<td><s:property value="intern_id"/></td>
<td><s:property value="task_id"/></td>
<td><s:property value="actual_task"/></td>
<td><s:property value="start_date"/></td>
<td><s:property value="end_date"/></td>
<td><s:property value="status"/></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>