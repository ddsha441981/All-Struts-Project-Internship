<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<%@ include file="header.jsp" %>

<h2 align="center">CONTACT_US</h2>
<img src="Images/contact.jpg"/>&nbsp;<img src="Images/contact-us1.jpg"/>
<br>
<h3 align="center">JW Mariott Hotel,Pune</h3>
Address : <s:text name="Address">Xion Complex,Wakad Road,hinjawadi,Pune-411057</s:text>
<br>
Email_id : <s:text name="Email_id">jw.sb@hotels.com</s:text>
<br>
Contact_no : <s:text name="Contact">+91 2066894040,+91 2078894040</s:text>
<%@ include file="footer.jsp" %>

</body>
</html>