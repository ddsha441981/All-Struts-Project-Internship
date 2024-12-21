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
	var tel=document.frmAddUser.tel.value;
	var email=document.frmAddUser.email.value;
	if(userid==null||userid=="")
		{
			alert("Please select Hostel no");
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
		}else if(email==null|| email==""){
			alert("email Can't blank");
			return false;
		}
}



</script>
</head>
<body>
<form method="POST" action='UserHandler' name="frmAddUser" onsubmit="return validateform()">
	<input type="hidden" name="action" value="insert" />
<p><b>Add New Record</b></p>
<table>
	<tr>
		<td>User ID</td>
		<td><input type="text" name="userid" /></td>
	</tr>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="firstName" /></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="lastName" /></td>
	</tr>
	
	<tr>
		<td>Mobile</td>
		<td><input type="tel" name="tel" /></td>
	</tr>
	
	
	<tr>
		<td>Email</td>
		<td><input type="text" name="email" /></td>
	</tr>
	
	
	
	<tr>
	<td>Number Of Room</td>
 	<td><select  name="numberofrooms">
	<option value=1>Select Room</option>
  <option value="01">01</option>
  <option value="02">02</option>
  <option value="03">03</option>
  <option value="04">04</option>
  <option value="05">05</option>
  <option value="06">10</option>
  <option value="07">15</option>
  <option value="08">20</option>
  <option value="09">25</option>
  <option value="10">30</option>
  </select></td>
	</tr>
	
	
	
	<tr>
	<td> Two Member</td>
 	<td><select  name="twomember">
	<option value=1>Twomember</option>
  <option value="01">01</option>
  <option value="02">02</option>
  <option value="03">03</option>
  <option value="04">04</option>
  <option value="05">05</option>
  </select></td>
	</tr>
	
	
	

	
	
			<tr>
               <td >Three Member</td>
               <td>
                  <select name="threemember" >
                     <option value="-1" selected>threemember</option>
                     <option value="1">01</option>
                     <option value="2">02</option>
                     <option value="3">03</option>
                  </select>
               </td>
            </tr>

	
	
	
	<tr>
	<td>Mess</td>
 	<td>
 	<select  name="check1">
		<option value=1>Select</option>
 	 	<option value="01">Yes</option>
  		<option value="02">No</option>
	 </select>
	 </td>
	</tr>
	

	
	
	
	
	
	<tr>	
		<td> Library &nbsp;</td>
  <td><input type="checkbox" name="check2" value="Library"></td>
	</tr>
	
	
		<tr>
		<td>Jim &nbsp;</td>
  <td><input type="checkbox" name="check3" value="Jim"></td>
	</tr>
	
	
	
	<tr>
		<td></td>
		<td><input type="submit" value="Submit" /></td>
	</tr>
</table>
</form>
<p><a href="UserHandler?action=listUser">View-All-Records</a></p>
</body>
</html>