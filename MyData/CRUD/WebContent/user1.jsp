<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New User</title>
<script type="text/javascript">
function validateform(){  
	var userid=document.frmAddUser.userid.value;  
	var firstName=document.frmAddUser.firstName.value;
	var lastName=document.frmAddUser.lastName.value;
	var message=document.frmAddUser.message.value;
	
	if(userid==null||userid=="")
		{
			alert("Enter any id number");
			return false;
		}else if(firstName==null|| firstName==""){
			alert("Name Can't blank");
			return false;
		}
		else if(lastName==null|| lastName==""){
			alert("last Name Can't blank");
			return false;
		}else if(tel==null|| tel==""){
			alert("Enter Mobile Number");
			return false;
		}else if(message==null|| email==""){
			alert("Please Enter message Can't blank");
			return false;
		}
}
</script>
</head>
<body>
<form method="POST" action='UserHandler1' name="frmAddUser" onsubmit="return validateform();">
<input type="hidden" name="action" value="insert" />
<p><b>Add New Record</b></p>
<table>
	<tr>
		<td>User ID</td>
		<td><input type="text" name="userid" /></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><input type="text" name="firstName" /></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="lastName" /></td>
	</tr>
	
	
	<tr>
		<td>Message</td>
		<td><input type="texarea" name="message" /></td>
	</tr>
	
	
	<tr>
		<td></td>
		<td><input type="submit" value="Submit" /></td>
	</tr>
</table>
</form>
<p><a href="UserHandler1?action=listUser1">View-All-Records</a></p>
</body>
</html>