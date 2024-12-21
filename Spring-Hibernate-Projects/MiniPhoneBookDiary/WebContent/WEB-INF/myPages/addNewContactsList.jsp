<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="assets/jquery-3.1.1.min.js"></script>
<title>User Contact</title>

<!-- <script type="text/javascript">
$(document).ready(function(){

var first =$(#firstName).val();
var last =$(#lastName).val();
var email =$(#email).val();
var mobNo =$(#mobNo).val();
alert(first+last+email+mobNo);
$.ajax({
	
	url:'contactSave',
	type:'get',
	data:{
			'firstName':first,
			'lastName':last,
			'email':email,
			'mobNo':mobNo
			},
			success:function(data){
			alert("successfully done");
			},
			error:function(){
			alert("Error");
			}
});

});
</script> -->
</head>
<body>
<center>
<h1>User Contact Details</h1>
<form:form modelAttribute="contactUserBeans" action="contactSave" method="get">
		
		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName" type="text" placeholder="Enter First Name" id="firstName"/>
		<form:errors path="firstName"></form:errors><br><br>
		
		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName" type="text" placeholder="Enter Last Name" id="lastName"/>
		<form:errors path="lastName"></form:errors><br><br>
		
		<form:label path="email">Email Id</form:label>
		<form:input path="email" type="text" placeholder="Enter Email Id" id="email"/>
		<form:errors path="email"></form:errors><br><br>
		
		<form:label path="mobNo">Mobile No.</form:label>
		<form:input path="mobNo" type="text" placeholder="Enter Mobile Number" id="mobNo"/>
		<form:errors path="mobNo"></form:errors><br><br>
		
		<input type="submit">
</form:form>
</center>

<center>
<h1>Contact List</h1>
<%-- ${contactList.contactId} --%>
<table bgcolor="pink" border="1">
	<tr>
		<th>Contact Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email Id</th>
		<th>Mobile No</th>
		<th>UserId</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach  items="${contactList}" var="contactList">
	<tr>
	
		<td>${contactList.contactId}</td>
		<td>${contactList.firstName}</td>
		<td>${contactList.lastName}</td>
		<td>${contactList.email}</td>
		<td>${contactList.mobNo}</td>
		<td>${contactList.userId}</td>
		<td><a href="contactEditById/${contactList.contactId}">Edit</a></td>
		<td><a href="contactDeleteById/${contactList.contactId}">Delete</a></td>
		
	</tr>
	</c:forEach>
</table>
</center>

</body>
</html>