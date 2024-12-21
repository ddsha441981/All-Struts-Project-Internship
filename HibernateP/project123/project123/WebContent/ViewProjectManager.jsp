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
<h1><center>View All Project Manager</center></h1>
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th>ProjectManager_id</th>
<th>Username</th>
<th>Password</th>
<th>Mobile-Number</th>
<th>E-Mail</th>
<th>Birth Date</th>
<th>Join Date</th>
<th>Gender</th>
<th>Country</th>
<th>City</th> 
<th>Edit Records</th>   
</tr>

<s:iterator value="list">
<fieldset>
<tr>
<td><s:property value="project_manager_id"/></td>
<td><s:property value="name"/></td>
<td><s:property value="password"/></td>
<td><s:property value="mobile_number"/></td>
<td><s:property value="e_mail"/></td>
<td><s:property value="birth_date"/></td>
<td><s:property value="join_date"/></td>
<td><s:property value="gender"/></otd>
<td><s:property value="country"/></td>
<td><s:property value="city"/></td>
<td><a href="editContact.action?project_manager_id=<s:property value='project_manager_id'/>">Edit</a></td>

</tr>
</fieldset>
</s:iterator>
</table>
</body>
</html>