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

<s:a href="Bus.jsp"><input type="button" value="Bus"> </s:a>
<s:a href="Train.jsp"><input type="button" value="Train"> </s:a>
<s:a href="Flight.jsp"><input type="button" value="Flight"> </s:a>
</body>
</html>