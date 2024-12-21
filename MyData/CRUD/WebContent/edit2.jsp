<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="seed.pune.bean.UserBean2"%>
<%@ page import="seed.pune.dao.UserDao2"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<%
	UserBean2 user = new UserBean2();
%>
<%
	UserDao2 dao = new UserDao2();
%>
<form method="POST" action='UserHandler2' name="frmEditUser"><input
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
		<td><input type="textarea" name="dob" value="<%=user.getDob()%>"/></td>
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