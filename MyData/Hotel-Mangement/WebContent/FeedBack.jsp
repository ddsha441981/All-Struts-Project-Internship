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

<p style="text-align: center;" id="p2">FeedBack_Form</p>
<img src="Images/feed2.jpg"/>&nbsp;&nbsp;<img src="Images/review1.png"/>
<br>
<h3 align="left">Send Us Your FeedBack</h3>
<s:form action="login1">
<s:textfield label="Full_Name" name="fulName"></s:textfield>
<br>
<s:textfield label="Email_Id" name="email"></s:textfield>
<br>
<s:textarea label="Comments" name="comments" rows="5" cols="20"></s:textarea>
<br>
<br>
<s:submit name="submit" value="Submit" align="left"></s:submit>

</s:form>


<%@ include file="footer.jsp" %>
</body>
</html>