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
<h1><center>View All Interns</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th>Intern ID</th>
<th>Batch ID</th>
<th>Username</th>
<th>Password</th>
<th>First Name</th>
<th>Middle Name</th>
<th>Last Name</th>
<th>Address</th>
<th>Birth Date</th>
<th>Join Date</th>
<th>Mobile Number</th>
<th>E-Mail</th>
<th>Group Id</th>
<th>Project Name</th>  
</tr>

<s:iterator value="list3">
<fieldset>
<tr>
<td><s:property value="intern_id"/></td>
<td><s:property value="batch_id"/></td>
<td><s:property value="intern_username"/></td>
<td><s:property value="intern_password"/></td>
<td><s:property value="intern_first_name"/></td>
<td><s:property value="intern_middle_name"/></td>
<td><s:property value="intern_last_name"/></td>
<td><s:property value="intern_address"/></td>
<td><s:property value="birth_date"/></td>
<td><s:property value="join_date"/></td>
<td><s:property value="intern_mobile_number"/></td>
<td><s:property value="intern_e_mail"/></td>
<td><s:property value="group_id"/></td>
<td><s:property value="project_name"/></td>
</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>