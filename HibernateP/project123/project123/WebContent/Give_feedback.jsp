<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="simple"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Feedback Form</h1>
<s:form action="f" validate="true">
<s:textfield name="intern_id" label="Intern ID"></s:textfield>  
<s:textfield name="interns_name" label="Interns name"></s:textfield> 
<s:textfield name="e_mail_id" label="E-Mail ID"></s:textfield>  
<s:datetimepicker label="Current Date" displayFormat="dd-MM-yyyy" name="current_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker>
<s:textarea label="Feedback" name="feedback"></s:textarea>
<s:submit value="Submit"></s:submit>  
</s:form> 
</body>
</html>
