<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head theme="ajax" debug="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<h3 class="formheading"> WelCome to Register </h3>  
<s:form action="adminlog" method="post">
<table  align="center">
	<tr>
		<td><s:textfield label="First Name" name="fname" cssClass="tb5"></s:textfield></td>
	</tr>
	
	<tr>
		<td><s:textfield label="Last Name" name="lname" cssClass="tb5"></s:textfield></td>
	</tr>
	
	<tr>
		<td><s:textfield label="Email" name="email" cssClass="tb5"></s:textfield></td>
	</tr>
	
	<tr>
		<td><s:password label="Password" name="pwd" cssClass="tb5"></s:password></td>
	</tr>
	
	<tr>
		<td><s:password label="Confirm Password" name="cpwd" cssClass="tb5"></s:password></td>
	</tr>
	
	<tr>
		<td><s:textfield label="Mobile No" name="mbob" cssClass="tb5" ></s:textfield></td>
	</tr>
	
	<tr>
		<td><s:radio label="Choose Gender" name="gender" list="#{'Male':'Male','Female':'Female'}" value="not mentione" /></td>
	</tr>
	
	<tr>
		<td><s:datetimepicker label="Select Admit Date" name="nadmit" displayFormat="MM-dd-yy" required="true" cssClass="textboxis" /></td>
	</tr>
	<tr>
		<td><s:datetimepicker label="Select Discharge Date" name="ndischarge" displayFormat="MM-dd-yy" required="true" cssClass="textboxis" /></td>
	</tr> 
	<tr>
		<td colspan="2" style="text-align:center"><s:submit cssClass="sub"></s:submit></td>
	</tr>
</table>
</s:form>
</div>
</body>
</html>