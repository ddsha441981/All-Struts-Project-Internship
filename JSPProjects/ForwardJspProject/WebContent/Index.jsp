<%@page import="org.omg.PortableInterceptor.ForwardRequest"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" buffer="8kb"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>This is Simple Page</p>
<!-- Date<input type="text" name="date">
<input type="submit"> -->
<jsp:forward page ="ForwardJsp.jsp" />

</body>
</html>