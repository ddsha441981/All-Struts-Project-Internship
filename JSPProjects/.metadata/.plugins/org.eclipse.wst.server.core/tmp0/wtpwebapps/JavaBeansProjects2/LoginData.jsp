<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" session="true" buffer="8kb"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String d1 = new Date().toString();
	out.print("Todays Date is :"+d1);
%>
<jsp:useBean id="login" class="com.DataOfLogin.DataofLog" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="login"/>

<jsp:getProperty property="user" name="login"/>
<jsp:getProperty property="pwd" name="login"/>
<a href="forwd.html">Sign Up</a>
</body>
</html>