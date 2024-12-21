<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<!-- <script type="text/javascript">
function loginValidate(){
alert("Hello sir");

		if(emailAddress()){
		 return true;
		}
		else{
		return false;
		}
		
		
		function emailAddress()
  	{
  	var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if(x=="")
    {
    	document.getElementById("emailError").innerHTML="Email must not be empty";
    	
    	return false;
    }
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
    	document.getElementById("email").focus();
        document.getElementById("emailError").innerHTML="Enter a email followed by @";
        
        return false;
    }
    else{
    	document.getElementById("emailError").innerHTML="<span class='glyphicon glyphicon-ok'></span>";
    	return true;
    }
  	
  	}

}
</script> -->
</head>
<body>
<center>
	<h1>WelCome Page</h1>
	
	<form:form action="${pageContext.request.contextPath}/loginRedirectPage" name="myForm" modelAttribute="loginBeans" method="get" onsubmit ="return loginValidate()">
			
			<form:label path="userRole">Select UserRole :</form:label>
			 <form:select path="userRole">
			<form:option value="select role">Select Role</form:option>
			<form:option value="admin">Admin</form:option>
			<form:option value="user">User</form:option>
			</form:select>
			<br><br>
			<form:label path="email">Email:</form:label>
			<form:input  path="email" placeholder="Enter Email" type="text" id="email"/> <br>
			<form:errors path="email" id="emailError"></form:errors>
			
			<br>
			<form:label path="autoPassword">Password:</form:label> 
			<form:input  path="autoPassword" placeholder="Enter Password" type="password" id="password"/> 
			<form:errors path="autoPassword"> </form:errors><br>
			<input type="submit">
			
	</form:form>
	
	<br><br>
	<a href="userRegister">Not Register ?</a>
	<br><br>
	
	<a href="forgetPasswordUser">Forgot Password ?</a>
	
</center>
</body>
</html>