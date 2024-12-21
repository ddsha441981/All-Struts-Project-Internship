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

<h1>Add New Projects</h1>

    <s:form action="add_projects" validate="true">
	<s:textfield name="project_id" label="Project ID"></s:textfield>
	<s:textfield name="project_name" label="Project Name"></s:textfield>
	<s:submit value="Create"></s:submit>  
    </s:form>
    
<s:form action="view_project">
<s:submit value="View All Project"></s:submit>
</s:form>

<s:form action="backprojects">
<s:submit value="Back"></s:submit>  
</s:form> 

</body>
</html>