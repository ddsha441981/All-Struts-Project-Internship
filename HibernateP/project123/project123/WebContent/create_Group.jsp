<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<h1>Add New Groups</h1>
    <s:form action="creategroup" validate="true">
	<s:textfield name="group_id" label="Group ID"></s:textfield>
	<s:textfield name="intern_id" label="Intern ID"></s:textfield>
	<s:textfield name="project_name" label="Project Name"></s:textfield>
	<s:submit value="Create"></s:submit>  
    </s:form>
<s:form action="view_all_group">
<s:submit value="View All Groups"></s:submit>
</s:form>
    <s:form action="backgroup">
<s:submit value="Back"></s:submit>  
</s:form> 
</body>
</html>