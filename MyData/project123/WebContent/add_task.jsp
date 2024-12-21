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
<h1>Task Report</h1>
<fieldset>
<s:form action="task1">
<s:select name="intern_id" label="Interns ID" headerKey="" headerValue="Select Id" listKey="intern_id" listValue="intern_id" list="list3"/> 
<s:textfield name="actual_task" label="Actual Task"></s:textfield>  
<s:datetimepicker label="Start Date" displayFormat="dd-MM-yyyy" name="start_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker> 
<s:datetimepicker label="End Date" displayFormat="dd-MM-yyyy" name="end_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker>
<s:submit value="Add Task"></s:submit>  
</s:form> 
</fieldset>
</body>
</html>