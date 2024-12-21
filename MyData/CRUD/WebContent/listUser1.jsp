<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="seed.pune.bean.UserBean1"%>
<%@ page import="seed.pune.dao.UserDao1"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User</title>
</head>
<body>
<%
	//UserBean user = new UserBean();
	UserDao1 dao = new UserDao1();
	List<UserBean1> userList = dao.getAllUsers();
	//Iterator<UserBean> itr = userList.iterator();
%>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Your Email</th>
		<th>Message</th>
	</tr>
	<tr>
		<%
			/*while(itr.hasNext())
			 {
			 System.out.println(user.getId());*/
			for (UserBean1 user : userList) {
		%>
		<td><%=user.getId()%></td>
		<td><%=user.getfName()%></td>
		<td><%=user.getlName()%></td>
		<td><%=user.getMessage() %>
		
		
		<td>
		<a href="UserHandler1?action=editform&userId=<%=user.getId()%>">Update</a></td>
		<td><a href="UserHandler1?action=delete&userId=<%=user.getId()%>">Delete</a></td>

	</tr>
	<%
		}
		//}
	%>
</table>
<p><a href="UserHandler1?action=insert">Add User</a></p>
</body>
</html>