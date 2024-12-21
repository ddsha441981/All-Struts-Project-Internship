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
<h2>Group Leader Information</h2>
    <s:form action="createGL" validate="true">
	<s:textfield name="batch_id" label="Batch ID"></s:textfield>
	<s:textfield name="intern_id" label="Intern ID"></s:textfield>
	<s:textfield name="group_id" label="Group ID"></s:textfield>
	<s:textfield name="username" label="Username"></s:textfield>
	<s:password name="password" label="Password"></s:password>
	<s:submit value="Create"></s:submit> </s:form>
	
<s:form action="viewGL">
<s:submit value="View All Group Leaders"></s:submit>
</s:form>
<s:form action="backGL1">
<s:submit value="Back"></s:submit>  
</s:form> 
</body>
</html>