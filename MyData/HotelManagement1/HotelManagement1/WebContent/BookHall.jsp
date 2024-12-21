<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="/struts-tags" prefix="s"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<s:head theme="simple"/>
</head>
<body>
<img src="Images/hall.jpg" width="1300" height="600"/>
<fieldset style="background-color: aqua;width: 800px" >
<legend>Hall Booking</legend>
<s:form action="login2">
<s:textfield label="Guest Name" name="text1"></s:textfield>
<s:textfield label="Mobile Number" name="text2"></s:textfield>
<s:select headerKey="-1" headerValue="---select---" name="select1" list="{'Birthday','Wedding','Reception','Meeting & Conferences','party','Other'}" label="Select Occassion"></s:select>
<s:radio name="radio" list="{'Morning','Afternoon','Night'}" label="Timing"></s:radio>
<s:datetimepicker label="Date" name="date1" />
<s:submit value="Book Hall" align="center"></s:submit>
</s:form>
</fieldset> 
</body>
</html>