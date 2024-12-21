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
<img src="Images/spa.jpg" width="1300" height="600"/>
<fieldset style="background-color: yellow;width: 800px" >
<legend>Room Booking</legend>
<s:form action="login3">
<s:textfield label="Guest Name" name="text1"></s:textfield>
<s:textfield label="Room Number" name="text2"></s:textfield>
<s:textfield label="Mobile Number" name="text3"></s:textfield>
<s:radio name="radio" list="{'Male','Female'}" label="Gender"></s:radio>
<s:checkboxlist name="checkbox" label="Select Spa Services" list="{'Threading','Waxing','Facial','Scrubbing','body Massage','Hair Cutting'}"></s:checkboxlist>
<s:datetimepicker label="Date" name="date1" />
<s:submit value="Book Spa Services" align="center"></s:submit>
</s:form>
</fieldset> 

<%@ include file="footer.jsp" %>
</body>
</html>