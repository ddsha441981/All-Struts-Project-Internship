<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="simple"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Exam</title>
</head>
<body>
<h1>Create Exam</h1>
<s:form action="Exam1">

<s:textfield name="exam_title" label="Exam Title"></s:textfield>
  
<s:textfield name="total_marks" label="Total Marks"></s:textfield>  

<s:submit value="Save"></s:submit>  
</s:form> 

<s:form action="backview">
<s:submit value="Back"></s:submit>  
</s:form> 
</body>
</html>