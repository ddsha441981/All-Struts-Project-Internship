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
width: 100%;
border-bottom-style: dashed;
}
</style>
</head>
<body>
<table class="colll" >

	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Room/Ward No.</th>
		<th>Sender Name</th>
		<th>Massage</th>
		
		
	</tr>

<s:iterator value="ag">
	<tr>
		<td><s:property value="gid"/></td>
		<td> <s:property value="gname"/></td>
		<td><s:property value="groom"/></td>
		<td> <s:property value="gsend"/></td>
		<td><s:property value="msg"/></td>
	</tr>
	</s:iterator>
</table> 
</body>
</html>