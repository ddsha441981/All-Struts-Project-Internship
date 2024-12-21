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
<%@ include file="header.jsp" %>

<img src="Images/meet.jpg" width="1300" height="600"/>
<p style="text-align: center;" id="p2">MEETINGS AND CELEBRATIONS</p>
<p style="text-align: center;" id="p1">Whether you need quiet rooms to conduct meetings or conference rooms to hold board-meetings,the Jw Marriott Hotel Pune has all your business needs covered.The Hotel is well-equipped to host corporate as well as social& festive events. From theme to  catering to decoration,you can rely on our experienced staff to design  events that are as unique as you are.  </p>
<br><br><br> 
<s:form action="BookHall.jsp">
<s:submit value="Book now" align="center"></s:submit></s:form>
<br>
<%@ include file="footer.jsp" %>

</body>
</html>