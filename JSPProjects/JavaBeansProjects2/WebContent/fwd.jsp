<%@page import="com.sun.xml.internal.ws.api.ha.StickyFeature"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" buffer="8kb" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bala" scope="page" class="com.DataOfLogin.Frd"></jsp:useBean>
<jsp:setProperty property="*" name="bala"/>

<%-- <jsp:getProperty property="fname" name="bala"/> --%>
<jsp:getProperty property="lname" name="bala"/>
<jsp:getProperty property="eid" name="bala"/>
<jsp:getProperty property="mno" name="bala"/>
<jsp:getProperty property="pwd" name="bala"/>
<jsp:getProperty property="cpwd" name="bala"/>

<% String d1 = new Date().toString();
	out.print("Todays Date is :" +d1);
%>
</body>
</html>