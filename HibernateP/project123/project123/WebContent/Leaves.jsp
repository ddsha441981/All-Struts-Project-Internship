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
<h1>Leaves For Interns</h1>
<s:form action="leave">
<s:textfield name="leave_id" label="Leave ID"></s:textfield>  
<s:textfield name="reason" label="Reason"></s:textfield>  
<s:datetimepicker label="To" displayFormat="dd-MM-yyyy" name="to_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker> 
<s:datetimepicker label="From" displayFormat="dd-MM-yyyy" name="from_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker>
<s:radio label="Leaves" id="radiobutton" name="leave" title="Full Day" list="#{'Full Day' : 'Full Day'}"/>
<s:radio id="radiobutton" name="leave" title="Half Day" list="#{ 'Half Day' : 'Half Day'}"/> 
<s:submit value="Submit"></s:submit>  
</s:form> 
</body>
</html>