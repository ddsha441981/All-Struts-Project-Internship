<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="simple"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Batch Details</title>
</head>
<body>
<h1>Add New Batches</h1>
<s:form action="create_batch" validate="true">
<s:textfield name="batch_id" label="Batch ID"></s:textfield>  
<s:textfield name="batch_name" label="Batch name"></s:textfield>  
<s:datetimepicker label="Start Date" displayFormat="dd-MM-yyyy" name="start_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker> 
<s:datetimepicker label="End Date" displayFormat="dd-MM-yyyy" name="end_date" adjustWeeks="true" toggleType="wipe"></s:datetimepicker>
<s:textfield name="technology" label="Technology"></s:textfield> 
 
<s:submit value="Create"></s:submit>  
</s:form> 

<s:form action="view_batch">
<s:submit value="View Batch"></s:submit>
</s:form>

<s:form action="backbatch">
<s:submit value="Back"></s:submit>  
</s:form> 
<%-- <s:form action="editbatch"> --%>
<%-- <s:submit value="Edit Batch"></s:submit> --%>
<%-- </s:form> --%>
</body>
</html>