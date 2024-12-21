<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.colll
{
background-color: pink;
border:1px;
width: 100%;
border-bottom-style: dashed;
}
</style>
</head>
<body>

<table class="colll">

	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
		<th>Mobile</th>
		<th>Gender</th>
		<th>City</th>
		<th>Admit Date</th>
		<th>Discharge Date</th>
		
	</tr>
	<s:iterator value="Padmit">
	<tr>
		<td><s:property value="Npid"/></td>
		<td><s:property value="Npname"/></td>
		<td><s:property value="Npemail"/></td>
		<td><s:property value="Npadd"/></td>
		<td><s:property value="Npno"/></td>
		<td><s:property value="Npgender"/></td>
		<td><s:property value="Npcity"/></td>
		<td><s:property value="Nadmit"/></td>
		<td><s:property value="Ndischarge"/><br></td>
	</tr>
	</s:iterator>
</table>



		
		
		
		
		
		
		
		
		


</body>
</html>