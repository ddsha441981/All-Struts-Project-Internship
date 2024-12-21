<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    <%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sx:head/>
</head>
<body>
<center>
<s:form action="register">
	<s:textfield label="Enter Name :"  name="name"></s:textfield> <br><br>
	<s:textfield label="Enter Contact :"  name="contact"></s:textfield> <br><br>
	<s:textfield label="Enter Email :"  name="email"></s:textfield> <br><br>
	<s:textfield label="Enter Password :"  name="password"></s:textfield> <br><br>
	<sx:datetimepicker label="Select DOJ : " name="doj" displayFormat="dd/MM/yyyy" value="%{'today'}"></sx:datetimepicker>
	<s:submit value="Save"></s:submit>
</s:form>

</center>
</body>
</html>