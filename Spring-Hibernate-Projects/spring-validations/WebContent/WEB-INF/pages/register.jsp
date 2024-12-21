<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<style type="text/css">
.clor{
border: 2px solid #45679;
border-radius: 10px;
height: 22px;
width: 230px; 
}
.error{
color: red;
}
</style>
 <!-- <script src="assests/js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
	alert("Hello")
	});
</script> -->
</head>
<body>
<center>
		<fieldset>
				<legend>Register Form</legend>
				<form:form action="formSubmit" method="post" modelAttribute="beansclass">
					UserName:- <form:input path="username" class="clor"/><br><br>
					<form:errors path="username"  class="error"></form:errors><br><br>
					Password:- <form:input path="password" class="clor"/><br><br>
					<form:errors path="password" class="error"></form:errors><br><br>
					Email:- <form:input path="email" class="clor"/><br><br>
					<form:errors path="email"  class="error"></form:errors><br><br>
					<input type="submit">
					</form:form>
		</fieldset>
</center>
</body>
</html>