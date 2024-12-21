<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="/struts-tags" prefix="s" %>
</head>
<body>
<div align="right">
<a href="Login.jsp"><input type="button" value="logout"></a><br/>
welcome:<s:property value="username"/>
<hr>
</div>
<s:form action="bus">
<s:select name="source" label="Source" list="{'Pune','Kolhapur','Mumbai','Belgaon','Banglore','Panjim','Hyderabad','Indore','Ahemadabad','Nagpur'}" value="Select"></s:select><br>
<s:select name="destination" label="Destination" list="{'Pune','Kolhapur','Mumbai','Belgaon','Banglore','Panjim','Hyderabad','Indore','Ahemadabad','Nagpur'}" value="Select"></s:select><br>
<s:textfield label="Date Of Journey" name="jdate"></s:textfield><br>
<s:submit value="Search Bus"></s:submit>
</s:form>
</body>
</html>