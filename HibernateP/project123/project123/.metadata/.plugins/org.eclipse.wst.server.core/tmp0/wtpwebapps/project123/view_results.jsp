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
<h1><center>View All Results</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th> ID </th>
<th> Exam Date </th>
<th> Percentage </th>
<th> Interns ID </th>
<th> Exam ID </th>
</tr>
<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="id"/></td>
<td><s:property value="Exam_date"/></td>
<td><s:property value="percentage"/></td>
<td><s:property value="user_id"/></td>
<td><s:property value="e_id.exam_id"/></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>