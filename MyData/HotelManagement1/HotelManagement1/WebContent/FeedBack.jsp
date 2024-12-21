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


<div>
<nav>
<s:a href="Welcome.jsp">Welcome</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Stay.jsp">Stay</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Eat_Drink.jsp">Eat and Drink</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Meet_Celebrate.jsp">Meet and celebrate</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Fitness.jsp">Fitness</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Spa.jsp">Spa</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Gallery.jsp">Gallery</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Contact.jsp">Contact Us</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="FeedBack.jsp">FeedBack</s:a>&nbsp;&nbsp;|&nbsp;&nbsp;
<s:a href="Reviews.jsp">Reviews</s:a>
</nav>
</div>
</body>
</html>