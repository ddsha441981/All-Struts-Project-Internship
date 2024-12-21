<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/default.css" type="text/css" rel="stylesheet">
<%@taglib uri="/struts-tags" prefix="s" %>
<%request.getSession();
String n=(String)session.getAttribute("uname");
	System.out.println(n);%>
<title>Form</title>
</head>
<body><table align="center">
		<tr>
			<td><img alt="logo" src="images/Logo.gif" height="100"
				width="200"></td>
			<td><h1>Forum</h1></td>

			<td><input type="button" value="Logout" onclick="location.href='HomePage.jsp'"></td>
		</tr>

	</table>
	<div>
		<ul>
			<li><a href="Forum.jsp">Forum</a></li>
			<li><a href="ChangePassword.jsp">Change Password</a></li>
			<li><a href="ProfileDetails.jsp">Profile Details</a></li>
	
		</ul>
	</div>
	<hr>
	
	<table width="80%" border="0" align="center">
		<tbody><tr>
				<td colspan="2" align="right">
				<b><font color="red">[ All fields are mandatory ]</font></b> 
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><font color="blue" size="+2"><b>
							Forum</b> </font> <br> <br>
				</td>
			</tr>
			<tr>
				<td width="15%" align="right"><b>Name :</b>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>
				<br><br>
				</td>
			</tr>
			
			<tr>
				<td width="15%" align="right"><b>Your Questions :</b>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td><textarea name="message" rows="3" cols="30"></textarea>
				<br><br>
				</td>
			</tr>
			<tr>
				<td width="15%" align="right"><b>Your Answer :</b>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>
				<br><br>
				</td>
			</tr>
			
				<td width="30%">&nbsp;</td>
				<td><input type="submit" value="submit">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="Reset">
					<br><br>
					</td>
			</tr>
					</tbody></table>
	

</body>
</html>