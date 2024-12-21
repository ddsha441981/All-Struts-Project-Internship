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

<table align=center border="8" bordercolor=black style="background-color:lightblue">
<tr>
<th>Exam ID</th>
<th>Exam Title</th>
<th>Total Marks</th> 
</tr>


<tr>
<td><s:property value="e_id" /></td>
<td><s:property value="e_title"/></td>
<td><s:property value="e_marks"/></td>
</tr>

</table>

<h2>Correct Answers Are:- <s:property value="count"/><br>
Total no of question:-<s:property value="no_que"/><br>
Percentage is:-<s:property value="percentage"/><br>
Total attempted question:-<s:property value="attempted_que"/><br>
</h2>

</body>
</html>