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

<img src="Images/eat.jpg" width="1300" height="600"/>
<p style="text-align: center;" id="p2"><p style="text-align: center;" id="p2">EAT AND DRINKS</p>
<p style="text-align: center;" id="p1">The JW Mariott Hotel Pune has some of the choicest traditional and internatonal cuisine offerings as well as healthy active foods.Giving you a selection of heartly sumptious food with wholesome healthy food to keep you fit on your trip.And in case you a midnight craving,dont worry our kitchen remains open 24/7 to offer you complete flexibility in your time table......</h3></center></p><br>
<br>
<br>
<br>
<s:form action="BookTable.jsp" >
<s:submit value="Book this" align="center"></s:submit></s:form>
<br>
<br>
<br>
<%@ include file="footer.jsp" %>
</body> 
</html> 