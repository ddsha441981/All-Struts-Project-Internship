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
<table align=center border="8" bordercolor=black style="background-color:lightgreen">
<tr>
<th>Intern ID</th>
<th>Intern Name</th>

<s:form action="download_resume">
<s:submit value="Download Resume"></s:submit>
</s:form>
<s:form action="view_resume">
<s:submit value="View Resume"></s:submit>  
</s:form> 
</tr>
</body>
</html>