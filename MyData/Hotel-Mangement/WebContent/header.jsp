<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
a:link
{
	color: yellow;
	background-color: transparent;
	text-decoration: none;
}
a:hover
{
	color: white;
	background-color: blue;
}
.marquee 
{
	text-transform: uppercase;
	text-align: center;
	cursor: crosshair;
	background-color: silver;
	text-shadow: window;
	background-position: center;	
}
.textformat
{
	text-decoration: blink;
}
</style> 

</head>
<body>
<div>
<h1 align="center">JW MARIOTT HOTEL PUNE</h1>
<h3>
<marquee scrollamount="5" behavior="scroll" scrolldelay="2" onmouseover="stop();" onmouseout="start();" bgcolor="sky blue" class="marquee">Welcome to the Home Page of JW Mariott</marquee>

<s:a href="Home.jsp" >Home</s:a>&nbsp;
&nbsp;<s:a href="Welcome.jsp">Welcome</s:a>&nbsp;
&nbsp;<s:a href="Stay.jsp">Stay</s:a>&nbsp;
&nbsp;<s:a href="Eat_Drink.jsp">Eat and Drink</s:a>&nbsp;
&nbsp;<s:a href="Meet_Celebrate.jsp">Meet and celebrate</s:a>&nbsp;
&nbsp;<s:a href="Fitness.jsp">Fitness</s:a>&nbsp;
&nbsp;<s:a href="Spa.jsp">Spa</s:a>&nbsp;
&nbsp;<s:a href="Gallery.jsp">Gallery</s:a>&nbsp;
&nbsp;<s:a href="Contact.jsp">Contact Us</s:a>&nbsp;
&nbsp;<s:a href="FeedBack.jsp">FeedBack</s:a>
&nbsp;<s:a href="Reviews.jsp">Reviews</s:a>
</h3>

</div>
</body>
</html>