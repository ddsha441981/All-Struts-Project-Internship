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
<h1><center>View All Feedback</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightblue">
<tr>
<th>Intern Id</th>
<th>Interns Name</th>
<th>E-Mail-ID</th>
<th>Current Date</th>
<th>Feedback</th> 
</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="intern_id"/></td>
<td><s:property value="interns_name"/></td>
<td><s:property value="e_mail_id"/></td>
<td><s:property value="current_date"/></td>
<td><s:property value="feedback"/></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>