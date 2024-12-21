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
<fieldset>
<legend>Login Page</legend>
<s:form action="page1" method="post">
	<s:textfield name="d1.user" label="Enter User Name" required="true"></s:textfield>
	<s:password label="Enter Password" name="d1.pwd" required="true"></s:password>
	<s:submit name="Login"></s:submit>
	<s:reset></s:reset>
</s:form>
</fieldset>
<table>
<tr>
	<th>||<a href="Home.jsp">Home||</a></th>
	<th>||<a href="Home.jsp">Back||</a></th>
	<th>||<a href="addmore.jsp">Add More||</a></th>
</tr>
</table>
</body>
</html>