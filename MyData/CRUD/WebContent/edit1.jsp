<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="seed.pune.bean.UserBean1"%>
<%@ page import="seed.pune.dao.UserDao1"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
<script type="text/javascript">


function validate()
{

   if( document.myForm.userID.value == "" )
   {
      alert( "Please provide your name!" );
      document.myForm.userID.focus() ;
      return false;
   }
}






</script>
</head>
<body>
<%
	UserBean1 user = new UserBean1();
%>
<%
	UserDao1 dao = new UserDao1();
%>
<form method="POST" action='UserHandler1' name="frmEditUser"><input
	type="hidden" name="action" value="edit" /> <%
 	String uid = request.getParameter("userId");
 	if (!((uid) == null)) {
 		int id = Integer.parseInt(uid);
 		user = dao.getUserById(id);
 %>
 

<table>
	<tr>
		<td>User ID</td>
		<td><input type="text" name="userId" readonly="readonly"
			value="<%=user.getId()%>"></td>
	</tr>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="firstName" value="<%=user.getfName()%>"/></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="lastName" value="<%=user.getlName()%>"/></td>
	</tr>
	
	<tr>
		<td>Message</td>
		<td><input type="text" name="message" value="<%=user.getMessage()%>"/></td>
	</tr>
	
	
	<tr>
		<td></td>
		<td><input type="submit" value="Update" /></td>
	</tr>
</table>
<%
	} else
		out.println("ID Not Found");
%>
</form>
</body>
</html>