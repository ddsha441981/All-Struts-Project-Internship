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
<h1 align="center"> User Registration Page </h1>
<fieldset>
	<legend>Sign Up</legend>
	<s:form action="page2" method="post">
	
		<s:textfield name="d1.user" label="Enter User Name" required="true"></s:textfield>
		<s:password name="d1.pwd" label="Enter Password" required="true"></s:password>
		<s:password name="d1.cpwd" label="Confirm Password" required="true"></s:password>
		<s:textfield name="d1.name" label="Enter Name" required="true"></s:textfield>
		<s:textfield name="d1.eid" label="Email Id" required="true"></s:textfield>
		<s:textfield name="d1.mno" label="Enter Mob" required="true"></s:textfield>
		<%-- <s:datetimepicker  name="d1.dob" label="Enter Dob" displayFormat="dd/mm/YYYY" required="true"></s:datetimepicker> --%>
		<s:textarea name="d1.addr" label="Address" cols="15" rows="5"></s:textarea>
		<s:file name="d1.img" label="User Upload Image"></s:file>
		<s:submit name="SignUp"></s:submit>
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