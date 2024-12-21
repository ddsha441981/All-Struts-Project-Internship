<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using Ajax and Jquery  Registeration</title>
<script src="assets/js/jquery.js"></script>
<script type="text/javascript">
function MyFormContents(){
alert("Hello My Method SuccessFully Executed");
 var name =$('#name').val();
var password = $('#password').val();
var email = $('#email').val();
var age = $('#age').val();
var salary = $('#salary').val();

$.ajax({

data: "name="+name+ "password="+password+ "email="+email+ "age="+age+ "&salary="+salary,
type:"GET",
url:"${pageContext.request.contextPath}/ajaxJqueryForm",
success: function(response){

 $('#name').val('');
 $('#password').val('');
 $('#email').val('');
 $('#age').val('');
 $('#salary').val('');
},
error: function(e){
alert('Error' +e);
}
});
}
</script>
</head>
<body>

Name :<input type="text" name="name" id="name"><br><br>
Password :<input type="password" name="password" id="password"><br>
Email :<input type="text" name="email" id="email"><br>
Age :<input type="text" name="age" id="age"><br>
salary :<input type="text" name="salary" id="salary"><br>

<input type="submit" onclick="MyFormContents()">

</body>
</html>