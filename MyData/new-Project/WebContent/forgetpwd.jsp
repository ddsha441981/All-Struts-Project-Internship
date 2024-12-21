<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="css/mystyle.css" />
<style>
.im{
background-image: url("style/pic3.jpg");
}
</style>
</head>
<body class="im"> 
<div align="right">
<table>
	<tr>
		<td><a href="Login.jsp"><img src="style/1477051225_door_in.png"><p>Login</p></a></td>
		<td><a href="UserRegisteration.jsp"><img src="style/1477051264_Application.png" width="35" height="35"><p>Register</p></a></td>
	</tr>
	
</table>
<hr class="padd"></div>
<div class="loginform">  
<h3 class="formheading">Change Password</h3>  
<s:form action="adminchange" method="post">
	<table>
		<tr>
			<!-- <td>Email</td> -->
			<td><s:textfield name="email" label="Enter Email" cssClass="tb5"></s:textfield></td>
		</tr>
		
		<tr>
			<!-- <td>Password</td> -->
			<td><s:password name="pwd" label="Old Password"  cssClass="tb5"></s:password></td>
		</tr>
		
		<tr>
			<!-- <td>Password</td> -->
			<td><s:password name="newpwd" label="New Password" cssClass="tb5"></s:password></td>
		</tr>
		
		<tr>
			<!-- <td>Password</td> -->
			<td><s:password name="conpwd" label="Confirm Password" cssClass="tb5"></s:password></td>
		</tr>
		
		<tr>
			<td colspan="2" style="text-align:center"><s:submit id="sub"></s:submit></td>
		</tr>
		
	</table>
</s:form>
</div>
  
</body>
</html>