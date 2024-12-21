<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<script type="text/javascript">


</script>
</head>
<body>
<center>
<hr>
<h4>Welcome to Register Page</h4>
<hr>

<script>  
function validate(){  
var name=document.f1.name.value;  
var password=document.f1.password.value;  
var status=false;  
  
if(name.length<1){  
document.getElementById("nameloc").innerHTML=  
" <img src='images/qubodup_Cubikopp_smilies_7.png-c200'/> Please enter your name";  
status=false;  
}else{  
document.getElementById("nameloc").innerHTML=" <img src='images/checked-checkbox-512.gif'/>";  
status=true;  
}  
if(password.length<6){  
document.getElementById("passwordloc").innerHTML=  
" <img src='unchecked.gif'/> Password must be at least 6 char long";  
status=false;  
}else{  
document.getElementById("passwordloc").innerHTML=" <img src='checked.gif'/>";  
}  
return status;  
}  
</script>  
  
<form name="f1" action="#" onsubmit="return validate()">  
<table>  
<tr><td>Enter Name:</td><td><input type="text" name="name"/>  
<span id="nameloc"></span></td></tr>  
<tr><td>Enter Password:</td><td><input type="password" name="password"/>  
<span id="passwordloc"></span></td></tr>  
<tr><td colspan="2"><input type="submit" value="register"/></td></tr>  
</table>  
	<!-- User Name : <input type="text" name="userName" id="userName" onblur="userNameValidate()"><br> -->
	<!-- Password : <input type="text" name="password" id="password" onblur="passwordValidate()"><br> -->
	<!-- Gander : <input type="radio" name="gender" value="Male" id="gender">
	<input type="radio" name="gender" value="FeMale"><br>
	City : <select name="city" id="city">
		<option>Pune</option>
		<option>Jaipur</option>
		<option>Gujrat</option>
		<option>Delhi</option>
		<option>Baroda</option>
		<option>Chenai</option>
		<option>Banlore</option>
	</select> -->
	<br>
	<!-- <input type="submit" value="Register"> -->
</form>
</center>
</body>
</html>