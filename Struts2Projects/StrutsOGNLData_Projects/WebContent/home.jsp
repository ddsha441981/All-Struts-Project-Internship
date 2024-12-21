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
<h1>Hello This is HomePage</h1>
	<table border="1" bgcolor="pink">
		<tr>
			<th>UserName</th>
			<th>Password</th>
		</tr>
		
		<tr>
			<td><s:property value="#session.username"/></td>
			<td><s:property value="#session.password"/></td>
		</tr>
	</table>
	<!-- ******************************************************************************************************************************* -->	
	<h1>Using  Set Tag </h1>
	<table border="1" bgcolor="pink">
		<tr>
			<th>UserName</th>
			<th>Password</th>
		</tr>
		
		<tr>
			<td><s:set name="uu" value="#session.username"/>
			<s:property value="#uu"/></td>
			<td><s:set name="pp" value="#session.password"/>
			<s:property value="#pp"/></td>
		</tr>
	</table>
	<!-- ******************************************************************************************************************************* -->	
	<h1>Using  Push Tag </h1>
	<table border="1" bgcolor="pink">
		<tr>
			<th>UserName</th>
			<th>Password</th>
		</tr>
		
		<tr>
			<td>
			<s:push value="bdata.user">
			<s:property value="user"/>
			
			</s:push>
			</td>
			<%-- <td><s:set name="pp" value="#session.password"/>
			<s:property value="#pp"/></td> --%>
		</tr>
	</table>
</body>
</html>