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
<body bgcolor="orange">
<%@ include file="header.jsp" %>

<img src="Images/review1.png"/>&nbsp;&nbsp;&nbsp;<img src="Images/review.jpg"/>
<p style="text-align: center;" id="p2">REVIEWS</p>


<s:form action="login5">
<s:submit value="See Reviews" align="center"></s:submit></s:form>

<%@ include file="footer.jsp" %>
</body>
</html>