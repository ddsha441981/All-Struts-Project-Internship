<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Project.css">
</head>
<body id="p3">

<body>
<%@ include file="header.jsp" %>
<img src="Images/spa.jpg" width="1300" height="600"/>
<p style="text-align: center;" id="p2">SPA</p>
<p style="text-align: center;" id="p1">From holistic treatments to scrubs, wraps & massages, the spa has a variety of signature experiences to choose from. They combine the essence of traditional wellness and therapeutic experiences, offered by professional therapists using exclusive natural products in a fresh and harmonious setting.  </p>
<br>
<br>
<s:form action="BookSpa.jsp">
<s:submit value="Book this" align="center"></s:submit></s:form>
<br>
<%@ include file="footer.jsp" %>
</body>
</html>