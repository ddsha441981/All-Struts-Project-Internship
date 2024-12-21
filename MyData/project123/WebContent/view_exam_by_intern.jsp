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

<h1><center>Exams</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightblue">
<tr>
<th>Exam ID</th>
<th>Exam Title</th>
<th>Created Date</th>
<th>Total Marks</th>
<th>Give Exam</th> 
</tr>
<s:iterator value="list">
<tr>
<td><s:property value="exam_id"/></td>
<td><s:property value="exam_title"/></td>
<td><s:property value="created_date"/></td>
<td><s:property value="total_marks"/></td>
<td><a class="viewQue" href="give_exam.action?exam_id=<s:property value="exam_id"/>">Give Exam</a></td>
</tr>
</s:iterator>
</table>
</body>
</html>