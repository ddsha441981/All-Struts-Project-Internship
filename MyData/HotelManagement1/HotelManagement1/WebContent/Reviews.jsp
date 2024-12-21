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
<img src="Images/review1.png"/>&nbsp;&nbsp;&nbsp;<img src="Images/review.jpg"/>
<p style="text-align: center;" id="p2">REVIEWS</p>


<s:form action="login5">
<s:submit value="See Reviews" align="center"></s:submit></s:form>

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