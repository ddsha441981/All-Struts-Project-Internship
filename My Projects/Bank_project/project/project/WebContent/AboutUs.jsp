<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AboutUs pag</title>
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
</head>
<body>
<table>
<tr><td><img alt="logo" src="images/Logo.gif" height="100" width="200"></td>
<td><h1>Welcome to E-Medical and Medicated Services</h1></td></tr>

<tr><td>
<ul>
<li><a href="HomePage.jsp">Home</a></li>
<li><a href="AboutUs.jsp">About Us</a></li>
<li><a href="ContactUs.jsp">Contact Us</a></li>
<li><a href="Help.jsp">help</a></li>
<li><a href="feedback.jsp">FeedBack</a></li>
</ul></td>
<td>
<div align="right">
<s:form action="mylogin" method="post">
<s:textfield name="uname" label="Enter Name"></s:textfield>
<s:password name="upass" label="Enter Password"></s:password>
<s:submit value="Submit"></s:submit>
<s:a href="Registration.jsp"><b>New User</b></s:a>
</s:form>
</div></td></tr>
</table>


<center><h2>About E Medical Services</h2></center>
<p>The goal of this website is to develop a system which is useful in the emergency situations effectively. </p>
<p>It involves the detailed study of the symptoms of the disease and its severity. 
This is not merely based on the theoretical knowledge of medicine but is performed under the esteem supervision of highly experience doctors from all the fields of medicine. </p>

<p>This includes the symptoms,  videos, and the patients which help in diagnosing the disease. 
This is mainly intended to provide first-aid for the persons before they could be taken to the doctor and also helps a lot during the natural calamities where it's very difficult to provide direct medical assistance to the affected people. 
This includes the names of the medicines for cure of common diseases.	</p>

<p>This system also provides various categories such as Ayurvedic , 
Allopathy, Homeopathy etc where in so that users can search according to their interest. 
This system also provides a forum for Junior and Senior level doctors where we can have registered and non registered users.
Doctors can post queries and get responses.</p>

</body>
</html>