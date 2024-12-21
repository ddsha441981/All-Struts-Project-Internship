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
<body bgcolor="yellow">
<%@ include file="header.jsp" %>
<img src="Images/eat.jpg" width="1300" height="600"/>
<fieldset style="background-color: yellow;width: 600px">

<legend>Table Booking</legend>
<s:form action="login4">
<s:textfield label="Guest Name" name="text1"></s:textfield>
<s:textfield label="Mobile Number" name="text2"></s:textfield>
<s:textfield label="Number of Members" name="text3"></s:textfield>
<s:select  headerKey="-1" headerValue="---select--" name="select1" list="{'Brunch','Breakfast','Lunch','Dinner'}" label="Select Meal Type"></s:select>
<s:datetimepicker label="Date" name="date1" />

<s:submit value="submit"></s:submit>
</s:form>
</fieldset>
<%@ include file="footer.jsp" %>
</body>
</html>