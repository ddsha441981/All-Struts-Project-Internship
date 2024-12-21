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
<img src="Images/meet.jpg" width="1300" height="600"/>
<p style="text-align: center;" id="p2">MEETINGS AND CELEBRATIONS</p>
<p style="text-align: center;" id="p1">Whether you need quiet rooms to conduct meetings or conference rooms to hold board-meetings,the Jw Marriott Hotel Pune has all your business needs covered.The Hotel is well-equipped to host corporate as well as social& festive events. From theme to  catering to decoration,you can rely on our experienced staff to design  events that are as unique as you are.  </p>
<br><br><br> 
<s:form action="BookHall.jsp">
<s:submit value="Book now" align="center"></s:submit></s:form>
<br>
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