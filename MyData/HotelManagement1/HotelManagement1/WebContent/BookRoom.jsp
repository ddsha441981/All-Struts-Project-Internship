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
<body bgcolor="orange">
<img src="Images/executive.jpg" width="1300" height="600"/>
<fieldset style="background-color: aqua;width: 600px">
<legend>Room Booking</legend>
<s:form action="login"> 
<s:textfield label="Guest Name" name="userName"></s:textfield>
<s:textfield label="Mobile Number" name="text2"></s:textfield>
<s:textfield label="Number of Members" name="text3"></s:textfield>
<s:textfield label="Number of Rooms" name="text4"></s:textfield>
<s:datetimepicker label="Check-in Date" name="chkin" adjustWeeks="true" displayFormat="dd MMMM,yyyy" toggleType="wipe"/>
<s:datetimepicker label="Check-out Date" name="chkout" adjustWeeks="true" displayFormat="dd MMMM,yyyy" toggleType="wipe"/>
<s:submit value="Book this Room" align="center"></s:submit>
</s:form>
</fieldset>

</body>
</html>