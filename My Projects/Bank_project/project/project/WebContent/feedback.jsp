<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<%@taglib uri="/struts-tags" prefix="s"%>
<title>feedback</title>
<%request.getSession();
String n=(String)session.getAttribute("uname");
	System.out.println(n);%>
</head>
<body>
<table><tr><td><img alt="logo" src="images/Logo.gif" height="100" width="200"></td>
<td><h1>Welcome to E-Medical and Medicated Services</h1></td></tr>

<tr>
<td>
<ul>
<li><a href="HomePage.jsp">Home</a></li>
<li><a href="AboutUs.jsp">About Us</a></li>
<li><a href="ContactUs.jsp">Contact Us</a></li>
<li><a href="Help.jsp">help</a></li>
<li><a href="feedback.jsp">FeedBack</a></li>
</ul></td>
<td></td></tr></table>
<form method="post" action="#" name="enquiryform" onsubmit="return validate1();">
		<table width="80%" border="0" align="center">
		<tbody><tr>
				<td colspan="2" align="right">
				<b><font color="red">[ All fields are mandatory ]</font></b> 
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><font color="blue" size="+2"><b>
							Feedback form</b> </font> <br> <br>
				</td>
			</tr>
			<tr>
				<td width="15%" align="right"><b>Name :</b>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="name" value="" size="35">
				<br><br>
				</td>
			</tr>
			<tr>
				<td width="15%" align="right"><b>Email Id :</b>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

				<td><input type="text" name="email" value="" size="35">
				<br><br>
				</td>
			</tr>
			<tr>
				<td width="15%" align="right"><b>Contact Number :</b>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

				<td><input type="text" name="contact" value="" size="35">
				<br><br>
				</td>
			</tr>
			<tr>
				<td width="15%" align="right"><b>Your Message :</b>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td><textarea name="message" rows="5" cols="50"></textarea>
				<br><br>
				</td>
			</tr>
			
			<tr>
				<td width="30%">&nbsp;</td>
				<td><input type="submit" value="submit">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="Reset">
					<br><br>
					</td>
			</tr>
			<tr>
				<td width="30%" colspan="2" align="center">
				<font color="red" size="+1"><b>This is chargeable service, We will contact you.</b></font>
				<br><br>
				</td>
				
			</tr>
		</tbody></table>

	</form>

</body>
</html>